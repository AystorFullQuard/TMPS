package State;

public class SingleShot implements State {

    @Override
    public void shoot(Weapon weapon) {
        System.out.println("Single shooting");
        weapon.setState(new SingleShot());
        System.out.println(weapon.ammoAmount);
        weapon.ammoAmount -= 1;
        if (weapon.ammoAmount <= 0) {
            System.out.println("Reloading....");
            weapon.reload();
        }
    }

}
