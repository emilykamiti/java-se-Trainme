package com.systechafrica.UserInput;

import java.util.Scanner;

public class atmMachime {

    package com.systechafrica.UserInput;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

class ATMmachine {

    //chek every point in the question where variables are: Declare them and initialize them here. If they are found in class ATMmachine
    public static void main(String[] args) {
        //By using the word final , you ensure that the thhe srting value can not be changed. When you want certain values to remain the same. 
    final String User_name = "Kamiti";
    final String User_password = "Kamiti101";
    
    
    // shows you how many times you've tried logging in.
    int Attempts = 0;
    
    // How much you have in the account
    
    double accountBalance = 1000;
    // Hey computer, make a new Scanner robot that listens to what we type on the keyboard , and let's call it Ear, so we can use it later to listen ..
        Scanner Ear = new Scanner(System.in);
      
    //   While loop. Keep doing somethings as long as  a certain condition is true
        while(Attempts < 3){
            System.out.println("Tell the Ear your secret:");
            
            System.out.println("Your name: ");
            String nameInput = Ear.nextLine();
            System.out.println("Your Password: ");
            String passInput = Ear.nextLine();
            
            Object codeInput;
            if (nameInput.equals(User_name) && passInput.equals(User_password )){
                System .out.println("Welcome you got it right");
                break;
            } else {
                System.out.println("Aaaah Not right, Try again!");
                Attempts++;
                
            }
            
            if (Attempts == 3){
                System.err.println("You number of attempts is over.");
                Ear.close();
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
            }
        }
    }

}
