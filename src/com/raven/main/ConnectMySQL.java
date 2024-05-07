/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author doanq
 */
public class ConnectMySQL {

    private static final String username = "root";
    private static final String password = "123456789";
    private static final String dataConn = "jdbc:mysql://localhost:3306/coffee_store_management";

    private static Connection sqlConn = null;

    public static Connection ConnectMySQL() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            System.out.println("Connected to the database");
            return sqlConn;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error connecting to the database: " + ex.getMessage());
            return null;
        }
    }

    public static void closeConnection() {
        try {
            if (sqlConn != null && !sqlConn.isClosed()) {
                sqlConn.close();
                System.out.println("Connection closed");
            }
        } catch (SQLException ex) {
            System.out.println("Error closing the connection: " + ex.getMessage());
        }
    }
}
