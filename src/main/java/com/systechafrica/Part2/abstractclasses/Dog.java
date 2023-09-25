package com.systechafrica.part2.abstractclasses;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);

    }

    @Override
    public void makeseound() {
        System.out.println("Woof");

    }

}
