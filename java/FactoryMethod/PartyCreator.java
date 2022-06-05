package FactoryMethod;

public class PartyCreator extends LightCreator{
    @Override
    public Lighting createLight() {
        return new Party();
    }
}
