package com.systechafrica.Part2.Classes;

import java.util.logging.Logger;

public class Intern {
    public static final Logger LOGGER = Logger.getLogger(Intern.class.getName());
    String name;
    String phoneNumber;
    String email;

    public Intern(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.doAssignments();

    }

    public Intern() {

    }

    public void attendClass() {
        LOGGER.info("Attended Class");

    }

    public void doAssignments() {
        LOGGER.info("Do assigments");

    }

}
