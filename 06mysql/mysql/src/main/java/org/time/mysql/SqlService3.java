package org.time.mysql;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SqlService3 {
    private static final ExecutorService POOL = Executors.newCachedThreadPool();
    private static final int ALL_COUNT = 100_0000;
    private static final int BATCH_COUNT = 10000;
    private static final CountDownLatch COUNT_DOWN_LATCH = new CountDownLatch(ALL_COUNT / BATCH_COUNT);


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
        try (InputStream is = SqlService3.class.getClassLoader().getResourceAsStream("hikari.properties")) {
            Properties props = new Properties();
            props.load(is);
            HikariConfig config = new HikariConfig(props);
            DataSource hikariDataSource = new HikariDataSource(config);
            conn = hikariDataSource.getConnection();
        } catch (Exception e) {
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


