package com.systechafrica.Part2;

public class Car {
    // Instance Variables
    String color;
    int speed;

    void startEngine() {
        System.out.println("Engine Started!");

    }
    void accelerate(){
        speed += 10;
        System.out.println("Speed Increased is " + speed +"km/hr");
    }

}
