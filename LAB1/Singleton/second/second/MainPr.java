/*
Шаблон Singleton

Гарантировать, что у класса будет только
 один единственный экземпляр и к нему будет 
 предоставлена глобальная точка доступа.

Используется для создания единственного экземпляра определенного класса.

Пример использования:
- необходим только один экземпляр конкретного класса, который доступен для всех юзеров;

*/
package second;

import java.util.Scanner;

public class MainPr {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in, "Cp866");
        // int SIZE = 4;
        // Thread t[] = new Thread[SIZE];

        // for (int i = 0; i < SIZE; i++) {
        // t[i] = new Thread(new Run());
        // t[i].start();
        // }

        // for (var i = 0; i < SIZE; i++) {
        // t[i].join();
        // }
        // System.out.println((SingTon.str).toUpperCase());
        SingTon CharMoving = SingTon.getInstance();
        System.out.println("Press Enter to start moving your character");
        System.out.println("Control buttons");
        System.out.println("w - Move forward");
        System.out.println("a - Move to the left");
        System.out.println("s - Move backward");
        System.out.println("d - Move to the right");
        System.out.println("S - Stop your moving");
        String move = scanner.nextLine();
        while (true) {
            switch (move) {
                case "":
                    break;
                case "w":
                    CharMoving.str = "Your character is moving forward";
                    System.out.println(CharMoving.str);
                    break;
                case "s":
                    CharMoving.str = "You character is moving backward";
                    System.out.println(CharMoving.str);
                    break;
                case "d":
                    CharMoving.str = "You character is moving to the right";
                    System.out.println(CharMoving.str);
                    break;
                case "a":
                    CharMoving.str = "You character is moving to the left";
                    System.out.println(CharMoving.str);
                    break;
                case "S":
                    break;
                default:
                    System.out.println("Wrong Button, nothing happend");
            }
            if (move.equals("S")) {
                CharMoving.str = "You character moving is stoped";
                System.out.println(CharMoving.str);
                break;
            }
            move = scanner.nextLine();
        }
    }
}
