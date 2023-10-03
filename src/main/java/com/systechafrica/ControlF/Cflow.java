package com.systechafrica.ControlF;

import java.util.logging.Logger;

import com.systechafrica.Util.ValidateInput;

public class Cflow {
public static final Logger LOGGER = Logger.getLogger(Cflow.class.getName());

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
        String day = "Unknown";
        ValidateInput.validate(day);
        switch(day){
            case "MONDAY":
                LOGGER.info( "Monday is a working day");
                break;  
            case "TUESDAY":
                LOGGER.info( "Tuesday is a working day");
                break;
            case "WEDNESDAY":
                LOGGER.info( "Wednesday is a working day");
                break;
            case "THURSDAY":
                LOGGER.info( "Thursday is a working day");
                break;
            case "FRIDAY":
                LOGGER.info( "Friday is a working day");
                break;
            case "SATURDAY":
            case "SUNDAY":
                LOGGER.info("Party");
                break;
            default:
                LOGGER.info("Please specify a valid day");
        }
    }
   

public static void main(String[] args) {
    Cflow app = new Cflow();
    //app.ifelseStatement();
    app.switchStatement();
}
}