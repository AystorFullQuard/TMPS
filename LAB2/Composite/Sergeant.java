package Composite;

public class Sergeant implements Soldier {

    @Override
    public void Order() {
        System.out.println("Sergeant gives an order to Corporal");
    }

}
