package com.example.store.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {

    private static Connection connection = null;

    public  Connection getConnection() throws SQLException {

        if (connection != null) {
            return connection;
        }
        else {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://mysql.nethely.hu:3306/mytestdb?useSSL=false";
            String user = "mytestdb";
            String pass = "Cinci123#";

            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

}
