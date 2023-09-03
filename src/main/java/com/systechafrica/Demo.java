package com.systechafrica;


public class Demo {
    // Instance method
        public int addTwoNumbers(int a, int b){ //? instance method doesn't  have the word static
            int result = a + b;
            return result;
        }
    // class method
    public static int add(int a, int b){ //? if it has Static, it makes it a class method or vairable
    int result = a + b;
    return result;
    
        }
    
    public static void main(String ...args){
        Demo demo= new Demo();
        demo.addTwoNumbers(5, 10);
        add(5, 10);
    
    }
     //? whenever you are working with utility classes you require 
     //? to heavily make use of class variables and methods => ought to be declared.

    
}
