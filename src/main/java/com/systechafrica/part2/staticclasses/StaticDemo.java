package com.systechafrica.part2.staticclasses;

public class StaticDemo {
 
    public static void main(String... args) {
        int a =10;
        int b =20;
        System.out.println(MathUtils.Geometry.calculateArea(a, b));
        System.out.println(MathUtils.Geometry.calculatePerimeter(a, b));
        System.out.println(MathUtils.Calculator.sum(a, b));
        String name = " ";
        boolean nameEmptyOrNull = StringUtils.isNullOrEmpty(name);
        System.out.println("nameEmptyOrNull " + nameEmptyOrNull);

        String password = "  Admin123  ";
        String comfirmPassword = "Admin123";

        if(StringUtils.trim(password).equals(StringUtils.trim(comfirmPassword))){
        System.out.println("Passwords are equal");

    }
    String cardNumber = "0123456789245345";
    System.out.println(ATMUtils.maskCardNumber(cardNumber));
    }
}
