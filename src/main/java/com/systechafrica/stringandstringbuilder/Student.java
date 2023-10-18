package com.systechafrica.stringandstringbuilder;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String regNo;
    private String address;
    private String nickName;
   
    public String getfullDetails(){
        StringBuilder sb = new StringBuilder();
        sb.append(firstName)
        .append(" ")
        .append(lastName)
        .append(" ")
        .append(email)
        .append("");
        return sb.toString();
    }
    
    public String getfullDetails2(){
       return  firstName + " "+lastName+" "+email+"";
       
    }
    
}
