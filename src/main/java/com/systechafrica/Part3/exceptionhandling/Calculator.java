package com.systechafrica.Part3.exceptionhandling;

public class Calculator {
    public double divide(int a, int b) {
        double result = 0.0;

        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;

        }
        return result;
    }
    
    public double divide(long a, long b) {
        double result = 0.0;
            result = a / b;

        return result;
    }
    public int sum(int a, int b) throws MyCustormException{
        throw new MyCustormException("message not implementented ");
            // Exception e = new MyCustorm("Method not implemented")
    }
// NullPointerException
// public boolean connect() throws ClassNotFoundException{
//     Class.forName("com.mysql.cj.jdbc.Driver");

// return true;
// }
}

