package com.systechafrica.Maths;

import java.util.Scanner;

public class Calculator {
    // Instance => does not have static keyword => ca only be accessed using objects
    public int sum(int a, int b, int ...othernumbers){ //! var args
        int sum = a+b;

        int othernumberslength;
        for (int i = 0; i < othernumbers.length; i++){
              sum += othernumbers.length;
}
        return sum;

    }
   
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a list of space sepe rated numbers");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            int e = scanner.nextInt();
            System.out.println(calculator.sum(a, b, c, d, e));
            System.out.println(calculator.sum(10, 5,5, 20, 100, 45, 85));
    }
}
