package com.systechafrica.possalessystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaleSystem {
    private final String USER_PASSWORD = "Admin123";
    private Scanner scanner = new Scanner(System.in);
    private List<ItemsPurchased> listOfItemsPurchased = new ArrayList<>();

    public static void main(String[] args) {
        SaleSystem sys = new SaleSystem();
        boolean loggedIn = sys.login();
        if (loggedIn) {
            System.out.println("Successful login!");

            boolean showingOutput = true;
            while (showingOutput) {
                sys.displayOutput();
                int option = sys.scanner.nextInt();
                sys.scanner.nextLine();

                if (option == 1) {
                    sys.addItem();
                } else if (option == 2) {
                    sys.makepayment();
                } else if (option == 3) {
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
            loginAttempts = loginAttempts + 1; // loginAttempts++
            // ! loginAttempts to check later

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
        System.out.println("Input Item Code:");
        String itemCode = scanner.nextLine();

        System.out.println("Input Quantity:");
        int quantity = scanner.nextInt();

        System.out.println("Input price per item");
        double pricePerItem = scanner.nextDouble();

        double totalValue = quantity * pricePerItem;
        listOfItemsPurchased.add(new ItemsPurchased(itemCode, quantity, pricePerItem, totalValue));

        scanner.nextLine();

        System.out.println("Item added successfully! ");

        System.out.println("To add another item type 'add if not type N to exit" );
        String addItem = scanner.nextLine();
        if(addItem.equalsIgnoreCase("add")){

        } else if (addItem.equals("N")){
            boolean addingItem = false;
        } else{
            System.out.println("Invalid input. Type 'add' to add another item or N to exit");
        }
    }

public void makePayment(){
        //clickpayment and access optin.
        System.out.println("Item Code" + " "+ "Quantity"+ " "+ "unit Price"+ " " + "T

    System.out.println("_____________________________________________________");
        double totalValue = 0;

    }

    public void displayReceipt() {
        System.out.println();

    }

}
