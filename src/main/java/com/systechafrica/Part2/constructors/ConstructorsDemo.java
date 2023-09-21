package com.systechafrica.part2.constructors;

public class ConstructorsDemo {

    public static void main(String[] args) {
        Book b1 = new Book(2022, "introduction", true);
        Book b2 = new Book(2022, "introduction", true);

        // not equal because of the new keyword
        if (b1.equals(b2)) {
            System.out.println("Are equal");
        } else {
            System.out.println("Not equal");
        }
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }

}
