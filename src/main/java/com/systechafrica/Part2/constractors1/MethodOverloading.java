package com.systechafrica.part2.constractors1;

//!method overloading: many methods in one class
public class MethodOverloading {
    int a;
    int b;

    void sum() // no parameters: first method
    {
        a = 10;
        b = 20;
        System.out.println(a + b);
    }

    // You can use this key 

    void sum(int a, int b) // taking parameter
    { 
        this.a = a;
        this.b = b;

        System.out.println(a + b);

    }

    void sum(int x, int y, int z) // taking 3 different parameters: third method
    {
        System.out.println(x + y + z);
    }

    void sum(int x, double y) // different data types : fourth method
    {
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.sum(); // call first method
        mo.sum(100, 200); // call second method
        mo.sum(100, 20, 10); // third method
        mo.sum(10, 20.8); // fourth
    }
}
