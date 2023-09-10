package com.systechafrica.restaurantmagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantManagementSys {
    Scanner scanner = new Scanner(System.in);
    private final String USER_PASSWORD = "Admin123";
    private List<Drinks> drinksMenu = new ArrayList<>();
    private List<Meals> MealsMenu = new ArrayList<>();


    public static void main(String[] args) {
        RestaurantManagementSys restaurantms = new RestaurantManagementSys();
        boolean loggedIn = restaurantms.login();

      
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

    public void MealsandDrinksmenu(){
        drinksMenu.add(new Drinks("CHAI", 15.0));
        drinksMenu.add(new Drinks("ANDAZI", 15.0));
        drinksMenu.add(new Drinks("TOSTI", 15.0));
        MealsMenu.add(new Meals("NDEGU AND ACCOMPANIMENTS", 70.0));
        MealsMenu.add(new Meals("BEANS AND ACCOMPANIMENTS", 70.0));
        MealsMenu.add(new Meals("PILAU VEG", 90.0));
    

    }
    public void Ordering(){
        
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


}
