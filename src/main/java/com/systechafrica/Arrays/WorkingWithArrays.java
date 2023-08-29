package com.systechafrica.Arrays;

import java.util.logging.Logger;

public class WorkingWithArrays {
    
     private static final Logger LOGGER = Logger.getLogger(WorkingWithArrays.class.getName());

     public void singleDimensionalArray(){
        int[] numbers = {45, 10, 26, 35, 40, 50 };
        
        String[] nickName = {"Emily", "Joy", "Nasinza"};

        for (int i = 0; i < numbers.length; i++){
            LOGGER.info(""+numbers[i]);

        }
        LOGGER.info(nickName[0]);
        LOGGER.info(nickName[1]); 
        LOGGER.info(nickName[2]);
        

     }
      public static void main(String[] args) {
        WorkingWithArrays app = new WorkingWithArrays();
        app.singleDimensionalArray();
     }
}
