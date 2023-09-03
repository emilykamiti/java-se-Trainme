package com.systechafrica.Variables;

import java.util.logging.Logger;

public class VariableScopes {
    private static final Logger LOGGER = Logger.getLogger(VariableScopes.class.getName()); 
     
    //class Variables => they are defined as variables declared outside any class method

private int NoOfmatchesPlayed = 3;

public void SimpleMethod(){
    LOGGER.info("simple method output" );

}
public void complexMethod(){
    LOGGER.info("complex method output");
}

public static void main(String[] args) {
    VariableScopes app = new VariableScopes();
    app.SimpleMethod();
    app.complexMethod();
}
}
