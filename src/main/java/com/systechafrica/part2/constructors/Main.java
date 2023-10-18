package com.systechafrica.part2.constructors;

public class Main {
    int x; // created class variable/attribute

    public Main() {
        x = 5; // ?set the initial value for the class attribute
    }

    public static void main(String[] args) {
        Main m = new Main();
        // m.x = 1 //? you dont have to initialize it again here after its been done
        // under the constructor
        System.out.println(m.x);
    }
}
