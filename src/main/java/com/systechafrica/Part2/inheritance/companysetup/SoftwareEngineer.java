package com.systechafrica.Part2.inheritance.companysetup;

public class SoftwareEngineer extends Employee {
    private String title;

    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    public String toString(){
        return "Name: " +   getEmployeeName() + " No: " + getEmployeeNo()+" Address: " + getEmployeeAddress() +
        " Title: "+getTitle();
}
}
