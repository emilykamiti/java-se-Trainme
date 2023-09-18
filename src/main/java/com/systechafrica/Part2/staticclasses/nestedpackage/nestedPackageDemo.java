package com.systechafrica.Part2.staticclasses.nestedpackage;

import static com.systechafrica.Part2.staticclasses.ATMUtils.maskCardNumber;

public class nestedPackageDemo {
    public static void main(String[] args) {
    String cardNumber = "0123456789245345";
    System.out.println(maskCardNumber(cardNumber)); //xxxxxxxxxxxx6789
    
    }
}
