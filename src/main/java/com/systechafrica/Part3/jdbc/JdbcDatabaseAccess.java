package com.systechafrica.Part3.jdbc;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.systechafrica.Part3.logging.CustomFormatter;

public class JdbcDatabaseAccess {
    private static final Logger LOGGER = Logger.getLogger(JdbcDatabaseAccess.class.getName());

    public static void main(String[] args)  {
        try {
            FileHandler fileHandler = new FileHandler("poslog.txt");
            CustomFormatter formatter = new CustomFormatter();
            LOGGER.addHandler(fileHandler);
            fileHandler.setFormatter(formatter);

            Class.forName("com.mysql.cd.jdbc.Driver");
            
        } catch (SecurityException e) {
            LOGGER.severe("Un able to connect to the database: " + e.getMessage());
        } catch (IOException e) {
            LOGGER.severe("Not Valid input/output: " + e.getMessage());
        }catch (ClassNotFoundException e) {
            LOGGER.severe("nable to obtain class for jdb driver" + e.getMessage());
    }
}

}