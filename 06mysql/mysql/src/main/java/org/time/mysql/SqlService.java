package org.time.mysql;

import java.math.BigDecimal;
import java.sql.*;
import java.time.Duration;
import java.time.LocalTime;

public class SqlService {
    private static final String URL = "jdbc:mysql://localhost:3306/time-mall?serverTimeZone=Asia/Shanghai";        //数据库地址
    private static final String USERNAME = "root";        //数据库用户名
    private static final String PASSWORD = "123456";        //数据库密码
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";


    public static void main(String[] args) {
        int count = 1;
        LocalTime startTime = LocalTime.now();
        System.out.println("Start execute sql. startTime=" + startTime);
        Connection conn = getConnection();

        String sql = "insert into tm_order(id,name,order_no,user_id,total_price,discount_money,pay_money," +
                "trans_money,create_time,pay_time,is_delete)  values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            for (int i = 1; i <= 1000000; i++) {
                ps.setInt(1, i);
                ps.setString(2, "测试订单");
                ps.setString(3, "123456");
                ps.setInt(4, 1);
                ps.setBigDecimal(5, BigDecimal.valueOf(1000));
                ps.setBigDecimal(6, BigDecimal.valueOf(100));
                ps.setBigDecimal(7, BigDecimal.valueOf(900));
                ps.setBigDecimal(8, BigDecimal.valueOf(0));
                ps.setTimestamp(9, new Timestamp(System.currentTimeMillis()));
                ps.setTimestamp(10, new Timestamp(System.currentTimeMillis()));
                ps.setInt(11, 0);

                ps.addBatch();

                // 每1000条记录插入一次
                if (i % 6000 == 0){
                    ps.executeBatch();
                    ps.clearBatch();
                    System.out.println("insert" + ( count++ * 6000) + "lines, durationTimeInMs："
                            + Duration.between(startTime, LocalTime.now()).toMillis());
                }

            }
            ps.executeBatch();
            ps.clearBatch();
            System.out.println("Done. DurationTime: " + Duration.between(startTime, LocalTime.now()).toMillis() + " ms");

            close(conn, ps);
        } catch (SQLException e) {
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
}
