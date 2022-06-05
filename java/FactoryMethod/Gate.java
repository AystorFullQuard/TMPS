package FactoryMethod;

public class Gate implements Lighting{

    private String description = "Когда хозяин открывает ворота, " +
            "включается подсветка " +
            "дорожек от калитки и ворот до дома, " +
            "а также подсветка входных дверей и входа в гараж.";
    private String name = "Хозяин открыл калитку";
    private int power = 40;

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
