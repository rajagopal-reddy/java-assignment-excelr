package com.excelr.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeJDBC {

        private static final String URL = "jdbc:mysql://localhost:3307/empdb";
        private static final String USER = "root";
        private static final String PASSWORD = "root";

        public static Connection getConnection() throws SQLException {
                try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                } catch (ClassNotFoundException e) {
                        throw new SQLException("MySQL JDBC driver not found.", e);
                }

                return DriverManager.getConnection(URL, USER, PASSWORD);
        }
}


