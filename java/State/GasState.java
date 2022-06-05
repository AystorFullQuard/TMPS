package State;

public class GasState implements SmartHouse{
    @Override
    public void protect() {
        System.out.println("Повышенный уровень газа в доме. \s" +
                "Звоним в газовую службу 104");
    }
}
