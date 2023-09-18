package com.systechafrica.Part2.casting;

import com.systechafrica.Part2.inheritance.animals.Animal;
import com.systechafrica.Part2.inheritance.animals.Cat;
import com.systechafrica.Part2.inheritance.animals.Dog;

public class CastingDemo {
    public static void main(String[] args) {
        CastingDemo app = new CastingDemo();
        Animal animal = new Dog(); 
        app.printinfo(animal);                      // upcasting - implicit casting //! we only access the member variables, methods of animal class
                                    //System.out.println(animal.printName()); 
            
        
    
    }
    public void printinfo(Animal animal){
        //System.out.println(animal.printName());
        Dog dog = (Dog) animal;
        System.out.println(dog.printName());
    }
    
}
