package com.systechafrica.possysreview;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Logger;

public class LoginManager {
    private Scanner scanner = new Scanner(System.in);
    private static final Logger LOGGER = Logger.getLogger(LoginManager.class.getName());
    private PossysDataBase database;

    public LoginManager() {
        this.database = new PossysDataBase();
    }

    public UserAuthentication handleLogin() throws SQLException {
        boolean userLoggedIn = false;
        Connection connection = database.dbConnection();

        while (!userLoggedIn) {
            System.out.println("Welcome to POS System!");
            System.out.println("1. Admin Login");
            System.out.println("2. User Login");
            System.out.println("3. Quit");

            int loginOption = scanner.nextInt();
            scanner.nextLine();

            switch (loginOption) {
                case 1:
                    boolean adminLoggedIn = database.loginAuthentication(connection, "Admin1", "Admin123");
                    if (adminLoggedIn) {
                        LOGGER.info("Admin Logged in successfully!");
                        userLoggedIn = true;
                    } else {
                        LOGGER.warning("Admin could not log in.");
                    }
                    break;
                case 2:
                    System.out.print("Enter your username: ");
                    String inputUsername = scanner.nextLine();
                    System.out.print("Enter your password: ");
                    String inputPassword = scanner.nextLine();
                    boolean ordinaryUserLoggedIn = database.loginAuthentication(connection, inputUsername, inputPassword);
                    if (ordinaryUserLoggedIn) {
                        LOGGER.info("User login successful!");
                        userLoggedIn = true;
                    } else {
                        LOGGER.warning("Could not log in user! Try again");
                    }
                    break;
                case 3:
                    System.out.println("Exiting system.. ");
                    System.exit(0);
                    break;
                default:
                    LOGGER.warning("Invalid choice, select a valid choice");
                    break;
            }
        }
        return null;
    }
}
