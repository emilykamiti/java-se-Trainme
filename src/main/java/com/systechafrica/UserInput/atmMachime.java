package com.systechafrica.UserInput;

import java.util.Scanner;

public class atmMachime {

    public static void main(String[] args) {


        final String User_Name = "Kamiti";
        final String user_Password = "Kamiti001";
        int loginTrial = 0;
        double accountBalance = 1000;
        Scanner scanner = new Scanner(System.in);

        while (loginTrial < 3) {
            System.out.println("Input password");

            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String userPassword = scanner.nextLine();

            if (username.equals(User_Name) && userPassword.equals(user_Password)) {
                System.out.println("Login successful");
                break;
            } else {
                System.out.println("Login was unsuccessful. Please try again.");
                loginTrial++;
            }
        }

        if (loginTrial == 3) {
            System.err.println("You have exceeded the maximum login attempts. The system will now stop.");
            scanner.close();
            return;
        }

        while (true) {
            System.out.println("\n***************");
            System.out.println("ATM SIMULATOR");
            System.out.println("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
            System.out.println("ATM SERVICES\n");
            System.out.println("__________________");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer Cash");
            System.out.println("5. Quit");
            System.out.println("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");

            System.out.println("Please choose an option");
            int option_chosen = scanner.nextInt();

            switch (option_chosen) {
                case 1:
                    System.out.println("Your account balance is ksh. " + accountBalance);
                    break;
                case 2:
                    System.out.print("Enter deposit  ");
                    double amountToDeposit = scanner.nextDouble();
                    accountBalance += amountToDeposit;
                    System.out.print("Your new account balance is ksh. " + accountBalance);
                    break;
                case 3:
                    System.out.print("Enter the amount you want to withdraw: ");
                    double amountWithdraw = scanner.nextDouble();
                    double ChargesForWithdraw = amountWithdraw * 0.02;
                    
                    if (amountWithdraw + ChargesForWithdraw < accountBalance) {
                        accountBalance -= (amountWithdraw + ChargesForWithdraw);
                        System.out.print("You have successfully withdrawn ksh. " + amountWithdraw +
                                         ". New balance is ksh. " + accountBalance);
                    } else {
                        System.out.print("Insuffiecient Balanca, Your account balance is ksh. " + accountBalance);
                    }
                    break;
                case 4:
                    System.out.print("Service not wworking at a moment");
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.print("Invalid Input");
                    break;
            }
        }
    }

}
