package com.systechafrica.stringandstringbuilder;

import java.util.logging.Logger;

import com.systechafrica.App;

public class stringBuilderClassDemo {
    private static final Logger LOGGER = Logger.getLogger(stringBuilderClassDemo.class.getName());

    public static void main(String[] args) {
        

        //? strings are immutable that is once created then can't be modified
        //? unless they are re assigned again

        String message = "Hello";
        //no effect
        message.concat(" world!"); //immutabilty
         //Has effect by reassigning
        message = message.concat(" Programmer!");

        LOGGER.info(message);
    }
}
