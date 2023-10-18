package com.systechafrica.part2.interfaces;

public class CookerCharger implements ThreePinPlug {

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
    
}
