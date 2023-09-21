package com.systechafrica.part2.interfaces;

public class MobileCharger implements ThreePinPlug {

    @Override
    public boolean plugIn() {
        System.out.println("Connected");
        return false;
    }

    @Override
    public boolean plugOut() {
        System.out.println("Disconnected");
        return false;
    }
    public void printInfo(){
        System.out.println("In the mobile charger");
    }
    
}
