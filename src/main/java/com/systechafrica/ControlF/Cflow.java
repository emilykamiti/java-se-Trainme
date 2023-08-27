package com.systechafrica.ControlF;

import java.util.logging.Logger;

public class Cflow {
public static final Logger LOGGER = Logger.getLogger(Cflow.class.getSimpleName());

    public void ifelseStatement(){
    
    int maths = 65;
    char grade;

    if(maths >= 70) {
        grade = 'A';

    }else if (maths >= 60) {
        grade = 'B';

    } else if ( maths >= 50) {
        grade = 'C';
    }else{
        grade = 'F';
    }
    //! TO DO  add conditions to assign gardes variables as expected
     LOGGER.info("Student grade: " + grade); 
}
    public void switchStatement(){

    }
    

public static void main(String[] args) {
    Cflow app = new Cflow();
    app.ifelseStatement();
    app.switchStatement();
}
}