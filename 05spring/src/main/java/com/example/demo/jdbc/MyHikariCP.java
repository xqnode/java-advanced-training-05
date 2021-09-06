package com.example.demo.jdbc;

import com.example.demo.model.User;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public class MyHikariCP {

    public static DataSource dataSource() {
        InputStream is = MyHikariCP.class.getClassLoader().getResourceAsStream("hikari.properties");
        // 加载属性文件并解析：
        Properties props = new Properties();
        try {
            props.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        HikariConfig hikariConfig = new HikariConfig(props);
        return new HikariDataSource(hikariConfig);
    }

    public static void main(String[] args) throws SQLException {
        // 测试使用连接池查询
        DataSource dataSource = dataSource();
//        System.out.println(dataSource);

        Connection connection = dataSource.getConnection();
        List<User> users = MyJdbc.selectAll(connection);
        System.out.println("select all: " + users);

    }
}
