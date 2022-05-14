package State;

public class QueueShot implements State {
    @Override
    public void shoot(Weapon weapon) {
        System.out.println("Queue shooting");
        weapon.setState(new QueueShot());
        System.out.println(weapon.ammoAmount);
        weapon.ammoAmount -= 3;
        if (weapon.ammoAmount <= 0) {
            System.out.println("Reloading....");
            weapon.reload();
        }
    }

}
