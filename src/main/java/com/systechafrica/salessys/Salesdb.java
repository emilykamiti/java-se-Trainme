package com.systechafrica.salessys;

import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.systechafrica.Part3.logging.CustomFormatter;

public class Salesdb {
private static final Logger LOGGER = Logger.getLogger(Salesdb.class.getName());

    public static void main(String[] args) {
        try {
        FileHandler fileHandler = new FileHandler("log.txt");
        CustomFormatter formatter = new CustomFormatter();
        LOGGER.addHandler(fileHandler);
        fileHandler.setFormatter(formatter);
            
        } catch (Exception e) {
           
        }
       
    }

    
}
