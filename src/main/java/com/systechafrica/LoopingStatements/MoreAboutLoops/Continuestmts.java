package com.systechafrica.LoopingStatements.MoreAboutLoops;

import java.util.Scanner;

public class Continuestmts {

    public void breakContinue() {

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(+i);
        }
        System.out.println("This applies to Continue");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(+i);
        }
        System.out.println("This applies to break");
    }

    public static void main(String[] args) {
        Continuestmts app = new Continuestmts();
        app.breakContinue();

    }
}
