package State;

//Context
public class Weapon {
    private State state;
    public int ammoAmount;

    public void setAmmoAmount(int ammoAmount) {
        this.ammoAmount = ammoAmount;
    }

    public void setState(State s) {
        this.state = s;
    }

    public void reload() {
        ammoAmount = 30;
    }

    public void shoot() {
        state.shoot(this);
    }
}
