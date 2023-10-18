package com.systechafrica.possysreview;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.systechafrica.Part3.logging.CustomFormatter;
import com.systechafrica.possysreview.validation.PaymentValidationException;

public class POSSalesSystem {
    private static final Logger LOGGER = Logger.getLogger(POSSalesSystem.class.getName());
    private Scanner scanner = new Scanner(System.in);
    private List<ItemsPurchased> listOfItemsPurchased = new ArrayList<>();

    public static void main(String[] args) {
        POSSalesSystem sys = new POSSalesSystem();
        sys.posFileLogging();
        sys.startApplication();
    }

    public void startApplication() {
        PossysDataBase database = new PossysDataBase();
        Connection connection = database.dbConnection();
        database.initializeDatabase();
        try {
            LOGGER.info("Application started, welcome to systech POS \n");
            if (connection != null) {
                System.out.println("");
                System.out.println("Login Here!");
                System.out.println("");
                System.out.print("Enter your username: ");
                String inputUsername = scanner.nextLine();

                System.out.print("Enter your password: ");
                String inputPassword = scanner.nextLine();

                if (database.authenticateUser(connection, inputUsername, inputPassword)){
                    System.out.println("");
                    LOGGER.info("Successful login! \n");
                    System.out.println("");
                    boolean keepShowingItem = true;
                    while (keepShowingItem) {
                        displayOutput();
                        if(scanner.hasNextInt()) {
                            int option = scanner.nextInt();
                            scanner.nextLine();
                            if (option == 1){
                                addItem();
                            } else if (option == 2){
                                if (listOfItemsPurchased.isEmpty()){
                                    LOGGER.warning("No items added yet \n");
                                } else {
                                    makePayment();
                                }
                            } else if (option == 3) {
                                if (listOfItemsPurchased.isEmpty()) {
                                    LOGGER.warning("No items added yet \n");
                                } else {
                                    displayReceipt();
                                }
                            } else if (option == 4) {
                                keepShowingItem = false;
                                quit();
                            } else {
                                LOGGER.warning("Invalid option \n");
                            }
                        } else {
                            LOGGER.warning("Invalid input. Please enter a valid option. \n");
                            scanner.nextLine();
                        }
                    }
                } else {
                    LOGGER.warning("Login failed. Invalid username or password. \n");
                }
            } else {
                LOGGER.warning("Failed to establish a database connection. \n");
            }
        } catch (PaymentValidationException e) {
            LOGGER.info("Enter valid input: " + e.getMessage());
        } catch (InputMismatchException e) {
            LOGGER.warning("Enter valid input to continue: " + e.getMessage());
        } catch (NullPointerException e) {
            LOGGER.warning("Enter correct input: " + e.getMessage());
        }
    }

    public void posFileLogging() {
        try {
            FileHandler fileHandler = new FileHandler("poslog.txt", false);
            CustomFormatter formatter = new CustomFormatter();

            LOGGER.addHandler(fileHandler);
            fileHandler.setFormatter(formatter);
        } catch (SecurityException e) {
            LOGGER.severe("Unable to connect to the database: \n" + e.getMessage());
        } catch (IOException e) {
            LOGGER.severe("Invalid:  \n" + e.getMessage());
        }
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
        System.out.println("Choose an option");
    }

    public void addItem() {
        boolean isValidItemCode = false;
        while (!isValidItemCode) {
            System.out.println("Input Item Code:");
            String itemCode = scanner.nextLine();

            if (isValidItemCode(itemCode)) {
                isValidItemCode = true;
            } else {
                LOGGER.warning("Invalid code. It must be alphanumeric and at least 5 characters. \n");
                continue;
            }

            int quantity = 0;
            double pricePerItem = 0.0;

            while (true) {
                System.out.println("Input Quantity:");
                if (scanner.hasNextInt()) {
                    quantity = scanner.nextInt();
                    if (quantity <= 0) {
                        LOGGER.warning("Quantity must be a positive integer. \n");
                        continue;
                    }
                    break;
                } else {
                    LOGGER.warning("Invalid input. Quantity must be a positive integer. \n");
                    scanner.nextLine();
                }
            }

            while (true) {
                System.out.println("Input price per item:");
                if (scanner.hasNextDouble()) {
                    pricePerItem = scanner.nextDouble();
                    if (pricePerItem <= 0.0) {
                        LOGGER.warning("Price per item must be a positive number. \n");
                        continue;
                    }
                    break;
                } else {
                    LOGGER.warning("Invalid input. Price per item must be a positive number. \n");
                    scanner.nextLine();
                }
            }

            double totalValue = quantity * pricePerItem;
            listOfItemsPurchased.add(new ItemsPurchased(itemCode, quantity, pricePerItem, totalValue));
            scanner.nextLine();
            LOGGER.info("Item added successfully! \n");
            System.out.println("To add another item type 'add' or 'N' to exit: ");
            String addItem = scanner.nextLine();
            if (addItem.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    private boolean isValidItemCode(String itemCode) {
        return itemCode.matches("^[a-zA-Z0-9]{5,}$");
    }

    public void makePayment() throws PaymentValidationException {
        double total = 0.0;

        displayItems();
        for (ItemsPurchased item : listOfItemsPurchased) {
            total += item.getTotalValue();
        }
        System.out.println("***********************************");
        System.out.printf("Total:%29.2f%n", total);

        LOGGER.info("Enter the amount given by Customer: \n");
        double amountGiven = scanner.nextDouble();
        while (amountGiven < total) {
            throw new PaymentValidationException("Amount is less than expected amount, enter the correct amount");
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
        System.out.println("THANK YOU FOR SHOPPING WITH US!");
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
        LOGGER.info("Exited System...\n");
        System.exit(0);
    }
}
