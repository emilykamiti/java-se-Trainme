package com.systechafrica.UserInput;


import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
     
    final String User_name = "Emily";
    final String User_password = "Kamiti101";
    int attempts = 0;

    
    double accountBalance = 1000;
    Scanner scanner = new Scanner(System.in); 

        while(attempts < 3){
            System.out.println("Tell the Scanner your secret:");
            System.out.print("Your name: ");
            String nameInput = scanner.nextLine();
            System.out.print("Your Password: ");
            String passInput = scanner.nextLine();
            
            
            if (nameInput.equals(User_name) && passInput.equals(User_password )){
                
                System.out.println("Successful");
                break;
            } else {
                System.out.println("Not right, Try again!");
                attempts++;
                
            }
        }
            if (attempts == 3){
                System.err.println("You number of attempts is over.");
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

            System.out.println("Please select an option");
            final int select_option = scanner.nextInt();

            switch (select_option) {
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
                        System.out.print("Insufficient Balance, Your account balance is ksh. " + accountBalance);
                    }
                    break;
                case 4:
                    System.out.print("Service not wworking at a moment");
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.print("Please enter valid input");
                    break;
            }
        }
    }


    }

    

