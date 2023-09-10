package com.systechafrica.restaurantmagementsystem;

import java.util.Scanner;

import com.systechafrica.possalessystem.SaleSystem;


public class RestaurantManagementSys {
     Scanner scanner =new Scanner(System.in);
        String USER_PASSWORD = "Admin123";
    public static void main(String[] args) {
    RestaurantManagementSys rms = new RestaurantManagementSys();
    boolean loggedIn = rms.login();



        public boolean login(){
        int loginAttempts = 0;
        boolean logged = false;

        while(loginAttempts < 3){
            System.out.println("Input password");
            String password  = scanner.nextLine();
            if (password.equals(USER_PASSWORD)){

            }
        }
        
        }
        
    }
}
