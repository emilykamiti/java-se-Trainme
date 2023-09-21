package com.systechafrica.part2.interfaces;

public class Rectangle implements CalculateArea, CalculatePerimeter {

    @Override
    public double calculatePerimeter(double x, double y) {
        System.out.println(MY_NAME);
        return 2*(x+y);
    }

    @Override
    public double calculatorArea(double x, double y) {
        System.out.println(MY_NAME_FULL);
        return (x*y);
    }

    @Override
    public double sum(int a, int b) {
        return a + b;
        
    }

    
}
