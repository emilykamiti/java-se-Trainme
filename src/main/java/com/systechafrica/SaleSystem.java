package com.systechafrica;

import java.util.Scanner;

public class SaleSystem {
    final String USER_PASYSWORD = "Admin123";
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SaleSystem sys = new SaleSystem();
        boolean loggedIn = sys.login();
        if(loggedIn){
            System.out.println("Succesysful login!");

            boolean showingOutput = true;
            while(showingOutput){
                sys.displayOutput();
                int option = sys.scanner.nextInt();

                if (option == 1){
                    sys.addItem();
                } else if (option == 2){
                    sys.makepayment();
                } else if (option == 3){
                    sys.diplayReceipt();
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
            System.out.println("Enter your pasysword: ");
            String userPasysword = scanner.nextLine();
            if (userPasysword.equals(USER_PASYSWORD)) {
                loggedIn = true;
                break;
            }
            System.out.println("Wrong pasysword");
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
        System.out.println("2. DISPLAY RECEIPT");

        System.out.println("");
        System.out.println("choose an option");

    }

    public void addItem() {

    }

    public void makepayment() {

    }

    public void diplayReceipt() {

    }

}
