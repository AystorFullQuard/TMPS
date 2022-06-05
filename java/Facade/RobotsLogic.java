package Facade;

import java.util.Scanner;

public class RobotsLogic {
    Scanner scanner = new Scanner(System.in, "Cp866");
    private Compartment compartment = new Compartment();
    private RobotsPower robotsPower = new RobotsPower();
    private CleaningFunctional cleanFunc = new CleaningFunctional();

    public void clean(){
        robotsPower.powerOn();
        compartment.collectTrash();
        System.out.println("Дом чистый?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        String choise = scanner.nextLine();
        if(choise.equals("1")){
            cleanFunc.setIsCleanTrue();
            cleanFunc.cleaning(compartment);
            robotsPower.powerOff();
        } else if(choise.equals("2")){
            cleanFunc.setIsCleanFalse();
            cleanFunc.cleaning(compartment);
            robotsPower.powerOff();
        }
        else {
            System.out.println("Нет такой кнопки");
        }
    }

    public void disposeTrash(){

        robotsPower.powerOn();
        compartment.disposeTrash();
        System.out.println("Дом чистый?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        String choise = scanner.nextLine();
        if(choise.equals("1")){
            cleanFunc.setIsCleanTrue();
            cleanFunc.cleaning(compartment);
            robotsPower.powerOff();
        } else if(choise.equals("2")){
            cleanFunc.setIsCleanFalse();
            cleanFunc.cleaning(compartment);
            robotsPower.powerOff();
        }
        else {
            System.out.println("Нет такой кнопки");
        }

    }

}
