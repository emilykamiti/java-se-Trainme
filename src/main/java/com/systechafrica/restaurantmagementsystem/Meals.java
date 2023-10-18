package com.systechafrica.restaurantmagementsystem;

public class Meals{
    

    private String name;
    private double price;

    public Meals(String name, double price){
        this.name = name;
        this.price = price;

    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    
}