
/*
Шаблон Prototype 

Определить вид сосздаваемых объектов с помощью 
экземпляра - прототипа и создать новые объекты, копируя этот прототип.

Используется для создания копий заданного объекта.

Пример использования:
- классы, экземпляры к-ых необходимо создать
    определяются во время выполнения программы;
- для избежания построения иерархии классов, 
    фабрик или параллельных иерархий классов;
*/
import java.util.Scanner;

public class ClientProject {
    public static void main(String[] args) {
        /*
         * CarShop cr = new CarShop();
         * cr.setShopName("BMW shop 1");
         * cr.LoadData();
         * // CarShop cr1 = (CarShop) cr.copy();
         * CarShop cr1 = cr.DeepCopy();
         * 
         * cr.getCars().remove(2);
         * 
         * cr1.setShopName("BMW shop 2");
         * System.out.println(cr);
         * System.out.println(cr1);
         */

        CarShop BMW_Shop1 = new CarShop();
        BMW_Shop1.setShopName("BMW Shop 1");
        BMW_Shop1.LoadData();
        CarShop BMW_Shop2 = BMW_Shop1.DeepCopy();
        BMW_Shop2.setShopName("BMW Shop 2");
        CarShop BMW_Shop3 = BMW_Shop1.DeepCopy();
        BMW_Shop3.setShopName("BMW Shop 3");
        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.println(">>> Welcome to the BMW Car Sales<<<\n");
        System.out.println("> Enter the number From what Shop you want to buy your car: ");
        System.out.println("> 1 - BMW shop 1");
        System.out.println("> 2 - BMW shop 2");
        System.out.println("> 3 - BMW shop 3");
        System.out.println("> 4 - Show list of cars from all BMW shops");
        System.out.println("> Exit - close program");
        String shopNum = scanner.nextLine();
        while (true) {
            while (!shopNum.equals("1") || !shopNum.equals("2") || !shopNum.equals("3") || !shopNum.equals("Exit")
                    || !shopNum.equals("4")) {
                if (shopNum.equals("1") || shopNum.equals("2") || shopNum.equals("3") || shopNum.equals("Exit")
                        || shopNum.equals("4")) {
                    break;
                }
                System.out.println("ERROR! There is no such button \ninput again");
                System.out.println("> 1 - BMW shop 1");
                System.out.println("> 2 - BMW shop 2");
                System.out.println("> 3 - BMW shop 3");
                System.out.println("> 4 - Show list of cars from all BMW shops");
                System.out.println("> Exit - close program");
                shopNum = scanner.nextLine();
            }
            switch (shopNum) {
                case "1":
                    while (true) {
                        System.out.println("> BMW Shop 1");
                        System.out.println("Choice what car you want to buy");
                        System.out.println(BMW_Shop1);
                        System.out.println("Enter b to turn back");
                        String ch = scanner.nextLine();
                        switch (ch) {
                            case "1":
                                BMW_Shop1.getCars().remove(0);
                                break;
                            case "2":
                                BMW_Shop1.getCars().remove(1);
                                System.out.println(BMW_Shop1);
                                break;
                            case "3":
                                BMW_Shop1.getCars().remove(2);
                                System.out.println(BMW_Shop1);
                                break;
                            case "4":
                                BMW_Shop1.getCars().remove(3);
                                System.out.println(BMW_Shop1);
                                break;
                            case "5":
                                BMW_Shop1.getCars().remove(4);
                                System.out.println(BMW_Shop1);
                                break;
                        }
                        if (ch.equals("b")) {
                            break;
                        }
                        System.out.println("Choice what car you want to buy more");
                        System.out.println(BMW_Shop1);
                        System.out.println("Enter b to turn back");
                    }
                    break;
                case "2":
                    while (true) {
                        System.out.println("> BMW Shop 2");
                        System.out.println("Choice what car you want to buy");
                        System.out.println(BMW_Shop2);
                        System.out.println("Enter b to turn back");
                        String ch1 = scanner.nextLine();
                        switch (ch1) {
                            case "1":
                                BMW_Shop2.getCars().remove(0);
                                break;
                            case "2":
                                BMW_Shop2.getCars().remove(1);
                                System.out.println(BMW_Shop2);
                                break;
                            case "3":
                                BMW_Shop2.getCars().remove(2);
                                System.out.println(BMW_Shop2);
                                break;
                            case "4":
                                BMW_Shop2.getCars().remove(3);
                                System.out.println(BMW_Shop2);
                                break;
                            case "5":
                                BMW_Shop2.getCars().remove(4);
                                System.out.println(BMW_Shop2);
                                break;
                        }
                        if (ch1.equals("b")) {
                            break;
                        }
                        System.out.println("Choice what car you want to buy more");
                        System.out.println(BMW_Shop2);
                        System.out.println("Enter b to turn back");
                    }
                    break;
                case "3":
                    while (true) {
                        System.out.println("> BMW Shop 3");
                        System.out.println("Choice what car you want to buy");
                        System.out.println(BMW_Shop3);
                        System.out.println("Enter b to turn back");
                        String ch2 = scanner.nextLine();
                        switch (ch2) {
                            case "1":
                                BMW_Shop3.getCars().remove(0);
                                break;
                            case "2":
                                BMW_Shop3.getCars().remove(1);
                                System.out.println(BMW_Shop3);
                                break;
                            case "3":
                                BMW_Shop3.getCars().remove(2);
                                System.out.println(BMW_Shop3);
                                break;
                            case "4":
                                BMW_Shop3.getCars().remove(3);
                                System.out.println(BMW_Shop3);
                                break;
                            case "5":
                                BMW_Shop1.getCars().remove(4);
                                System.out.println(BMW_Shop3);
                                break;
                        }
                        if (ch2.equals("b")) {
                            break;
                        }
                        System.out.println("Choice what car you want to buy more");
                        System.out.println(BMW_Shop3);
                        System.out.println("Enter b to turn back");
                    }
                    break;
                case "4":
                    System.out.println(BMW_Shop1 + "\n" + BMW_Shop2 + "\n" + BMW_Shop3);
                    break;
            }
            if (shopNum.equals("Exit")) {
                break;
            }
            System.out.println("> Enter the number From what Shop you want to buy your car: ");
            System.out.println("> 1 - BMW shop 1");
            System.out.println("> 2 - BMW shop 2");
            System.out.println("> 3 - BMW shop 3");
            System.out.println("> 4 - Show list of cars from all BMW shops");
            System.out.println("> Exit - close program");
            shopNum = scanner.nextLine();
        }
    }
}
