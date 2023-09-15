package com.systechafrica.Part2.encapsulation;

public class Student {
    private int marks;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    // public void setAge(int age) {
    //     this.age = age;
    // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter
    int getMarks() {
        return marks;
        //return this.marks; //? you can use this key word if you want. But its a good practice to use it
    }

    //Setter
    void setMarks(int newMarks) {
        if(marks >=0 && marks<=100){
            this.marks = newMarks;
        }
        else{
            System.out.println("Please enter valid marks");
        }
    }
    
    
}
