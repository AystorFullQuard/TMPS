package Facade;

public class RobotsPower {

    private Boolean power = false;

    void powerOn(){
        System.out.println("Питание робота включено");
        power = true;
    }

    void powerOff(){
        System.out.println("Питание робота выключено");
        power = false;
    }

}
