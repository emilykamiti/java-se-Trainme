package com.systechafrica.restaurantmagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.systechafrica.UserInput.AtmMachine;


public class RestaurantManagementSys {
    static Scanner scanner = new Scanner(System.in);
    private final String USER_PASSWORD = "Admin123";
    private List<Drinks> drinksMenu = new ArrayList<>();
    private List<Meals> mealsMenu = new ArrayList<>();

    private List<Drinks> orderedDrinks = new ArrayList<>();
    private List<Meals> orderedMeals = new ArrayList<>();

    public static void main(String[] args) {
        RestaurantManagementSys restaurantms = new RestaurantManagementSys();
        boolean loggedIn = restaurantms.login();

        if (loggedIn) {
            System.out.println("Welcome to Sytech restaurant!");

            boolean showingOutput = true;
            while (showingOutput) {
                restaurantms.displayMenu();
                int option = scanner.nextInt();
                scanner.nextLine();

                if (option == 1) {
                    restaurantms.addItem("Chai", 15, "drink");

                } else if (option == 2) {
                    restaurantms.addItem("Andazi", 10, "drink");

                } else if (option == 3) {
                    restaurantms.addItem("Tosti", 12, "drink");

                } else if (option == 4) {
                    restaurantms.addItem("Ndegu And Accompaniments", 70, "meal");

                } else if (option == 5) {
                    restaurantms.addItem("Beans And Accompaniments", 70, "meal");

                } else if (option == 6) {
                    restaurantms.addItem("Pilau Veg", 90, "meal");

                } else if (option == 7) {
                    return;

                } else {
                    System.out.println("Invalid input");
                }

                if (showingOutput) {
                    System.out.println("Do you want to add another item (Y/N)?");
                    String addAnotherItem = scanner.nextLine();
                    if (addAnotherItem.equalsIgnoreCase("N")) {
                        restaurantms.displayPayment();
                        showingOutput = false;
                    } else if (!addAnotherItem.equalsIgnoreCase("Y")) {
                        System.out.println("Invalid input. Please enter 'Y' or 'N'.");
                    }
                }
            }
        }
    }

    public boolean login() {
            AtmMachine app = new AtmMachine();
            return app.login();


    }

    public void mealsAndDrinksmenu() {
        drinksMenu.add(new Drinks("CHAI", 15.0));
        drinksMenu.add(new Drinks("ANDAZI", 15.0));
        drinksMenu.add(new Drinks("TOSTI", 15.0));
        mealsMenu.add(new Meals("NDEGU AND ACCOMPANIMENTS", 70.0));
        mealsMenu.add(new Meals("BEANS AND ACCOMPANIMENTS", 70.0));
        mealsMenu.add(new Meals("PILAU VEG", 90.0));

    }

    public void addItem(String name, double price, String type) {

        if ("drink".equalsIgnoreCase(type)) {

            orderedDrinks.add(new Drinks(name, price));
        } else if ("meal".equalsIgnoreCase(type)) {

            orderedMeals.add(new Meals(name, price));
        }
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

        for (Drinks drink : orderedDrinks) {
            System.out.println(drink.getName() + " " + drink.getPrice());
            total += drink.getPrice();
        }

        for (Meals meal : orderedMeals) {
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