package State;

public class FireSave implements SmartHouse{
    @Override
    public void protect() {
        System.out.println("В доме разгорелся пожар или повышенный уровень дыма. \s" +
                "Звоним в пожарную службу 101");
    }
}
