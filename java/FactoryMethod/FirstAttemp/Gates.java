package FactoryMethod.FirstAttemp;

public class Gates implements ILighting {
    private final int _LightPower;
    private final String _Name;
    private final String _Description;

    public Gates(int LightPower, String Name, String Description){
        _LightPower = LightPower;
        _Name = Name;
        _Description = Description;
    }


    @Override
    public String Description() {
        return _Description;
    }

    @Override
    public String Name() {
        return _Name;
    }

    @Override
    public int GetLightPower() {
        return _LightPower;
    }
}
