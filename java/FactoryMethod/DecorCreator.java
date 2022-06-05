package FactoryMethod;

public class DecorCreator extends LightCreator{
    @Override
    public Lighting createLight() {
        return new Decor();
    }
}
