package Bridge.second;

public abstract class Weapon {
    Model model;

    public Weapon(Model model) {
        this.model = model;
    }

    abstract void shoot();
}
