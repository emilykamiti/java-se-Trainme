package com.systechafrica.possysreview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

public class PossysDataBase {
   private static final Logger LOGGER = Logger.getLogger(POSSalesSystem.class.getName());


    public Connection dbConnection() {
        try {
            String connectionUrl = "jdbc:mysql://localhost:3308/javase";
            String user = "javase";
            String password = "javase";
            Connection connection = DriverManager.getConnection(connectionUrl, user, password);
            return connection;
        } catch (SQLException e) {
            LOGGER.warning("Unable to connect to the database: " + e.getMessage());
            return null;
        }
    }

    // ADMIN
    public void createAdminUser(Connection connection, String adminUsername, String adminPassword) {
        try {
            String insertAdminUser = "INSERT INTO users(user_name, user_password) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertAdminUser);
            preparedStatement.setString(1, adminUsername);
            preparedStatement.setString(2, adminPassword);
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                LOGGER.info("Admin user created successfully");
            } else {
                LOGGER.warning("Admin user creation failed");
            }
        } catch (SQLException e) {
            LOGGER.severe("Cannot create admin user: " + e.getMessage());
        }
    }

    public boolean getUserByUsernameAndPassword(String inputUsername, String inputPassword, Connection connection)
            throws SQLException {
        String gettingUser = "SELECT * FROM users WHERE user_name = ? AND user_password = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(gettingUser);
        preparedStatement.setString(1, inputUsername);
        preparedStatement.setString(2, inputPassword);

        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet.next();
    }

    public boolean authenticateUser(Connection connection, String inputUsername, String inputPassword) {
        try {

            boolean userExists = getUserByUsernameAndPassword(inputUsername, inputPassword, connection);

            if (userExists) {
                LOGGER.info("Login successful for username: " + inputUsername);
                return true;
            } else {
                LOGGER.warning("Login failed for username: " + inputUsername);
                return false;
            }
        } catch (SQLException e) {
            LOGGER.severe("Error during user authentication: " + e.getMessage());
            return false;
        }
    }
}