package com.systechafrica.possalessystem;

import java.util.Scanner;

public class SaleSystem {
    final String USER_PASSWORD = "Admin123";
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SaleSystem sys = new SaleSystem();
        boolean loggedIn = sys.login();
        if(loggedIn){
            System.out.println("Successful login!");

            boolean showingOutput = true;
            while(showingOutput){
                sys.displayOutput();
                int option = sys.scanner.nextInt();
                sys.scanner.nextLine();

                if (option == 1){
                    sys.addItem();
                    boolean addingItem = true;
                    while(addingItem){
                        System.out.println( "Type add to add item and 'N' to not add any");
                        String addItem = sys.scanner.nextLine();
                        if(addItem.equals("add")){
                            sys.addItem();
                        } else if (addItem.equals("N")){
                            addingItem = false;
                        } else{
                            System.out.println("Invalid input. Type 'add' to add another item or N to exit");
                        }}
                } else if (option == 2){
                    sys.makepayment();
                } else if (option == 3){
                    sys.displayReceipt();
                } else {
                System.out.println("Invalid option");
                }
            }
        }
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
            loginAttempts = loginAttempts + 1; // logginAttempts++
           //! loginAttempts to check later

        }
        return loggedIn;
    }

    public void displayOutput() {
        System.out.println("__________________");
        System.out.println("SYSTECH POS SYSTEM");
        System.out.println("__________________");
        System.out.println("1. ADD ITEM");
        System.out.println("2. MAKE PAYMENT");
        System.out.println("3. DISPLAY RECEIPT");

        System.out.println("");
        System.out.println("choose an option");

    }

    public void addItem() {
        

    }

    public void makepayment() {
        //clickpayment and access options.

    }

    public void displayReceipt() {
        System.out.println();

    }

}
