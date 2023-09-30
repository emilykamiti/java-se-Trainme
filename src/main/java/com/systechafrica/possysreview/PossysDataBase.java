package com.systechafrica.possysreview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Logger;

public class PossysDataBase {
    private static final Logger LOGGER = Logger.getLogger(PossysDataBase.class.getName());
    private Scanner scanner = new Scanner(System.in);

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

    // Admin/users
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

    public void createUserTable(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            String createUserTable = "CREATE TABLE IF NOT EXISTS users(user_id INT AUTO_INCREMENT PRIMARY KEY, user_name VARCHAR(230) NOT NULL, user_password VARCHAR(250) NOT NULL) ENGINE=InnoDB;";
            int updateStatus = statement.executeUpdate(createUserTable);
            LOGGER.info("Table created successfully = " + updateStatus);
        } catch (SQLException e) {
            LOGGER.warning("Failed to create User: " + e.getMessage());
        }
    }

    public boolean SignUp(Connection connection) {
        try {
            System.out.println("Enter your user name:");
            String username = scanner.nextLine();

            System.out.println("Enter password");
            String password = scanner.next();

            String insertUser = "INSERT INTO users(user_name, user_password) VALUES (?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(insertUser);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                LOGGER.info("User successfully signed up");
                return true;
            } else {
                LOGGER.warning("User failed to sign up");
                return false;
            }
        } catch (SQLException e) {
            LOGGER.severe("Failed to sign up user: " + e.getMessage());
            return false;
        }
    }

    public UserAuthentication getUser(String inputUsername, String inputPassword, Connection connection) throws SQLException {
        String gettingUser = "SELECT * FROM users WHERE user_name = ? AND user_password = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(gettingUser);
        preparedStatement.setString(1, inputUsername);
        preparedStatement.setString(2, inputPassword);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            int id = resultSet.getInt("user_id");
            String username = resultSet.getString("user_name");
            String password = resultSet.getString("user_password");

            UserAuthentication userauthenticated = new UserAuthentication(id, username, password);
            return userauthenticated;
        } else {
            LOGGER.warning("Enter correct username and password: " + inputPassword);
            return null;
        }
    }

    public boolean loginAuthentication(Connection connection, String inputUsername, String inputPassword) throws SQLException {
        int loginTrials = 1;
        boolean loggedIn = false;

        while (loginTrials <= 3) {
            System.out.print("Enter your username: ");
            String username = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.next();
            scanner.nextLine();

            UserAuthentication user = getUser(inputUsername, inputPassword, connection);
            if (user != null) {
                loggedIn = true;
                break;
            } else {
                LOGGER.warning("Login failed for username: " + username);
                LOGGER.warning("Login failed for password: " + password);
                loginTrials++;
            }
        }
        if (!loggedIn) {
            LOGGER.warning("Login failed after 3 attempts");
        }
        return loggedIn;
    }
}
