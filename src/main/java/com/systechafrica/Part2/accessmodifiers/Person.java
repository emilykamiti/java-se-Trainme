package com.systechafrica.Part2.accessmodifiers;

public class Person {
    private String name;
    private String email;

    // @Override
    // public String toString() {
    // return email + " " + name;
    // }
    public void printPersonalDetails() {
        System.out.println(email + " " + name);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = " Emily";
        person.email = " emilykamiti@gmail.com";
        person.printPersonalDetails();
    }

}
