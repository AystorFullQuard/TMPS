package FactoryMethod;

public class BaseHome implements Lighting{
    private String description = "При открывании входной двери начинает" +
            " работать система внутреннего освещения.";
    private String name = "Открытие входной двери";
    private int power = 100;

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
