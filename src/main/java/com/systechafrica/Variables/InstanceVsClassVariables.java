package com.systechafrica.Variables;

public class InstanceVsClassVariables {
    
static String message = "hello, world";
String message2 = "hello, world";
String output ;
    public static void main(String[] args) {

        SampleClass Ag = new SampleClass();
        System.out.println( SampleClass.name);
        System.out.println( SampleClass.name); // recommended way to 
        System.out.println( Ag.age);
    }
    
    public void  test(){
        System.out.println(message);
        System.out.println(message2);
        output =" Hello, world";
    }
        
    public static void  test2(){
        System.out.println(message);
    // cannot compile, cannot access variables which are not static
    }

    //? An instance variable declared with in the class can only be accessed inside NON STATIC methods of the class.
    //? And if you have to access them you need to create an instance of the class.
}
