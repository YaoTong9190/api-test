package com.example;
import java.sql.*;
import java.util.Properties;

public class MySQLtest {
    public static void main(String[] args) {
        // creates three different Connection objects
        Connection connection = null;


        try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/java_test";
            String user = "root";
            String password = "tongyao123";

            connection = DriverManager.getConnection(url1, user, password);
            if (connection != null) {
                System.out.println("Connected to the database java_test");
            }
            String sql = "SELECT * FROM java_test.name";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 1;
            while (result.next()) {
                String firstname = result.getString(1);
                String lastname = result.getString(2);
                System.out.println("id" + count + ":" + firstname + " " + lastname);
            }


        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    }
}
