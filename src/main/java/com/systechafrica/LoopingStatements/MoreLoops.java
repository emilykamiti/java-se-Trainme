package com.systechafrica.LoopingStatements;

import java.util.Scanner;

public class MoreLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        while (n < 1 || n > 10) {
            System.out.print(n + " is not betwwen 1 and 10. Try again");
            n = scanner.nextInt();

        }

        System.out.println(n + "is between 1 and 10");
    }

}
