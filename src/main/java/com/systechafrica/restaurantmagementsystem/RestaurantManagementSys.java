package com.systechafrica.restaurantmagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantManagementSys {
    Scanner scanner = new Scanner(System.in);
    private final String USER_PASSWORD = "Admin123";
    private List<Drinks> drinksMenu = new ArrayList<>();
    private List<Meals> mealsMenu = new ArrayList<>();

    public static void main(String[] args) {
        RestaurantManagementSys restaurantms = new RestaurantManagementSys();
        boolean loggedIn = restaurantms.login();

        if (loggedIn) {
            System.out.println("Welcome to Sytech restaurant!");

            boolean showingOutput = true;
            while (showingOutput) {
                restaurantms.displayMenu();
                int option = restaurantms.scanner.nextInt();
                restaurantms.scanner.nextLine();

                if (option == 1) {
                    restaurantms.addItem("Chai", 15);

                } else if (option == 2) {
                    restaurantms.addItem("Andazi", 10);

                } else if (option == 3) {
                    restaurantms.addItem("Tosti", 12);

                } else if (option == 4) {
                    restaurantms.addItem("Ndegu And Accompaniments", 70);

                } else if (option == 5) {
                    restaurantms.addItem("Beans And Accompaniments", 70);

                } else if (option == 6) {
                    restaurantms.addItem("Pilau Veg", 90);

                } else if (option == 7) {
                    showingOutput = false;

                } else {
                    System.out.println("Invalid input");
                }

            }

            if (restaurantms.mealsMenu.isEmpty() || !restaurantms.drinksMenu.isEmpty()) {
                System.out.println("Continue to payment");
                String continuetoPayment = restaurantms.scanner.nextLine();
                if (continuetoPayment.equalsIgnoreCase("Y")) {
                    restaurantms.displayPayment();
                } else {
                    System.out.println("Cannot continue with payment");
                }
            } else {
                System.out.println("No items picked");
            }
        } else {
            System.out.println("Maximum Login attempts reached, try again");
        }
    }

    private void addItem(String string, int i) {
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

    public void MealsandDrinksmenu() {
        drinksMenu.add(new Drinks("CHAI", 15.0));
        drinksMenu.add(new Drinks("ANDAZI", 15.0));
        drinksMenu.add(new Drinks("TOSTI", 15.0));
        mealsMenu.add(new Meals("NDEGU AND ACCOMPANIMENTS", 70.0));
        mealsMenu.add(new Meals("BEANS AND ACCOMPANIMENTS", 70.0));
        mealsMenu.add(new Meals("PILAU VEG", 90.0));

    }

    public void orderedItems() {

    }

    public void displayMenu() {
        System.out.println("********************");
        System.out.println(" SYSTECH RESTAURANT");

        System.out.println("DRINKS");
        System.out.println("********************");
        System.out.println("1. CHAI__________________________________");
        System.out.println("1. ANDAZI________________________________");
        System.out.println("1. TOSTI_________________________________");

        System.out.println("MEALS");
        System.out.println("********************");
        System.out.println("NDEGU AND ACCOMPLISHMENTS________________");
        System.out.println("BEANS AND ACCOMPLISHMENTS________________");
        System.out.println("PILAU VEG________________________________");
        System.out.println("7. QUIT__________________________________");

    }

    public void displayPayment() {

    }

}
