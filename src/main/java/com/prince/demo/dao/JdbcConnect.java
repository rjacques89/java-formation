package com.prince.demo.dao;

import java.sql.*;

public class JdbcConnect {

    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/demo", "root", "mysql");
            System.out.println("Connetion OK!");
        } catch (Exception ex) {
            System.out.println("Connetion FAILED!");
            System.out.println(ex);
        }
        return conn;
    }

}
