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
    private Scanner scanner = new Scanner(System.in);
    private List<Book> lib = new ArrayList<>();

    public static void main(String[] args) {
        liblogging();
        LibraryManagementSystem lib = new LibraryManagementSystem();

       
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