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

        LOGGER.info("Integer Minimum " + Integer .MIN_VALUE );
        LOGGER.info("Integer Maximum " + Integer.MAX_VALUE );

        LOGGER.info("Integer Minimum " + Long .MIN_VALUE );
        LOGGER.info("Integer Minimum " + Long .MAX_VALUE );
        
        LOGGER.info("Integer Minimum " + Short .MIN_VALUE );
        LOGGER.info("Integer Minimum " + Short .MAX_VALUE );

        

        // byte, short, long, int
        //? wrapper classes

        byte aPrimitive = 23;
        Byte aWrapper = 23;

        LOGGER.info("byte primitive " + aPrimitive );
        LOGGER.info("Byte wrapper " + aWrapper );

        int a = aWrapper.intValue();

        LOGGER.info("Integer value from Byte wrapper " + a );

        // short
        //short a = 23; 
        Short aShort = 23; //wrapper classes

        // integer
        int c = 23;
        Integer aInt = 23;

        //long
        long d = 23;
        //! You need to explicitly suffix the Long wrapper with L 
        Long aLong = 23L;



    }    
    
    private void floatingTypes(){
        //float types
        float floatRate = 2.123456F;
        double doubleRate = 2.123456;
        LOGGER.info("Float value = " + floatRate);
          LOGGER.info("double value = " + doubleRate);

          //float
          float price = 0.2365F;
          Float priceFloat = 0.2365F;

          //double
          double prtPrice = 0.2365;
          Double priceDouble = 0.2365;
          

    }
    private void characterTypes(){
        //character types
       char grade ='A';
          LOGGER.info("char value = " + grade);

          //character type
          Character characterGrade = 'F';
          
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

        long a = 2147483648L;

        //int b  = a.intValue();
        int c = (int) a;

        LOGGER.info("int b value" + c);
    }
}
