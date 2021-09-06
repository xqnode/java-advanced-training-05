package com.example.demo.jdbc;

import com.example.demo.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MyJdbc {
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/test";
    private static final String username = "root";
    private static final String password = "123456";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * insert
     */
    public static int insert(User user) {
        Connection connection = getConnection();

        String sql = "insert into user (`name`, age, address) values (?,?,?)";
        PreparedStatement preparedStatement;
        int i = 0;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setInt(2, user.getAge());
            preparedStatement.setString(3, user.getAddress());
            i = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    /**
     * update
     */
    public static int update(User user) {
        Connection connection = getConnection();

        String sql = "update user set `name` = ? where id = ?";
        PreparedStatement preparedStatement;
        int i = 0;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setInt(2, user.getId());
            i = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }


    /**
     * delete
     */
    public static int delete(int id) {
        Connection connection = getConnection();

        String sql = "delete from user where id = ?";
        PreparedStatement preparedStatement;
        int i = 0;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            i = preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    /**
     * select
     */
    public static List<User> selectAll(Connection connection) {
        List<User> userList = new ArrayList<>();
//        Connection connection = getConnection();

        // 可变Connection
        if(connection == null) {
            connection = getConnection();
        }

        String sql = "select * from user";
        Statement statement;
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getInt("age"));
                user.setAddress(rs.getString("address"));
                userList.add(user);
            }

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    /**
     * select
     */
    public static User selectByName(String name) {
        User user = null;
        Connection connection = getConnection();
        String sql = "select * from `user` where `name` = ?";
        PreparedStatement statement;
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getInt("age"));
                user.setAddress(rs.getString("address"));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    // Test
    public static void main(String[] args) {
        User user = new User();
        user.setName("王二");
        user.setAge(18);
        user.setAddress("上海");
        // insert
        int insert = insert(user);
        System.out.println("insert result is " + insert);

        // selectByName
        User wang = selectByName("王二");
        System.out.println("select wang: " + wang);
        wang.setName("李四");
        // update
        int update = update(wang);
        System.out.println("update result is " + update);

        // select
        List<User> users = selectAll(null);
        System.out.println("select all: " + users);

        // delete
        int delete = delete(wang.getId());
        System.out.println("delete result is " + delete);

        // select
        List<User> users1 = selectAll(null);
        System.out.println("select all: " + users1);
    }

}
