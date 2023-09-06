package com.systechafrica.LoopingStatements.MoreAboutLoops;

import java.util.Scanner;

public class MoreLoops {
    //use while loop to print odd numbers
    public void whileLoop() {
        int n = 1;
        while (n < 100) { // if condition is true, execute
            System.out.println(" "+ n);
            n = n+2;

        }
    }

    public static void main(String[] args) {
        MoreLoops app = new MoreLoops();
        app.whileLoop();

        // ? Cndition comes first
        // ? using the while loop
        // int n = scanner.nextInt();
        // while (n < 1 || n > 10) { // if condition is truen, execute
        // System.out.print(n + " is not betwwen 1 and 10. Try again");
        // n = scanner.nextInt();

        // }

        // System.out.println(n + "is between 1 and 10");
        // }
        //

        // !compasion between while and do while

        // ?while... 0 Iterations
        // int i = 100;
        // while(i <= 5) {
        // System.out.println("hello" + i);
        // i++;
        // }

        // ? do while loop...one Iteration
        // int i = 100;
        // do {
        // System.out.println("Hello" + i);
        // i++;
        // } while(i <= 5);

        // using a do while loop
        // Condition comes later, execuion first.
        // int n;
        // do {
        // System.out.print("enter a number between 1 and 10: ");
        // n = scanner.nextInt();

        // } while(n<1||n>10);
        // System.out.println(n + "is between 1 and 10");
    }
}
