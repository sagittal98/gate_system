package com.jyyd.gate.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class A {

    public static void main(String[] args) {
        /* 测试数据库连接是否OK */
        //加载驱动类
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://139.155.70.76:3306/jyyd_dzdb","root","root");
            System.out.println(conn);
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
