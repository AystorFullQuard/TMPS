package FactoryMethod;

public class Decor implements Lighting{

    private String description = "При приближении человека по датчикам присутствия включается освещение" +
            " таких деталей как клумба, фонтан, беседка и т.д.";
    private String name = "Элементы декора";
    private int power = 70;
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
