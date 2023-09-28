package com.systechafrica.Part3.exceptionhandling;

import java.util.Scanner;

public class Exceptionhandling {

    public static void main(String[] args) {
        Exceptionhandling app = new Exceptionhandling();
        Calculator calculator = new Calculator();
        // app.workingwithBasicException(calculator);
        app.workingWithException();
    }
    private Student readStudentDetails(){
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

            try {
               System.out.println("Enter your details space seperated: ");
              String name = scanner.next(); 
               student.setName(name);
              String regNo = scanner.next(); 
              student.setRegNo(regNo);
              String email= scanner.next();
              student.setEmail(email);
              System.out.println("Enter your age");
              int age = scanner.nextInt(); 
            } catch (Exception e) {
              System.out.println(e.getMessage());
            }finally{
                System.out.println("Release resources....");
                scanner.close();
            }
            return student;
    }

    private void workingWithException() {
        StudentController studentcontroller = new StudentController();
       try {
        studentcontroller.addStudent(readStudentDetails());
        //send message
        SMSSender sender = new SMSSender();
        sender.sendMessage("Your students have been saved");
       
       } catch (Exception e) {
        System.out.println(e.getLocalizedMessage());
       }finally{
        //release resources
        studentcontroller = null;
        System.out.println("Executes no matter");
       }
        
    }

    private void workingwithBasicException() {
        Calculator calculator = new Calculator();
        try {
            double result = calculator.divide(6L, 0L);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            calculator.sum(2, 2);
            try {
                calculator.divide(0, 0);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        } catch (MyCustormException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Processing data....");
    }
}
