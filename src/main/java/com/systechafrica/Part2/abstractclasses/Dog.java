package com.systechafrica.part2.abstractclasses;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);

    }

    @Override
    public void makesound() {
        System.out.println("Woof");

    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        super.move();
    }
    

}
