package com.systechafrica.stringandstringbuilder;

import java.util.logging.Logger;


public class stringBuilderClassDemo {
    private static final Logger LOGGER = Logger.getLogger(stringBuilderClassDemo.class.getName());

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(100); // cappacity not the number of characters
        sb.append(" ");
        String str = " ";

        boolean equals =str.equals(sb.toString()); // str == sb.toString(); comparing addresses -> false
        LOGGER.info(""+equals);
    }
        
}
        