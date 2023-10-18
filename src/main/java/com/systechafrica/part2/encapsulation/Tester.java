package com.systechafrica.part2.encapsulation;

public class Tester {
    public static void main(String[] args) {
        Student student = new Student();
        student.setMarks(-50); // student.age = 29 would run if the varible were not private
        student.setAge(29);
        student.setName("Emily");

        System.out.println(student.getAge());
        System.out.println(student.getName());
        System.out.println(student.getMarks());

    }
}
