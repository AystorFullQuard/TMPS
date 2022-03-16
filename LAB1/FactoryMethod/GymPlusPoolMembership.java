public class GymPlusPoolMembership implements IMembership {
    private int _price;
    private String _Name;
    private String _Description;

    public GymPlusPoolMembership(int price, String Name, String Description) {
        _price = price;
        _Name = Name;
        _Description = Description;
    }

    @Override
    public int GetPrice() {
        return _price;
    }

    @Override
    public String Description() {
        return _Description;
    }

    @Override
    public String Name() {
        return _Name;
    }

}
