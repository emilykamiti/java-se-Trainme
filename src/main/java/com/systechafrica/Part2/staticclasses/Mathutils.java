package com.systechafrica.Part2.staticclasses;

public class MathUtils {
    public static class Geometry {
        public static final double calculateArea(double x, double y) {
            return x * y;
        }
 public static final double calculatePerimeter(double x, double y) {
            return 2*(x * y);
        }
    }
    public static class Calculator{
        
        public static int sum(int a , int b){
            return a + b;
        }
}

}
 
