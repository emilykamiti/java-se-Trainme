package com.systechafrica.restaurantmagementsystem;

import java.util.Scanner;

public class RestaurantManagementSys {
    Scanner scanner = new Scanner(System.in);
    private final String USER_PASSWORD = "Admin123";

    public static void main(String[] args) {


    }

        public boolean login() {
            int loginAttempts = 1;
            boolean loggedIn = false;
    
            while (loginAttempts <= 3) {
                System.out.println("Enter your password: ");
                String userPassword = scanner.nextLine();
                if (userPassword.equals(USER_PASSWORD)) {
                    loggedIn = true;
                    break;
                }
                System.out.println("Wrong password");
                loginAttempts++; 
    
            }
            return loggedIn;
        }

    }


