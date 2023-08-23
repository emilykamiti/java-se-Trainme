package com.systechafrica.Variables;

import java.util.logging.Logger;

public class VarDemo {
    private static final Logger LOGGER = Logger.getLogger(VarDemo.class.getName()); 

    private void variableDeclaration() {
        //? type variablename
        int score = 0;
        LOGGER.info("score for viable is " + score);
    }
    private void constantsVariables() {
        //? constant varibales
        //final type variableName = value;
        final double PI = 3.14159;
        LOGGER.info("constant variable PI = " + PI);
    } 

    public void integerTypes(){
        variableDeclaration();

        LOGGER.info("Integer Minimum " + Integer .MIN_VALUE );
        LOGGER.info("Integer Minimum " + Integer.MAX_VALUE );

        LOGGER.info("Integer Minimum " + Long .MIN_VALUE );
        LOGGER.info("Integer Minimum " + Long.MAX_VALUE );
    }    
    
    private void floatingTypes(){
        //float types
        float floatRate = 2.123456F;
        double doubleRate = 2.123456;
        LOGGER.info("Float value = " + floatRate);
          LOGGER.info("double value = " + doubleRate);
          

    }
    private void characterTypes(){
        //character types
       char grade ='A';
          LOGGER.info("char value = " + grade);
    }

    private void booleanTypes(){
        //boolean types
        boolean isPromoted = false;
        boolean isProcessed = true;
    
        LOGGER.info("false value = " + isPromoted);
        LOGGER.info("true value = " + isProcessed);
    }
     public static void main (String[] args) {
        VarDemo demo = new VarDemo();
        //integer variables
        demo.variableDeclaration();

        demo.constantsVariables();
        demo.integerTypes();
        demo.floatingTypes();
        demo.characterTypes();
        demo.booleanTypes();
    }
}
