package State;

public class NormalState implements SmartHouse{
    @Override
    public void protect() {
        System.out.println("Наш дом находится в нормальном состоянии");
    }
}
