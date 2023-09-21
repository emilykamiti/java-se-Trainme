package com.systechafrica.part2.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        ThreePinPlug mc = new MobileCharger();
        ThreePinPlug lc = new LaptopCharger();        
        ThreePinPlug cc = new CookerCharger(); 
        //MobileCharger mc = new MobileCharger();       


        mc.plugIn();
        mc.plugOut();
       // mc.printInfo();

        lc.plugIn();
        lc.plugOut();
        
        
        cc.plugIn();
        cc.plugOut();

        Square sq = new Square();
        System.out.println(sq.calculatePerimeter(5, 5));
        System.out.println(sq.calculatorArea(5, 5));
        //System.out.println(Square.MY_NAME);
        //System.out.println(Square.MY_NAME_FULL); //!access it diectly
        System.out.println(sq.sum(2, 3));


        UserController uc = new UserControllerImpl();
        User user = new User("001", "Emily");
        User createdUser = uc.creatUser(user);

        System.out.println(createdUser);

    }
    
}
