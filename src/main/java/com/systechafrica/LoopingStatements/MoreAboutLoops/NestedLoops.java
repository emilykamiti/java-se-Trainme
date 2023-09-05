package com.systechafrica.LoopingStatements.MoreAboutLoops;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // for (int i = 0; i<3; i++){
        //     for (int j = 0; j < 2; j++)
        //         System.out.println(i +" " + j);

        //         System.out.println();

            
        // }
        for(int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++)
            System.out.print((i*j) +" ");

            System.out.println();
        }
    }
    
}
