package com.systechafrica.Part2;

public class ClassesDemo {

    public static void main(String[] args) {
        ClassesDemo app = new ClassesDemo();
        //app.carInstance();
        app.interns();
        //app.calculator();
    }
    public void calculator(){
        // using methods
        //! constructors are special methods used to create instances of a particular class.
       //! They have same name as the class
       //! They do not have return types
        Calculator calculator = new Calculator();
        calculator.displayWelcomemessage(); // calling a method without parameters and return type
        int result = calculator.add(5, 3); //calling a method with parameters and return type
        System.out.println("The sum is: " + result);

    
    }

    public void interns() {
        Intern emily = new Intern();
        emily.name = "Nasinza";
        emily.phoneNumber = "0742733947";
        emily.email = "emilykamiti@gmail.com";
        emily.doAssignments();
        emily.attendClass();

        Intern emma = new Intern("Emma", "", "");
        //emma.name = "Emma";
        //emma.phoneNumber = "0115550654";
        //emma.email = "augustbux@gmail.com";
        emma.doAssignments();
        emma.attendClass();
        System.out.println(emma.name);

        for (int i = 0; i<=10; i++){
            Intern intern = new Intern(" Intern: " + i, ""+i, ""+i);
            intern.doAssignments();
            System.out.println(intern.name);
        }
    }

    public void carInstance() {
        Car forester = new Car();
        forester.color = "blue";
        forester.speed = 60;

        // drive
        forester.startEngine();
        forester.accelerate();

        Car marcedes = new Car();
        marcedes.color = "blue";
        marcedes.speed = 60;

        // drive
        marcedes.startEngine();
        marcedes.accelerate();
    }

}
