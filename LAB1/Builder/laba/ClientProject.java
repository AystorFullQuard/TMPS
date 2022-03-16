/*
Шаблон Builder 
Цель
Отделить конструирование сложного объекта от его представления таким образом,
 чтобы в результате одного и того же конструирования мы могли получить разные представления.

Используется для создания различных объектов из одного набора данных

Пример использования:
- порядок создания сложного объекта не должен зависеть от того, 
    из каких частей состоит объект и того, как эти объекты взаимосвязаны;
- процесс конструирования объекта должен предоставлять 
    различные представления объектка, к-ый мы конструируем.
 */
package laba;

import java.util.Scanner;

public class ClientProject {
    public static void main(String[] args) {
        // Director director = new Director();

        // director.setBuilder(new MiddleDevBuilder());

        // Developer dev = director.BuildDeveloper();
        // System.out.println(dev);

        Director director = new Director();
        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.println(">>> You are searching for developer for your work <<<\n");
        System.out.println("> Enter the developer type you would like to choice: ");
        System.out.println("> j - Junior Developer");
        System.out.println("> m - Middle Developer");
        System.out.println("> s - Senior Developer");

        String DeveloperType = scanner.nextLine();
        while (!DeveloperType.equals("j") || !DeveloperType.equals("m") || DeveloperType.equals("s")) {
            if (DeveloperType.equals("j") || DeveloperType.equals("m") || DeveloperType.equals("s")) {
                break;
            }
            System.out.println("ERROR! There is no such button \ninput again");
            System.out.println("> j - Junior Developer");
            System.out.println("> m - Middle Developer");
            System.out.println("> s - Senior");
            DeveloperType = scanner.nextLine();
        }
        System.out.println("\n> The Developer type you have chosen: \n");
        switch (DeveloperType) {
            case "j":
                director.setBuilder(new JuniorDevBuilder());
                Developer dev1 = director.BuildDeveloper();
                System.out.println(dev1);
                break;
            case "m":
                director.setBuilder(new MiddleDevBuilder());
                Developer dev2 = director.BuildDeveloper();
                System.out.println(dev2);
                break;
            case "s":
                director.setBuilder(new SeniorDevBuilder());
                Developer dev3 = director.BuildDeveloper();
                System.out.println(dev3);
                break;
        }
    }
}
