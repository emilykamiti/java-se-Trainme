package com.systechafrica.possysreview;

import java.io.IOException;

//!UserName: Admin1
//!password: Admin123

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.systechafrica.Part3.logging.CustomFormatter;
import com.systechafrica.possysreview.validation.ItemValidationException;
import com.systechafrica.possysreview.validation.PaymentValidationException;

public class POSSalesSystem {
    private static final Logger LOGGER = Logger.getLogger(POSSalesSystem.class.getName());
    private Scanner scanner = new Scanner(System.in);
    private List<ItemsPurchased> listOfItemsPurchased = new ArrayList<>();

    public static void main(String[] args) throws SQLException {
        
        //posFileLogging();
        POSSalesSystem sys = new POSSalesSystem();
        posFileLogging();
        sys.startApplication();

    }

    public void startApplication() {
        PossysDataBase database = new PossysDataBase();
        Connection connection = database.dbConnection();
        try {

            if (connection != null) {
                System.out.println("");
                System.out.println("Login Here!");
                System.out.println("");
                System.out.print("Enter your username: ");
                String inputUsername = scanner.nextLine();

                System.out.print("Enter your password: ");
                String inputPassword = scanner.nextLine();

                if (database.authenticateUser(connection, inputUsername, inputPassword)) {
                    System.out.println("");
                    System.out.println("Successful login!");
                    System.out.println("");

                    boolean keepShowingItem = true;
                    while (keepShowingItem) {
                        displayOutput();

                        if (scanner.hasNextInt()) {
                            int option = scanner.nextInt();
                            scanner.nextLine();
                            if (option == 1) {
                                addItem();
                            } else if (option == 2) {
                                if (listOfItemsPurchased.isEmpty()) {
                                    System.out.println("No items added yet");
                                } else {
                                    makePayment();
                                }
                            } else if (option == 3) {
                                if (listOfItemsPurchased.isEmpty()) {
                                    System.out.println("No items added yet");
                                } else {
                                    displayReceipt();
                                }
                            } else if (option == 4) {
                                keepShowingItem = false;
                                quit();
                            } else {
                                System.out.println("Invalid option");
                            }
                        } else {
                            System.out.println("Invalid input. Please enter a valid option.");
                            scanner.nextLine();
                        }
                    }
                } else {
                    System.out.println("Login failed. Invalid username or password.");
                }
            } else {
                System.out.println("Failed to establish a database connection.");
            }

        } catch (PaymentValidationException e) {
            LOGGER.info("Enter valid input: " + e.getMessage());

        } catch (ItemValidationException e) {
            LOGGER.warning("Enter valid input: " + e.getMessage());
        } catch (InputMismatchException e) {
            LOGGER.warning("Enter valid input to continue: " + e.getMessage());

        } catch (NullPointerException e) {
            LOGGER.warning("Enter value: " + e.getMessage());
        }
    }

    public static void posFileLogging(){
        try {
            FileHandler fileHandler = new FileHandler("poslog.txt",false );
            CustomFormatter formatter = new CustomFormatter();
            LOGGER.addHandler(fileHandler);
            fileHandler.setFormatter(formatter);

           // Class.forName("com.mysql.cd.jdbc.Driver");
            
        } catch (SecurityException e) {
            LOGGER.severe("Un able to connect to the database: " + e.getMessage());
        } catch (IOException e) {
            LOGGER.severe("Not Valid input/output: " + e.getMessage());
        // }catch (ClassNotFoundException e) {
            // LOGGER.severe("Unable to obtain class for jdb driver" + e.getMessage());
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

    public void addItem() throws ItemValidationException {
        boolean isValidItemCode = false;
        while (!isValidItemCode) {
            System.out.println("Input Item Code:");
            String itemCode = scanner.nextLine();

            if (isValidItemCode(itemCode)) {
                isValidItemCode = true;
            } else {
                System.out.println("Invalid code. It must be alphanumeric and at least 5 characters.");
                continue;
            }
            System.out.println("Input Quantity:");
            int quantity = scanner.nextInt();

            System.out.println("Input price per item");
            double pricePerItem = scanner.nextDouble();
            double totalValue = quantity * pricePerItem;

            if (quantity <= 0 || pricePerItem <= 0) {
                throw new ItemValidationException("Invalid input: Quantity and price per item must be positive values");
            }

            listOfItemsPurchased.add(new ItemsPurchased(itemCode, quantity, pricePerItem, totalValue));
            scanner.nextLine();

            System.out.println("Item added successfully!");

            System.out.println("To add another item type 'add' or 'N' to exit");
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

        System.out.println("Enter the amount given by Customer:");
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
        System.out.println("Exited System...");
        System.exit(0);
    }
}