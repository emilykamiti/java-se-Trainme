package com.systechafrica.LoopingStatements.MoreAboutLoops;

import java.util.Scanner;

public class ForLoopsMastery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ?The variable can be declared and set inside the loop and can be accesssed
        // only with in the loop
        // for(int i= 1; i<=5; i++){
        // System.out.println("Hello: " + i);
        // }
        // }

        // ?The variable when when declared outside the loop and can be accessed both
        // inside and outside the loop
        // ?i can be accessed from with in and outside the loop
        // ? Variable can be initialized outside

        int i = 1;
        for (; i <= 5; i++) {
            if(i == 3){
                break;
            }
            System.out.println("Hello: " + i);

        }
        System.out.println("Hello: " + i);
    }

}
