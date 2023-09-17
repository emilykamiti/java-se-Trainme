package com.systechafrica.Part2.casting;

import com.systechafrica.Part2.inheritance.animals.Animal;
import com.systechafrica.Part2.inheritance.animals.Cat;
import com.systechafrica.Part2.inheritance.animals.Dog;

public class CastingDemo {
    public static void main(String[] args) {
        CastingDemo app = new CastingDemo();
        Animal animal = new Cat();
        app.printInfo(animal);

            
        
    }
    public void printInfo(Animal animal){
        Dog dog = (Dog) animal;
        dog.makeSound();

    }
    
}
