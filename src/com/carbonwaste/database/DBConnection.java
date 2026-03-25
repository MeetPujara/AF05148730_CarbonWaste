package com.carbonwaste.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // Database credentials
    private static final String URL = ConfigLoader.get("DB_URL");
    private static final String USER = ConfigLoader.get("DB_USER");
    private static final String PASS = ConfigLoader.get("DB_PASS");

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check if MySQL is running.");
            e.printStackTrace();
        }
        return conn;
    }
}