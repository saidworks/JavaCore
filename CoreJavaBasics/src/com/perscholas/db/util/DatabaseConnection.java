package com.perscholas.db.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
  
public class DatabaseConnection {
  
    private static Connection con = null;
  
    static
    {
        String url = "jdbc:mariadb:// localhost:1234/org";
        String user = "saidlearns";
        String pass = "mysql";
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection()
    {
        return con;
    }
}