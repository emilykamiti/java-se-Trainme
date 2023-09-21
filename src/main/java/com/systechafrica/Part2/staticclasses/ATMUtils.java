package com.systechafrica.part2.staticclasses;

public class ATMUtils {
    public static String maskCardNumber(String cardNumber) {
        String mask = "xxxx-xxxx-xxxx";

        String  postfix = cardNumber.substring(12, cardNumber.length());
        
        return mask + postfix;
    }
}
