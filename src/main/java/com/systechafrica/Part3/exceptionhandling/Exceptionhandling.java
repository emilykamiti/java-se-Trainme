package com.systechafrica.Part3.exceptionhandling;

 

public class Exceptionhandling {
    
    public static void main(String[] args) { 
        Calculator calculator = new Calculator();;
     try {
         double result = calculator.divide(6L, 0L);
        System.out.println(result);
     } catch (Exception e) {
        System.out.println(e.getMessage());
     }
     try {
        calculator.sum(2, 2);
        try {
            calculator.divide(0, 0);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    } catch (MyCustormException e) {
        System.out.println(e.getMessage());
    }
        System.out.println("Processing data....");

    }
}
