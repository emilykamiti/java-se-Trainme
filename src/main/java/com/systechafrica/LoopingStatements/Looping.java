package com.systechafrica.LoopingStatements;

import java.util.logging.Logger;



public class Looping {
    private static final Logger LOGGER = Logger.getLogger(Looping.class.getName());

    public void forloop(){
       
        // initialize condition update
        for( int counter = 0; counter <= 10; counter = counter + 1 ){
                LOGGER.info("Count = " + counter);
        }
         for( int counter = 0; counter <= 10; counter = counter += 1 ){
                LOGGER.info("Count = " + counter);
        }for( int counter = 0; counter <= 10; counter = counter ++ ){
                LOGGER.info("Count = " + counter);
        }
    }
    public void whileloop(){
       
        // initialize condition update
        int studentCount = 0;
        while (studentCount < 10){
            LOGGER.info("Student Count = " + studentCount);
           studentCount++; //
        }
        }
        // do somethig while the condition is true
    public void dowhileloop(){
        int studentCount = 0;
        do {
            LOGGER.info("Student Count = " + studentCount);
            studentCount++;

        } while(studentCount < 10);
    }  

    public void breakjumpStatements(){

    }
    public void breakJumpstatements(){
        LOGGER.info("before my loop");
        for (int index = 0; index < 10; index++){
            if(index == 5){
                break;
            }
            LOGGER.info("my index is: " + index);
        }
        LOGGER.info("after my loop ");
    }
    public void continueJumpstatements(){
        LOGGER.info("before my loop");
        for (int index = 0; index < 10; index++){
            if(index == 5){
                continue;
            }
            LOGGER.info("my index is: " + index);
        }
        LOGGER.info("after my loop ");
    }
public static void main(String[] args) {
   Looping app  = new Looping();
    //app.ifelseStatement();
    //app.switchStatement();
    //app.forloop();
   // app.whileloop();
    //app.dowhileloop();
    app.continueJumpstatements();
    app.breakJumpstatements();
}
}