package com.systechafrica.Variables;

import java.util.logging.Logger;

public class VariableScopes {
    private static final Logger LOGGER = Logger.getLogger(VariableScopes.class.getName()); 
     
    //class Variables => they are defined as variables declared outside any class method

//class Scopes variables
private int NoOfmatchesPlayed = 3;


public void SimpleMethod(){
    LOGGER.info("simple method output" + NoOfmatchesPlayed);


}
public void complexMethod(){
    LOGGER.info("complex method output" + NoOfmatchesPlayed);
}

public int addTwoNumbers(int a, int b){ //method variable scope => variables are defined as parameters and
    // variables declared in the outer most part of the method
    // only available as long as the method is executing
    int result = a + b;
    int i;
    for (i = 0; i < 5; i++) {
        LOGGER.info("method output: " + i);

    }

    return result;
}
public static void main(String[] args) { //Non Static field can't exist here on a static reference
    VariableScopes app = new VariableScopes();
    app.SimpleMethod();
    app.complexMethod();
    app.addTwoNumbers(5, 3);
    LOGGER.info("main method output" + app.NoOfmatchesPlayed);
}
}
