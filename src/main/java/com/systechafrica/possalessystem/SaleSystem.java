package com.systechafrica.possalessystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.systechafrica.UserInput.AtmMachine;

public class SaleSystem {
    private final String USER_PASSWORD = "Admin123";
    private Scanner scanner = new Scanner(System.in);
    private List<ItemsPurchased> listOfItemsPurchased = new ArrayList<>();

    public static void main(String[] args) {
        SaleSystem sys = new SaleSystem();
        boolean loggedIn = sys.login();
        if (loggedIn) {
            System.out.println("Successful login!");

            boolean keepShowingItem = true;
            while (keepShowingItem) {
                sys.displayOutput();
                int option = sys.scanner.nextInt();
                sys.scanner.nextLine();

                if (option == 1) {

                    sys.addItem();
                } else if (option == 2) {
                    if (sys.listOfItemsPurchased.isEmpty()) {
                        System.out.println("No Item seleceted. Please add item before payment");
                    } else {
                        sys.makePayment();
                    }
                } else if (option == 3) {
                    if (sys.listOfItemsPurchased.isEmpty()) {
                        System.out.println("No Item selected Please select item for receipt to be displayed");
                    } else {
                        sys.displayReceipt();
                    }
                } else if (option == 4) {
                    keepShowingItem = false;
                    sys.quit();

                } else {
                    System.out.println("Invalid option");
                }
            }
        }
    }

    public boolean login() {
        AtmMachine app = new AtmMachine();
        return app.login();

    }

    public void displayOutput() {
        System.out.println("*******************");
        System.out.println("SYSTECH POS SYSTEM");
        System.out.println("___________________");
        System.out.println("1. ADD ITEM");
        System.out.println("2. MAKE PAYMENT");
        System.out.println("3. DISPLAY RECEIPT");
        System.out.println("4. QUIT");

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
        double total = 0.0;

        displayItems();

        for (ItemsPurchased item : listOfItemsPurchased) {
            total += item.getTotalValue();
        }

        System.out.println("***********************************");
        System.out.printf("Total:%29.2f%n", total);

        System.out.println("Enter the amount given by Customer:");
        double amountGiven = scanner.nextDouble();
        
        while (amountGiven < total) {
            System.out.println("Enter the amount given by Customer (must be greater than or equal to the total):");
            amountGiven = scanner.nextDouble();
            if (amountGiven < total) {
                System.out.println("Amount provided is less than the total. Please provide a sufficient amount.");
            }
        }

        double change = amountGiven - total;
        System.out.printf("Change:%28.2f%n", change);
    }

    private void displayReceipt() {

        displayItems();

        System.out.println("****************************************************");
        double total = 0.0;

        for (ItemsPurchased item : listOfItemsPurchased) {
            total += item.getTotalValue();
        }

        System.out.printf("Total:%29.2f%n", total);

        System.out.println("*****************************************************");
        System.out.println("THANK YOU FOR SHOPPING WITH US");
        System.out.println("*****************************************************");
        listOfItemsPurchased.clear();
        System.exit(0);
    }

    private void displayItems() {
        System.out.println("Item Code   Quantity   Unit Price   Total Value");

        for (ItemsPurchased item : listOfItemsPurchased) {
            System.out.printf(
                    "%-12s %-10s %-11s %-12s%n",
                    item.getItemCode(),
                    item.getQuantity(),
                    item.getpricePerItem(),
                    item.getTotalValue());
        }
    }

    public void quit() {
        System.out.println("Exited System...");
        System.exit(0);
    }
}
