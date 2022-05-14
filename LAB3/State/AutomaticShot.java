package State;

public class AutomaticShot implements State {

    @Override
    public void shoot(Weapon weapon) {
        System.out.println("Automatic shooting");
        weapon.setState(new AutomaticShot());
        System.out.println(weapon.ammoAmount);
        weapon.ammoAmount -= 10;
        if (weapon.ammoAmount <= 0) {
            System.out.println("Reloading....");
            weapon.reload();
        }
    }

}
