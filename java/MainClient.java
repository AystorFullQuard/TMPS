import Decorator.First.TEst.LeftBracketDecorator;
import Decorator.First.TEst.Printer;
import Decorator.First.TEst.PrinterInterface;
import Decorator.First.TEst.QuotesDecorator;
import Decorator.First.Work.*;
import Facade.CleaningFunctional;
import Facade.Compartment;
import Facade.RobotsLogic;
import Facade.RobotsPower;
import FactoryMethod.*;
import Singleton.SecuritySystem;
import State.NormalState;
import State.SaveSystem;
import State.SmartHouse;
import State.Test.*;
import TemplateMethod.CalcUtilities;
import TemplateMethod.ElectricityBill;
import TemplateMethod.Test.A;
import TemplateMethod.Test.B;
import TemplateMethod.Test.C;

import java.util.Scanner;

public class MainClient {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.println("Система управления умным домом.");
        System.out.println("Нужно пройти проверку безопастности.");
        System.out.println("1 - Открыть дверь.");
        System.out.println("2 - Ввести пароль и открыть дверь.");
        Security();
        System.out.println("Что вы хотите сделать?");
        System.out.println(" 1 - Управление уличным освещением.");
        System.out.println(" 2 - Управление системой защиты дома.");
        System.out.println(" 3 - Управление системой чистки дома.");
        System.out.println(" 4 - Управление системой безопастности дома.");
        System.out.println(" 5 - Посмотреть информацию о комунальных платехаж.");
        System.out.println(" 6 - Выход");
        String choice_1 = scanner.nextLine();
        while (true) {
            switch (choice_1){
                case "1":
                    Lighting();
                    break;
                case "2":
                    HouseCoverSystem();
                    break;
                case "3":
                    CleanHouse();
                    break;
                case "4":
                    Protection();
                    break;
                case "5":
                    Utilities();
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Нет такой кнопки");
                    break;
            }
            if(choice_1.equals("6")){
                System.out.println("Вы вышли из управления умным домом");
                break;
            }
            System.out.println("Что вы хотите сделать?");
            System.out.println(" 1 - Управление уличным освещением");
            System.out.println(" 2 - Управление системой защиты дома");
            System.out.println(" 3 - Управление системой чистки дома");
            System.out.println(" 4 - Управление системой безопастности дома");
            System.out.println(" 5 - Посмотреть информацию о комунальных платехаж.");
            System.out.println(" 6 - Выход");
            choice_1 = scanner.nextLine();
        }
    }
    private static void Security(){
        Scanner scanner = new Scanner(System.in, "Cp866");
        SecuritySystem security = SecuritySystem.getInstance();
        String choice_0 = scanner.nextLine();
        String pass;
        int count = 0;
        while(true) {
            switch (choice_0) {
                case "1":
                    if(!security.open){
                        security.message = "Дверь закрыта, нужно ввести пароль.";
                        System.out.println(security.message);
                        break;
                    }
                    else {
                        security.message = "Дверь открыта, добро пожаловать.";
                        System.out.println(security.message);
                    }
                case "2":
                    System.out.println("Введите пароль");
                    pass = scanner.nextLine();
                    if(pass.equals("1234")){
                        security.message = "Дверь открыта, добро пожаловать.";
                        System.out.println(security.message);
                        security.open = true;
                    }
                    else {
                        System.out.println("Пароль неверный.");
                    }
                    break;
                default:
                    System.out.println("Нет такой кнопки.");
            }
            if(security.open){
                break;
            }
            count++;
            if(count>5){
                System.err.println("Превышен лимит попытки входа. Повторите попытку позже.");
                //int i = Integer.parseInt(scanner.nextLine());
                System.exit(0);
                break;
            }
            System.out.println("1 - Открыть дверь.");
            System.out.println("2 - Ввести пароль и открыть дверь.");
            choice_0 = scanner.nextLine();
        }
    }
    private static void Lighting(){
        while (true){
            Scanner scanner = new Scanner(System.in, "Cp866");
            System.out.println("Что вы хотите проверить?");
            System.out.println("""
                    1 - Малое освещение\s
                    2 - Открытие калитки\s
                    3 - Элементы декора\s
                    4 - Режим «Вечеринка»\s
                    5 - Дом\s
                    6 - Выйти из управления уличным освещением""");
            String choice_2 = scanner.nextLine();
            switch (choice_2){
                case "1":
                    LightCreator smallLightCreator = new SmallLightCreator();
                    Lighting sm = smallLightCreator.createLight();
                    System.out.println("Наименование: \t" + sm.Name() + "\n" + "Описание: \t" + sm.Description() +
                            "\n" + "Уровень усвещенности: \t" + sm.getPower() + "%");
                    break;
                case "2":
                    LightCreator gateCreator = new GateCreator();
                    Lighting gates = gateCreator.createLight();
                    System.out.println("Наименование: \t" + gates.Name() + "\n" + "Описание: \t" + gates.Description() +
                            "\n" + "Уровень усвещенности: \t" + gates.getPower() + "%");
                    break;
                case "3":
                    LightCreator decorCreator = new DecorCreator();
                    Lighting dEl = decorCreator.createLight();
                    System.out.println("Наименование: \t" + dEl.Name() + "\n" + "Описание: \t" + dEl.Description() +
                            "\n" + "Уровень усвещенности: \t" + dEl.getPower() + "%t");
                    break;
                case "4":
                    LightCreator partyCreator = new PartyCreator();
                    Lighting party = partyCreator.createLight();
                    System.out.println("Наименование: \t" + party.Name() + "\n" + "Описание: \t" + party.Description() +
                            "\n" + "Уровень усвещенности: \t" + party.getPower() + "%");
                    break;
                case "5":
                    LightCreator baseHomeCreator = new BaseHomeCreator();
                    Lighting home = baseHomeCreator.createLight();
                    System.out.println("Наименование: \t" + home.Name() + "\n" + "Описание: \t" + home.Description() +
                            "\n" + "Уровень усвещенности: \t" + home.getPower() + "%");
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Нет такой кнопки.");
            }
            if(choice_2.equals("6")) {
                System.out.println("Вы вышли из управления уличным освещением");
                break;
            }
        }
    }
    private static void HouseCoverSystem(){
        Scanner scanner = new Scanner(System.in, "Cp866");
        String house = """
                 *\s
                / \\\s
               /   \\\s\040
              /-----\\\s
              |  0  |\s
              |  _  |\s
              | | | |\s
              |.|_|.|\s""";
        while (true){
            System.out.println("Что вы хотите проверить?");
            System.out.println("""
                    1 - Обычное состояние дома\s\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040\040
                    2 - Сильные осадки ( Iмитация погодных условий)\s
                    3 - Экстренная температура( Iмитация погодных условий)\s
                    4 - Экстренняя защита ( Ручной способ защиты )\s
                    5 - Полная защита\s
                    6 - Выйти из управления управление системой защиты дома""");
            String choice_3 = scanner.nextLine();
            switch (choice_3){
                case "1":
                    HouseShell normalState = new Wrap(house);
                    normalState.wrapHouse();
                    break;
                case "2":
                    HouseShell heavyRainfall = new Rainfall(new Wrap(house));
                    heavyRainfall.wrapHouse();
                    break;
                case "3":
                    HouseShell tempProtection = new TemperatureProtection(new Wrap(house));
                    tempProtection.wrapHouse();
                    break;
                case "4":
                    HouseShell emrgProtection = new EmergencyProtection(new Wrap(house));
                    emrgProtection.wrapHouse();
                    break;
                case "5":
                    HouseShell fullProtection = new Rainfall(new TemperatureProtection(new EmergencyProtection(new Wrap(house))));
                    fullProtection.wrapHouse();
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Нет такой кнопки");
            }
            if(choice_3.equals("6")) {
                System.out.println("Вы вышли из управления системой защиты дома");
                break;
            }
        }
    }
    private static void CleanHouse(){
        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.println("Что вы хотите проверить?");
        System.out.println(" 1 - Бак у робота пустой");
        System.out.println(" 2 - Бак у робота заполнен");
        System.out.println(" 3 - Выйти из системы чистки дома");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1" -> {
                RobotsLogic robotsLogic1 = new RobotsLogic();
                robotsLogic1.disposeTrash();
            }
            case "2" -> {
                RobotsLogic robotsLogic2 = new RobotsLogic();
                robotsLogic2.clean();
            }
            case "3" -> System.out.println("Вы вышли из управления системой чистки дома");
            default -> System.out.println("Нет такой кнопки");
        }
    }
    private static void Protection(){
        Scanner scanner = new Scanner(System.in, "Cp866");
        SmartHouse house = new NormalState();
        SaveSystem saveSystem = new SaveSystem();
        saveSystem.setSmartHouseState(house);
        saveSystem.protect();
        while (true) {
            System.out.println("Что вы хотите проверить");
            System.out.println("""
                    1 - Проверить пожарную безопастность, изменив соответствующий параметр\s
                    2 - Проверить газовую безопасность, изменив соответствующий параметр\s
                    3 - Проверить безопастность дома от проникновений злоумышленников, изменив соответствующий параметр\s
                    4 - Вернуться в нормальное состояние\s
                    5 - Выйти из управления безопастности дома""");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    System.out.println("Введите уровень тепла в доме (от 0% до 100%): ");
                    int val_1 = 0;
                    try {
                        val_1 = scanner.nextInt();
                    }catch(Exception e) {
                        System.out.println("Ошибка, введите верно число (от 0% до 100%)");
                    }
                    if(val_1 <0 || val_1 >100){
                        System.out.println("Ошибка, введите верно число (от 0% до 100%)");
                    }
                    saveSystem.setFireSensor(val_1);
                    saveSystem.nextState();
                    saveSystem.protect();
                    break;
                case "2":
                    System.out.println("Введите показатель газа в доме в данный момент");
                    int val_2 = 0;
                    try {
                        val_2 = scanner.nextInt();
                    }catch(Exception e) {
                        System.out.println("Ошибка, введите верно число (от 0% до 100%)");
                    }
                    if(val_2 <0 || val_2 >100){
                        System.out.println("Ошибка, введите верно число (от 0% до 100%)");
                    }
                    saveSystem.setGasSensor(val_2);
                    saveSystem.nextState();
                    saveSystem.protect();
                    break;
                case "3":
                    System.out.println("Пытается ли кто-то войти в дом (true или false)");
                    boolean val_3 = false;
                    try {
                        val_3 = scanner.nextBoolean();
                    }catch(Exception e) {
                        System.out.println("Ошибка, введите Boolean Значение (true или false)");
                    }
                    saveSystem.setThief(val_3);
                    saveSystem.nextState();
                    saveSystem.protect();
                    break;
                case "4":
                    saveSystem.setSmartHouseState(house);
                    break;
                case "5":
                    break;
                default:
                    System.out.println("Нет такой кнопки.");
            }
            if(choice.equals("5")){
                System.out.println("Вы вышли из управления безопастности");
                break;
            }
            choice = scanner.nextLine();
        }
    }

    private static void Utilities(){
        Scanner scanner = new Scanner(System.in, "Cp866");
        while (true) {
            System.out.println("Что вы хотите проверить?");
            System.out.println("""
                    1 - Проверить счет за электричесво\s
                    2 - Проверить счет за газ\s
                    3 - Проверить счет за воду\s
                    4 - Выход""");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    CalcUtilities electrycity = new ElectricityBill();
                    System.out.println("Введите сколько вы потратили электроэнергии (кВт)");
                    electrycity.showInfo();
                    break;
                case "2":
                    CalcUtilities gas = new ElectricityBill();
                    System.out.println("Введите сколько вы потратили кубометров газа");
                    gas.showInfo();
                    break;
                case "3":
                    CalcUtilities water = new ElectricityBill();
                    System.out.println("Введите сколько вы потратили кубометров воды");
                    water.showInfo();
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Нет такой кнопки.");
            }
            if (choice.equals("4")){
                System.out.println("Вы вышли из просмотра комунальных платежей");
                break;
            }
        }
    }
}
