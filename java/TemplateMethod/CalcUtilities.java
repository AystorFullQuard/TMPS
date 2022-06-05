package TemplateMethod;

import java.util.Scanner;

public abstract class CalcUtilities {
    Scanner scanner = new Scanner(System.in, "Cp866");
    protected double valueAmount;
    protected double moneyAmount;

    public void showInfo(){
        valueAmount = 0;
            try {
                valueAmount = scanner.nextDouble();
            } catch (Exception e){

                System.out.println("Ошибка, введите верно число");
            }
        calcValue();
        System.out.println("С вашего счета снимуться такое количество денег: " + moneyAmount);
    }
    abstract void calcValue();
}
