package com.systechafrica.possysreview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
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

    public void initializeDatabase() {
        Connection connection = dbConnection();
        if (connection != null) {
            createUsersTable(connection);
            insertDefaultAdminUser(connection);
        } else {
            LOGGER.severe("Failed to establish a database connection for initialization.");
        }
    }

    private void createUsersTable(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            String createTableSQL = "CREATE TABLE IF NOT EXISTS users (id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "username VARCHAR(255) NOT NULL, password VARCHAR(255) NOT NULL, is_admin BOOLEAN NOT NULL)";
            statement.executeUpdate(createTableSQL);
        } catch (SQLException e) {
            LOGGER.warning("Error creating 'users' table: " + e.getMessage());
        }
    }

    private void insertDefaultAdminUser(Connection connection) {
        try {
            String insertSQL = "INSERT INTO users (username, password, is_admin) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setString(1, "Admin1");
            preparedStatement.setString(2, "Admin123");
            preparedStatement.setBoolean(3, true);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.warning("Error inserting default admin user: " + e.getMessage());
        }
    }

    public boolean isAdmin(Connection connection, String username, String password) {
        try {
            String query = "SELECT * FROM users WHERE username = ? AND password = ? AND is_admin = 1";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            return preparedStatement.executeQuery().next();
        } catch (SQLException e) {
            LOGGER.warning("Admin authentication error: " + e.getMessage());
            return false;
        }
    }

    public boolean authenticateUser(Connection connection, String username, String password) {
        try {
            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            return preparedStatement.executeQuery().next();
        } catch (SQLException e) {
            LOGGER.warning("Authentication error: " + e.getMessage());
            return false;
        }
    }

    public boolean createUser(Connection connection, String username, String password) {
        try {
            String query = "INSERT INTO users (username, password) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            LOGGER.warning("User creation error: " + e.getMessage());
            return false;
        }
    }
}
