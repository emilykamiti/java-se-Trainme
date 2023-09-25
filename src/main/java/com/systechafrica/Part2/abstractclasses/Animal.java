package com.systechafrica.part2.abstractclasses;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeseound();

    public void eat() {
        System.out.println(name + " is Eating");
    }

}
