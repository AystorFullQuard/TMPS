package FactoryMethod;

public class SmallLight implements Lighting{

    private String description = "При отсутствии хозяев дома включена только" +
            " \n слабая подсветка калитки, а также основных элементов дома.";
    private String name = "Слабое освещение";

    private int power = 5;

    @Override
    public String Description() {
        return description;
    }

    @Override
    public String Name() {
        return name;
    }

    @Override
    public int getPower() {
        return power;
    }
}
