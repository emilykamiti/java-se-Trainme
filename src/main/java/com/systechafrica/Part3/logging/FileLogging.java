package com.systechafrica.Part3.logging;

import java.io.IOException;
import java.util.logging.*;

public class FileLogging {
    private static final Logger LOGGER = Logger.getLogger(FileLogging.class.getName());

    public static void main(String[] args) throws SecurityException, IOException {
        FileHandler fileHandler = new FileHandler("log.txt");
        CustormFormatter formatter = new CustormFormatter();
        LOGGER.addHandler(fileHandler);
        fileHandler.setFormatter(formatter);

        LOGGER.severe("Error message\n");
        LOGGER.warning("Waring message info\n");
        LOGGER.info("Info message");
        test();
    }

    public static void test(){
        LOGGER.severe("Error message logging test \n");
        LOGGER.warning("Waring message logging test\n");
        LOGGER.info("Info message logging test");

    }

    static class CustormFormatter extends Formatter{

        @Override
        public String format(LogRecord record) {
           String method = record.getSourceMethodName();
           String level = record.getLevel().getName();
           String message = record.getMessage();
            return method + " | " + level + " | " + message;
        }

    }
}
