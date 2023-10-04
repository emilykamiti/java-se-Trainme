package com.systechafrica.part2.abstractclasses;

public abstract class Animal implements Behavior {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makesound();

    public void eat() {
        System.out.println(name + " is Eating");
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        
    }
    
}
