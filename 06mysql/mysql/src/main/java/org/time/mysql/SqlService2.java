package org.time.mysql;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SqlService2 {
    private static final ExecutorService POOL = Executors.newCachedThreadPool();
    private static final int ALL_COUNT = 100_0000;
    private static final int BATCH_COUNT = 5000;
    private static final CountDownLatch COUNT_DOWN_LATCH = new CountDownLatch(ALL_COUNT / BATCH_COUNT);


    private static final String URL = "jdbc:mysql://localhost:3306/time-mall?serverTimeZone=Asia/Shanghai";        //数据库地址
    private static final String USERNAME = "root";        //数据库用户名
    private static final String PASSWORD = "123456";        //数据库密码
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";


    public static void main(String[] args) {
        Connection conn = getConnection();

        String sqlPrefix = "insert into tm_order(id,name,order_no,user_id,total_price,discount_money,pay_money," +
                "trans_money,create_time,pay_time,is_delete) values ";
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate("delete from `tm_order`");
            statement.close();
            System.out.println("delete all data...");

            StringBuilder builder = new StringBuilder();
            PreparedStatement ps = conn.prepareStatement(sqlPrefix);
            LocalTime startTime = LocalTime.now();
            System.out.println("Start execute sql. startTime=" + startTime);


            for (int i = 1; i <= ALL_COUNT; i++) {
                String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                builder.append("(").append(i).append(",").append("'测试订单'").append(",").append("123456").append(",")
                        .append(1).append(",").append(1000).append(",").append(100).append(",").append(900).append(",")
                        .append(0).append(",").append("'" + date + "'").append(",").append("'" + date + "'").append(",")
                        .append(0).append(")").append(",");

                // 每1000条记录插入一次
                if (i % BATCH_COUNT == 0) {
                    String suffix = builder.substring(0, builder.lastIndexOf(","));
                    String sql = sqlPrefix + suffix;
                    // 开启多线程执行任务
                    POOL.execute(new SqlTask(sql, ps, BATCH_COUNT));
                    builder = new StringBuilder();
                }
            }

            COUNT_DOWN_LATCH.await();

            if (ALL_COUNT % BATCH_COUNT != 0) {
                String suffix = builder.substring(0, builder.lastIndexOf(","));
                String sql = sqlPrefix + suffix;
                ps.addBatch(sql);
                ps.executeBatch();
                ps.clearBatch();
                System.out.println("execute addition sql");
            }
            System.out.println("Done. DurationTime: " + Duration.between(startTime, LocalTime.now()).toMillis() + " ms");
            POOL.shutdown();
            close(conn, ps);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(DRIVER);  //加载数据库驱动
            try {
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);  //连接数据库
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(Connection conn, Statement statement) {
        try {
            if (conn != null) {
                conn.close();  //关闭数据库链接
            }
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static class SqlTask implements Runnable {
        private String sql;
        private PreparedStatement ps;
        private int count;

        public SqlTask(String sql, PreparedStatement ps, int count) {
            this.sql = sql;
            this.ps = ps;
            this.count = count;
        }

        @Override
        public void run() {
            LocalTime startTime = LocalTime.now();
            System.out.println("Thread " + Thread.currentThread().getName() + " Start execute sql. startTime=" + startTime);
            try {
                ps.addBatch(sql);
                ps.executeBatch();
                ps.clearBatch();
                System.out.println("insert" + count + "lines, durationTimeInMs："
                        + Duration.between(startTime, LocalTime.now()).toMillis());
                COUNT_DOWN_LATCH.countDown();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}


