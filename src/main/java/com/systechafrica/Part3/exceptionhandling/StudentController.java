package com.systechafrica.Part3.exceptionhandling;

import java.util.UUID;

public class StudentController {
    public void addStudent(Student student)throws Exception{
        if(student == null){
            throw new StudentDetailsException("no correct student details are found");
        }
        student.setId(UUID.randomUUID().toString());
    }
    
}
