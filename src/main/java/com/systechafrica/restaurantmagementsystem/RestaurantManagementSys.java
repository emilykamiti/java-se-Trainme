package com.systechafrica.restaurantmagementsystem;

import java.util.ArrayList;
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
{
    System.out.println();
    Drinks[] drinks = new Drinks[3];
    drinks[0] = new Drinks("Chai", 15);
    drinks[1] = new Drinks("Andazi", 10);
    drinks[0] = new Drinks("Totsi", 12);

    Meals[]meals = new Meals[3];
    meals[0] = new Meals("Ndengu and Accomplishments", 70);
    meals[0] = new Meals("Beans and Accomplishments", 70);
    meals[0] = new Meals("Pilau Veg", 90);
}


}
