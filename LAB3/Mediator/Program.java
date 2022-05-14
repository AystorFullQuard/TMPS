package Mediator;

/**
 * Посредник
 * Цель
 * Позволяет уменьшить связанность множества
 * классов между собой, благодаря перемещению этих связей
 * в один класс-посредник.
 */
public class Program {
    public static void main(String[] args) {
        // создаем объект
        IAirTrack actMediator = new AirTrack();
        RunWay runway = new RunWay(actMediator);

        Flight flight1 = new Flight(actMediator);
        Flight flight2 = new Flight(actMediator);
        actMediator.registerFlight(flight1);
        actMediator.registerRunWay(runway);

        flight1.readyToLand();
        runway.land();
        flight1.land();

        flight2.land();

        flight1.parcked();

        flight2.land();

    }
}
