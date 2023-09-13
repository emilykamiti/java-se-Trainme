package com.systechafrica.Part2.inheritance;

import java.util.logging.Logger;

import com.systechafrica.Part2.inheritance.companysetup.QualityAssurance;
import com.systechafrica.Part2.inheritance.companysetup.SoftwareEngineer;

public class InheritanceDemo extends Object {
    private static final Logger LOGGER = Logger.getLogger(InheritanceDemo.class.getName());

public static void main(String[] args) {
    InheritanceDemo app = new InheritanceDemo();
    app.companySetup();
}

public void companySetup(){
    SoftwareEngineer e1 = new SoftwareEngineer();
    e1.setEmployeeName("Emily");
    e1.setEmployeeNo("001");
    e1.setEmployeeAddress("Nakawa - Kampala");
    e1.setTitle("Software Engineer");
    LOGGER.info("SoftwareEngineer => " +e1.toString());

     QualityAssurance qa = new QualityAssurance();
    qa.setEmployeeName("Nasinza");
    qa.setEmployeeNo("002");
    qa.setEmployeeAddress("westlands");
    qa.setTitle("Software Engineer in test");
    LOGGER.info("QualityAssurance => " +qa.toString());

}
}
