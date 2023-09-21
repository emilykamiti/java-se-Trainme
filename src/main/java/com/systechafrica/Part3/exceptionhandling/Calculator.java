package com.systechafrica.Part3.exceptionhandling;

public class Calculator {
        public double divide(int a , int b){
            double result = 0.0;
            try{
                return a / b;
            }catch(Exception e){
                System.out.println(e.getMessage());
                return 0;
            }
        }
        
    }
    

