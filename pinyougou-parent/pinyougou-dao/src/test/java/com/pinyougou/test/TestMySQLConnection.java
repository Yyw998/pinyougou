package com.pinyougou.test;

import org.junit.Test;

import java.sql.*;

public class TestMySQLConnection {

    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");//加载数据库驱动
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testMySQLConnection() {
        Connection conn = getConn();
        try {
            Statement statement = conn.createStatement();
            String sql = "SELECT * FROM tb_brand";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.print(resultSet.getDate(0));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConn(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pinyougoudb?characterEncoding=utf-8", "root","1234qwer");//连接数据库
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return conn;
    }

}
