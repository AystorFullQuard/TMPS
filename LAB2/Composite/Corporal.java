package Composite;

public class Corporal implements Soldier {

    @Override
    public void Order() {
        System.out.println("Corporal takes an order from Sergeant");
    }

}
