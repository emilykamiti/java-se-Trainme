package com.systechafrica.part2.casting;

import com.systechafrica.part2.inheritance.animals.Animal;
import com.systechafrica.part2.inheritance.animals.Cat;
import com.systechafrica.part2.inheritance.animals.Dog;

public class CastingDemo {
    public static void main(String[] args) {
        CastingDemo app = new CastingDemo();
        Animal animal = new Cat(); //?n1 up casting
        Animal animal2 = new Dog(); //?n1 up casting
        
                                    //! we only access the member variables, methods of animal class             
        app.printinfo(animal);
        app.printinfo(animal2);
                                        
        //System.out.println(animal.printName()); n2 compilation fails as the method is only defined in the subclass
        // Dog dog = new Animal(); .. compilation, dog is not a super class to the animal
            
        
    
    }
    public void printinfo(Animal animal){
        if(animal instanceof Dog){

    
        Dog dog = (Dog) animal; //n2
        System.out.println(dog.printName()); //n3
        }else if( animal instanceof Cat){
             Cat cat = (Cat) animal; 
        System.out.println(cat.printName()); 
        }
    }
    
}
