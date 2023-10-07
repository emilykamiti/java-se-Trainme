package com.systechafrica.librarymanagementsystem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.systechafrica.Part3.logging.CustomFormatter;

public class LibraryManagementSystem {
    private static final Logger LOGGER = Logger.getLogger(LibraryManagementSystem.class.getName());
    private static Scanner scanner = new Scanner(System.in);
    private List<Book> lib = new ArrayList<>();

    public static void main(String[] args) {
        liblogging();
        LibraryManagementSystem lib = new LibraryManagementSystem();

        boolean keepDisplayingMenu = true;
        while (keepDisplayingMenu) {
            lib.displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                LOGGER.info("Adding a Book");
                lib.addBook();
            } else if (choice == 2) {
                LOGGER.info("Displaying books.");
                lib.displayBooks();
            } else if (choice == 3) {
                LOGGER.info("Borrowing a book.");
                lib.borrowBook();
            } else if (choice == 4) {
                LOGGER.info("Returning a book.");
                lib.returnBook();
            } else if (choice == 5) {
                LOGGER.info("Exiting system.");
                lib.closeDatabase();
                keepDisplayingMenu = false;
            } else {
                LOGGER.warning("Invalid choice: " + choice);
                System.out.println("Invalid choice, please retry.");
            }
        }
    }

    public static void liblogging() {
        try {
            FileHandler fileHandler = new FileHandler("liblog.txt");
            CustomFormatter formatter = new CustomFormatter();
            LOGGER.addHandler(fileHandler);
            fileHandler.setFormatter(formatter);
        } catch (SecurityException | IOException e) {
            LOGGER.severe("Failed to set up logging: " + e.getMessage());
        }
    }

    public void displayMenu() {
        System.out.println("Here is the library Menu");
        System.out.println("1. Add a book(s)");
        System.out.println("2. Show Books");
        System.out.println("3. Borrow a book");
        System.out.println("4. Return a book");
        System.out.println("5. Quit");
        System.out.print("Choose an option: ");
    }

    public void addBook() {
    }

    public void displayBooks() {
        
    }

    public void borrowBook() {
       
    }

    public void returnBook() {
       
    }

    public void closeDatabase() {
       
    }
}