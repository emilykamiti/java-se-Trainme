package com.systechafrica.UserInput;

import java.util.Scanner;
import java.util.logging.Logger;

public class UserInputUsingScanner {
    private static final Logger LOGGER = Logger.getLogger(UserInputUsingScanner.class.getName());
    
    public static void main(String[] args) {
        final String DB_USERNAME = "Emily";
        final String DB_PASSWORD = "Emily30";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine(); 
        
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if ( username.equals(DB_USERNAME)  && password.equals(DB_PASSWORD)){
            System.out.println("Welcome to programX!");
        }else{
            System.err.println("incorrect username or program");
        }

        scanner.close();
    }
}
