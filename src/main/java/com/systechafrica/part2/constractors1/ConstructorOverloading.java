package com.systechafrica.part2.constractors1;

public class ConstructorOverloading {
    int a = 0;
    int b = 0;
    double c = 0;

    ConstructorOverloading() {
        a = 10;
        b = 20;
        c = 30.3;
    }

    // Parameterized constructor
    ConstructorOverloading(int a, int b) {
        // this key word //? instead creating another variable name we can use this key
        // word
        this.a = a;
        this.b = b;
    }

    ConstructorOverloading(int x, double y) {
        a = x;
        c = y;
    }

    ConstructorOverloading(int x, int y, double z)

    {
        a = x;
        b = y;
        c = z;
    }

    ConstructorOverloading(int x, double y, int z) {
        a = x;
        b = z;
        c = y;
    }

    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        // ConstructorOverloading co = new ConstructorOverloading(); // first
        // constructor
        // ConstructorOverloading co = new ConstructorOverloading(1, 2); // second
        // constructor
        // ConstructorOverloading co = new ConstructorOverloading(1, 2.5); //Third
        // constructor
        // ConstructorOverloading co = new ConstructorOverloading(1, 2, 4.10); //Fourth
        // constructor
        ConstructorOverloading co = new ConstructorOverloading(1, 2.76, 4); // Fi constructor
        co.display();

    }
}
