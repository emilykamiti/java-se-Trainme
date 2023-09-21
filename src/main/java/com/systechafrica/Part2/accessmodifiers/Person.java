package com.systechafrica.part2.accessmodifiers;

public class Person {
    private String name;
    private String email;

    private boolean promoted;
    //click alt and enter
    //setters and getters

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setEmail(String email){
        this.email = email;

    }
    public String getEmailString(){
        return this.email;
    }


    public Person(String name, String email){
        this.name = name;
        this.email = email;

    }
    public Person(){

    }
    public void printPersonalDetails() {
        System.out.println(email + " " + name);
    }

   public String getPersonalDetails(){
    return email +  "" + name;
    

   }
public String getEmail() {
    return email;
}
public boolean isPromoted() {
    return promoted;
}
public void setPromoted(boolean promoted) {
    this.promoted = promoted;
}
}

