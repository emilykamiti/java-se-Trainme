package com.systechafrica.Arrays;

import java.util.ArrayList;

public class ArraysPro {
    public static void main(String[] args) {
        String[] fruits = new String[5]; //change size when you add or remove an item
        fruits[0] = "Pawpaw";
        fruits[1] = "Mango";
        fruits[2] = "Banana";
        fruits[3] = "Oranges";
        fruits[4] = "Watermelon"; // regular array, we would have to create a new index

        System.out.println(fruits);
    

        //array list is more flexible
        ArrayList fruitList = new ArrayList();
        fruitList.add("Pawpaw");
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Oranges");
        fruitList.add("Watermelon"); //automatically added this
        
        fruitList.remove("Pawpaw");
        //fruitList.clear();
        System.out.println(fruitList.contains( "Raspberry"));
        System.out.println(fruitList);
    }
}
