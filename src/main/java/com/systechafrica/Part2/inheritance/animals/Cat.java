package com.systechafrica.Part2.inheritance.animals;

public class Cat extends Animal {
    
    @Override
    public void makeSound(){
        System.out.println("Cat meows");
    }
    @Override
    public String toString(){
        return "Cat";
    }
}
