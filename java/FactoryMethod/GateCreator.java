package FactoryMethod;

public class GateCreator extends LightCreator{

    @Override
    public Lighting createLight() {
        return new Gate();
    }
}
