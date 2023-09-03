package com.systechafrica.Variables;

import javax.sound.sampled.SourceDataLine;

public class InstanceVsClassVariables {
    
Static String message = "hello, world";
String message = "hello, world";
    public static void main(String[] args) {

        SampleClass Ag = new SampleClass();
        System.out.println( SampleClass.name);
        System.out.println( SampleClass.name); // recommended way to 
        System.out.println( Ag.age);
    }
    SourceDataLine
}
