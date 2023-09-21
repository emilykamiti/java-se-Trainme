package com.systechafrica.part2.inheritance.companysetup;

public class SoftwareEngineer extends Employee {
    private String title;

    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    @Override
    public String toString(){
        return "Name: " +   getEmployeeName() + " No: " + getEmployeeNo()+" Address: " + getEmployeeAddress() +
        " Title: "+getTitle();
}
}
