package Visitor;

import java.util.Scanner;

/*
Visitor
цель: описание действий, которые выполняются с каждым объектом в некоторой структуре.

Для чего используется:
позволяет определить новую операцию без изменения классов этих объектов.

Пример:
- в структуре присутствуют объекты многих классов с различными интерфейсами и нам
    необходимо выполнить над ними операции, которые зависят от конкретных классов.
*/

public class Program {
    public static void main(String[] args) {
        Components Computer = new CompComponent();

        Computer.accept(new BadWorker());
        System.out.println();
        Computer.accept(new GoodWorker());

        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.println(">>> Computer repair service <<<\n");
        System.out.println("> Enter the computer service where you would like to repair your computer: ");
        System.out.println("> b - Bad Service");
        System.out.println("> g - Good Service");
        String serviceType = scanner.nextLine();
        while (!serviceType.equals("b") || !serviceType.equals("g")) {
            if (serviceType.equals("b") || serviceType.equals("g")) {
                break;
            }
            System.out.println("ERROR! There is no such button \ninput again");
            System.out.println("> b - Bad Service");
            System.out.println("> g - Good Service");
            serviceType = scanner.nextLine();
        }
        System.out.println("\n> The computer service you've chosen: \n");
        switch (serviceType) {
            case "b":
                Computer.accept(new BadWorker());
                System.out.println();
                break;
            case "g":
                Computer.accept(new GoodWorker());
                System.out.println();
                break;
        }
    }
}
