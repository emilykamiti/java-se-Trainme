package com.systechafrica.UserInput;

import java.util.Scanner;
import java.util.logging.Logger;

public class UserInputUsingScanner {
    private static final Logger LOGGER = Logger.getLogger(UserInputUsingScanner.class.getName());
    
    public static void main(String[] args) {
        final String DB_USERNAME
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine(); 
        
        System.out.print("Enter your username: ");
        String password = scanner.nextLine();
    }
}
