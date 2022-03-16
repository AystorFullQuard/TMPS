
/*
Шаблон Factory Method

Создание интрефейса, к-ый создаёт объект. При этом, выбор того, 
экземпляр какого класса создавать остается за
классами, которые имплементируют данный интерфейс.

Используется для делигирования создания экземпляров, другому классу.

Пример использования:
- класс спроектирован таким образом, что
 создаваемые им объекты имеют свойства определенного класса
*/
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.println(">>> Welcome to FitnessClub <<<\n");
        System.out.println("> Enter the membership type you would like to create: ");
        System.out.println("> g - Gym");
        System.out.println("> gp - Gym plus Pool");
        System.out.println("> pt - Personal Training");
        // System.out.println("> GP - Gym + Pool");
        // System.out.println("> PT - Personal Training");

        String memberType = scanner.nextLine();
        while (!memberType.equals("g") || !memberType.equals("gp") || memberType.equals("pt")) {
            if (memberType.equals("g") || memberType.equals("gp") || memberType.equals("pt")) {
                break;
            }
            System.out.println("ERROR! There is no such button \ninput again");
            System.out.println("> g - Gym");
            System.out.println("> gp - Gym plus Pool");
            System.out.println("> pt - Personal Training");
            memberType = scanner.nextLine();
        }
        System.out.println("\n> Membership you've just created: \n");
        switch (memberType) {
            case "g":
                GymMembership GMember = new GymMembership(100, "Gym Membership", "Basic Membership");
                System.out.println("Name:\t" + GMember.Name());
                System.out.println("Description:\t" + GMember.Description());
                System.out.println("Price:\t" + GMember.GetPrice() + "$");
                break;
            case "gp":
                GymPlusPoolMembership GPMember = new GymPlusPoolMembership(250, "Gym plus Pool Membership",
                        "Good price membership");
                System.out.println("Name:\t" + GPMember.Name());
                System.out.println("Description:\t" + GPMember.Description());
                System.out.println("Price:\t" + GPMember.GetPrice() + "$");
                break;
            case "pt":
                PersonalTrainingMembership PTMember = new PersonalTrainingMembership(400,
                        "Personal training membership", "Best for professionals");
                System.out.println("Name:\t" + PTMember.Name());
                System.out.println("Description:\t" + PTMember.Description());
                System.out.println("Price:\t" + PTMember.GetPrice() + "$");
        }
    }
}
