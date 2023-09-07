package com.systechafrica.UserInput;

import java.util.Scanner;

public class AtmMachine {
    final double INITIAL_BALANCE = 1000.00;
    final double WITHDRAWAL_CHARGES = 0.02;
    final String DEFAULT_PASSWORD = "Admin123";
    final String USER_NAME = "Nasinza";
    double runningBalance = INITIAL_BALANCE;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        AtmMachine app = new AtmMachine();
        boolean loggedIn = app.login();
        if (loggedIn) {
            System.out.println("Successfully logged in");
            // show menu
            boolean keepShowingMenu = true;
            while (keepShowingMenu) {// while(true)
                app.displayMenu();
                System.out.println("choose your option: ");
                int option = app.scanner.nextInt();

                if (option == 1) {
                    app.checkBalance();

                } else if (option == 2) {
                    app.performDeposit();

                } else if (option == 3) {
                    app.performWithdrawal();

                } else if (option == 4) {
                    app.performTransfer();

                } else if (option == 5) {
                    keepShowingMenu = false;

                } else {
                    System.out.println("Invalid opton ...try again");

                }
            }
        } else {
            System.out.println("Maximum attempts failed");
        }
    }

    public boolean login() {
        // ? Try three times and, exit if not logged in
        int loginEntries = 1;
        boolean loggedIn = false;
        while (loginEntries <= 3) {
            System.out.println( "Enter you name: ");
            String userName = scanner.nextLine();
            System.out.print("Enter your password: ");
            String userPasssword = scanner.nextLine();
            if (userPasssword.equals(DEFAULT_PASSWORD ) && userName.equals(USER_NAME) ) {

                // show menu
                loggedIn = true;
                break;
            }
            System.out.println("Wrong password");
            loginEntries++; // loginEntries = loginEntries+1;

        }
        return loggedIn;
    }

    public void displayMenu() {
        System.out.println("********************************");
        System.out.println("*************ATM SIMULATOR******");
        System.out.println("********************************");
        System.out.println("************ATM SERVICES********");
        System.out.println("________________________________");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit");
        System.out.println("3. Check withdraw");
        System.out.println("4. Transfer cash");
        System.out.println("5. Quit");

    }

    public void checkBalance() {
        System.out.println("You balance is:" + runningBalance);

    }

    public void performDeposit() {
        // ? get the amount to deposit
        System.out.println("Enter amount to deposit");
        double amountToDeposit = scanner.nextDouble();
        if (amountToDeposit > 0) {
            // ? add the amount to the balance
            runningBalance += amountToDeposit; // runningBalance = runningBalance+ amountToDeposit

            System.out.println("Deposit successful. New Balance: " + runningBalance);
        } else {
            System.out.println("Invalid input");
        }

    }

    public void performWithdrawal() {
        // ? get the amount to withdraw
        System.out.println("Enter amount to withdraw: ");
        double amountToWithdraw = scanner.nextDouble();
        // ? calculate the amount to withdraw + charges
        if (amountToWithdraw > 0) {
            double totalWithdrawal = amountToWithdraw + (WITHDRAWAL_CHARGES * amountToWithdraw);

            // ? check if running balance is sufficient
            if (totalWithdrawal <= runningBalance) {
                runningBalance -= totalWithdrawal;
                System.out.println("Withdrawal successful, New balance: " + runningBalance);
            } else {
                System.out.println("Insufficient funds. ");
            }
        } else {
            System.out.println("Invalid withdrawal input. Enter valid amount: ");
        }

    }

    public void performTransfer() {
        // ? get the amount to withdraw
        System.out.println("Enter amount to transfer: ");
        double amountToTransfer = scanner.nextDouble();
        // ? subtract the amount from the balance

        if (amountToTransfer > 0 && amountToTransfer <= runningBalance) {
            runningBalance -= amountToTransfer;
            System.out.println("Tansfer succesfull, new balance: " + runningBalance);

        } else {
            System.out.println("Insufficient funds");
        }

    }

    public void printReceipt() {
        System.out.println();

    }

}
