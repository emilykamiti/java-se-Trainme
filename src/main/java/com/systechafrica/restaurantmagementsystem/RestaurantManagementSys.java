package com.systechafrica.restaurantmagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantManagementSys {
    static Scanner scanner = new Scanner(System.in);
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

            System.out.println("Item added successfully! ");

            System.out.println("Do you want to add a meal/drink: Y");
            String addItem = scanner.nextLine();
            if (addItem.equalsIgnoreCase("Y")) {

            } else if (!addItem.equalsIgnoreCase("N"))
                ;

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

    public void mealsAndDrinksmenu() {
        drinksMenu.add(new Drinks("CHAI", 15.0));
        drinksMenu.add(new Drinks("ANDAZI", 15.0));
        drinksMenu.add(new Drinks("TOSTI", 15.0));
        mealsMenu.add(new Meals("NDEGU AND ACCOMPANIMENTS", 70.0));
        mealsMenu.add(new Meals("BEANS AND ACCOMPANIMENTS", 70.0));
        mealsMenu.add(new Meals("PILAU VEG", 90.0));

    }

    public void addItem(String name, double price) {
        mealsMenu.add(new Meals(name, price));
        drinksMenu.add(new Drinks(name, price));
    }

    public void displayMenu() {
        System.out.println("--------------------");
        System.out.println("SYSTECH RESTAURANT");
        System.out.println("");
        System.out.println("DRINKS");
        System.out.println("********************");
        System.out.println("1. CHAI----------------------------------15");
        System.out.println("2. ANDAZI--------------------------------10");
        System.out.println("3. TOSTI---------------------------------12");
        System.out.println("");
        System.out.println("MEALS");
        System.out.println("********************");
        System.out.println("4.NDEGU AND ACCOMPANIMENTS----------------70");
        System.out.println("5.BEANS AND ACCOMPANIMENTS----------------70");
        System.out.println("6.PILAU VEG--------------------------------90");
        System.out.println("7.Quit");

    }

    public void displayPayment() {
        double total = 0.0;
        System.out.println("Pay now for:");

        for (Drinks drink : drinksMenu) {
            System.out.println(drink.getName() + " " + drink.getPrice());
            total += drink.getPrice();
        }

        for (Meals meal : mealsMenu) {
            System.out.println(meal.getName() + " " + meal.getPrice());
            total += meal.getPrice();
        }
        System.out.println("Total: " + total);

        System.out.print("Enter amount to pay: ");
        double amountToPay = scanner.nextDouble();
        scanner.nextLine();

        if (amountToPay >= total) {
            double change = amountToPay - total;
            System.out.println("Your balance is: " + change);
        } else {
            System.out.println("Amount paid is less than the total. cannot continue.");
        }
    }

}
