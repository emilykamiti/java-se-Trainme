package com.systechafrica.Part2.staticclasses;

public class StaticDemo {
 
    public static void main(String... args) {
        int a =10;
        int b =20;
        System.out.println(MathUtils.Geometry.calculateArea(a, b));
        System.out.println(MathUtils.Geometry.calculatePerimeter(a, b));
        System.out.println(MathUtils.Calculator.sum(a, b));
    }
}
