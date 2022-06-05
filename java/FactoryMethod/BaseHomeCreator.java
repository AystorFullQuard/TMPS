package FactoryMethod;

public class BaseHomeCreator extends LightCreator{
    @Override
    public Lighting createLight() {
        return new BaseHome();
    }
}
