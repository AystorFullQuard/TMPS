package Proxy;

import java.util.Scanner;

/*
Заместитель
Цель:
для замещения другого объекта и контроля доступа к нему.

Использование:
Для обеспечение контроля доступа к определенному объекту

Пример:
-Ленивая инициализация (виртуальный прокси). Когда у вас
 есть тяжёлый объект, грузящий данные из файловой
 системы или базы данных. 
-Защита доступа (защищающий прокси). Когда в программе
 есть разные типы пользователей и вам хочется защищать
 объект от неавторизованного доступа. Например, если
 ваши объекты — это важная часть операционной системы,
 а пользователи — сторонние программы (хорошие или
 вредоносные).
*/
public class ProxyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.println(">>> Playstation <<<\n");
        System.out.println("> Enter the game you would like to play: ");
        System.out.println("> p - PacMan");
        System.out.println("> t - Tic-Tac-Toe");
        System.out.println("> s - Sea Battle");
        String gametype = scanner.nextLine();
        while (!gametype.equals("p") || !gametype.equals("t") ||
                gametype.equals("s")) {
            if (gametype.equals("p") || gametype.equals("t") || gametype.equals("s")) {
                break;
            }
            System.out.println("ERROR! There is no such button \ninput again");
            System.out.println("> p - PacMan");
            System.out.println("> t - Tic-Tac-Toe");
            System.out.println("> m - Sea Battle");
            gametype = scanner.nextLine();
        }
        System.out.println("\n> The game you've chosen: \n");
        switch (gametype) {
            case "p":
                Game pacman = new ProxyGame("D:/games/pacman.exe");
                pacman.playGame();
                break;
            case "t":
                Game TicTacToe = new ProxyGame("D:/games/tic-tac-toe.exe");
                TicTacToe.playGame();
                break;
            case "s":
                Game SeaBattle = new ProxyGame("D:/games/SeaBattle.exe");
                SeaBattle.playGame();
                break;
        }
        // Game game1 = new RealGame("D:/games/pacman.exe");
        // game1.playGame();
        // Game game2 = new ProxyGame("D:/games/tic-tac-toe.exe");
        // game2.playGame();

    }
}
