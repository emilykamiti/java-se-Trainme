package com.systechafrica.part2.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.print.DocFlavor.URL;

public class MySqlDataAccess implements DataAccess {

    public MySqlDataAccess() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {

            System.out.println(e.getMessage());
        }

    }

    @Override
    public void close() {

    }

    @Override
    public Connection connect() {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydatabase",
                    "myuser",
                    "mysecretpassword");
            return connection;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public ResultSet executeQuery(String query) {
        try {
            Statement statement = connect().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            return resultSet;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public int executeUpdate(String query) {
        try {
            Statement statement = connect().createStatement();
            int numberofrecordsUpdated = statement.executeUpdate(query);
            return numberofrecordsUpdated;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

}
