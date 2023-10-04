package com.systechafrica.librarymanagementsystem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.systechafrica.Part3.logging.CustomFormatter;
import com.systechafrica.possysreview.validation.ItemValidationException;
import com.systechafrica.possysreview.validation.PaymentValidationException;

public class LibraryManagementSystem {
    private static final Logger LOGGER = Logger.getLogger(LibraryManagementSystem.class.getName());
    private Scanner scanner = new Scanner(System.in);
    private List<Book> lib = new ArrayList<>();

    public static void main(String[] args) {
        liblogging();
        LibraryManagementSystem lib = new LibraryManagementSystem();

        while (true){
            displayOutput();
            if (scanner.hasNextInt()) {
                            int option = scanner.nextInt();
                            scanner.nextLine();
                            if (option == 1) {
                                AddBook();
                            } else if (option == 2) {
                                if (listOfItemsPurchased.isEmpty()) {
                                    System.out.println("No items added yet");
                                } else {
                                    showBooks();
                                }
                            } else if (option == 3) {
                                if (listOfItemsPurchased.isEmpty()) {
                                    System.out.println("No items added yet");
                                } else {
                                    borrowBook();
                                }else if (option == 4) {
                                if (listOfItemsPurchased.isEmpty()) {
                                    System.out.println("No items added yet");
                                } else {
                                    returnBook();
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
            }else

    {
        System.out.println("Failed to establish a database connection.");
    }

    }catch(PaymentValidationException e)
    {
        LOGGER.info("Enter valid input: " + e.getMessage());

    }catch(ItemValidationException e)
    {
        LOGGER.warning("Enter valid input: " + e.getMessage());
    }catch(InputMismatchException e)
    {
        LOGGER.warning("Enter valid input to continue: " + e.getMessage());

    }catch(NullPointerException e)
    {
        LOGGER.warning("Enter value: " + e.getMessage());
    }
    }

    public static void liblogging() {
        try {
            FileHandler fileHandler = new FileHandler("liblog.txt");
            CustomFormatter formatter = new CustomFormatter();
            LOGGER.addHandler(fileHandler);
            fileHandler.setFormatter(formatter);

        } catch (SecurityException e) {
            LOGGER.severe("Un able to connect to the database: " + e.getMessage());
        } catch (IOException e) {
            LOGGER.severe("Not Valid input/output: " + e.getMessage());
        }
    
    }
    public void displayOutput() {
        System.out.println("Check out the libray Menu");

        System.out.println("1. Add a book(s)");
        System.out.println("2. Show Books");
        System.out.println("3. Borrow a book");
        System.out.println("4. Return a book");
        System.out.println();
        System.out.println("Quit");
        System.out.print("Choose an option: ");
    }

    public void AddBook(){

    }

    public void showBooks(){

    }

    public void borrowBook(){

    }

    public void returnBook(){

    }
}