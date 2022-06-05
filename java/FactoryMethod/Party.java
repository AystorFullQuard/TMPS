package FactoryMethod;

public class Party implements Lighting{
    private String description = "В режиме освещения «Вечеринка» работает вся уличная подсветка.";
    private String name = "Режим «Вечеринка»";
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
