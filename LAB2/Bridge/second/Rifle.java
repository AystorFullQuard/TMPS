package Bridge.second;

public class Rifle extends Weapon {

    public Rifle(Model model) {
        super(model);
        // TODO Auto-generated constructor stub
    }

    @Override
    void shoot() {
        model.shoot("Rifle shoot");

    }

}
