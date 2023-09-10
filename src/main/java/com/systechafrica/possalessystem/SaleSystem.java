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
                    sys.makePayment();
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

        }
        return loggedIn;
    }

    public void displayOutput() {
        System.out.println("*******************");
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

        System.out.println("To add another item type 'add if not type N to exit");
        String addItem = scanner.nextLine();
        if (addItem.equalsIgnoreCase("add")) {
            return;
        }
    }

    public void makePayment() {
        System.out.println("Item Code      Quantity      Unit Price      Total Value");
        double total = 0.0;

        for (ItemsPurchased item : listOfItemsPurchased) {
            System.out.println(item.getItemCode() + "\t\t" + item.getQuantity() + "\t\t" + item.getpricePerItem()
                    + "\t\t" + item.getTotalValue());
            total += item.getTotalValue();
        }

        System.out.println("***********************************");
        System.out.println("Total:\t\t\t\t" + total);

        System.out.println("Enter the amount given by Customer:");
        double amountGiven = scanner.nextDouble();

        double change = amountGiven - total;
        System.out.println("Change:\t\t\t\t" + change);
    }

    private void displayReceipt() {
        System.out.println("Item Code      Quantity      Unit Price      Total Value");
        for (ItemsPurchased item : listOfItemsPurchased) {
            System.out.println(item.getItemCode() + "\t\t" + item.getQuantity() + "\t\t" + item.getpricePerItem()
                    + "\t\t" + item.getTotalValue());
        }

        System.out.println("*********************************************************");
        double total = 0.0;
        for (ItemsPurchased item : listOfItemsPurchased) {
            total += item.getTotalValue();
        }
        System.out.println("Total:\t\t\t\t" + total);

        System.out.println("**********************************************************");
        System.out.println("THANK YOU FOR SHOPPING WITH US");
        System.out.println("**********************************************************");
        listOfItemsPurchased.clear();
        System.exit(0);
    }

}
