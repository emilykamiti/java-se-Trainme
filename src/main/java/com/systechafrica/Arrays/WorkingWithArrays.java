package com.systechafrica.Arrays;

import java.util.logging.Logger;

public class WorkingWithArrays {
    
     private static final Logger LOGGER = Logger.getLogger(WorkingWithArrays.class.getName());

     public void singleDimensionalArray(){
        int[] numbers = {45, 10, 26, 35, 40, 50 };
        
        int ages[] = {45, 10, 26, 35, 40, 50}; // c/c++ array is valid  in java, not commonly used

        String[] nickName = {"Emily", "Joy", "Nasinza"};

        

        for (int i = 0; i < numbers.length; i++){
            LOGGER.info(""+numbers[i]);

        }
        LOGGER.info(nickName[0]);
        LOGGER.info(nickName[1]); 
        LOGGER.info(nickName[2]);

        int[] a = {45, 10, 26, };
        for (int i = 0; i < a.length; i=i+2){
         LOGGER.info(nickName[i]);
        }
      }
   

      public void multiDimensionalArray(){
         int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

         //length of multidimensional array we count the number of elements with in the parent array
         int length = matrix.length;
         LOGGER.info("Length of multi dimension array: " + length);
         LOGGER.info("Number: " + matrix[2][1]);
 
         int[][] matrix3 = new int[3][3]; //? indicates a multidimensional array with length of 3 and individual
      
         int[][] matrix4;
         matrix4 = new int[5][];
         // Setting values for the array

         int[][] matrix2 = new int[3][]; //? indicates a multidimensional array with length of 3          
         //row 1
         matrix2[0][0] = 10;
         matrix2[0][1] = 15;
         // row 2
         matrix2[1][2] = 15;
         // row 3
         matrix2[2][0] = 15;

         for (int i = 0; i < matrix2.length; i++){
         for (int j = 0; j < matrix2.length; i++){
            System.out.print(matrix2[1][j] +"  ");

         }
         System.out.println();
      }

      }
     
      public static void main(String[] args) {
        WorkingWithArrays app = new WorkingWithArrays();
        //app.singleDimensionalArray();
        app.multiDimensionalArray();
     }
}
