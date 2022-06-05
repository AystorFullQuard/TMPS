package FactoryMethod;

public class SmallLightCreator extends LightCreator{
    @Override
    public Lighting createLight() {
        return new SmallLight();
    }
}
