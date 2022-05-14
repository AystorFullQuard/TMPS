package Bridge.second;

public class Pistol extends Weapon {

    public Pistol(Model model) {
        super(model);
        // TODO Auto-generated constructor stub
    }

    @Override
    void shoot() {
        model.shoot("Pistol shoot");
    }

}
