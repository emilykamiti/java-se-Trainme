package com.systechafrica.Part2.staticclasses;

public class MathUtilsStaticDemo {
    private String operationName;
    public void printInfo(){
        System.out.println("Printing");

    }
    public static class Calculator {
        public static int add(int a, int b) {
            MathUtilsStaticDemo math = new MathUtilsStaticDemo();
            System.out.println(math.operationName); //! that to access the on-static member,
            math.printInfo();  //! you need an object of the enclossing class
            return a + b;
        }
        
        public static long add(long a, long b) {
    return a + b;
        }
         public static long add(long a, long b, long c) {
    return a + b + c;
        }
        
        

    public static int multiply(int a, int b){
        return a * b;
    }
    }
    //public static sum(int a, int b){
    //     return Calculator.add(a, b);
    // }
    public static class Area extends Calculator{
        public static int square(int a, int b){
            return multiply(a, b);
        }
    }
}
