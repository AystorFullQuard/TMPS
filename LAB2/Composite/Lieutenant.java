package Composite;

public class Lieutenant implements Soldier {

    @Override
    public void Order() {
        System.out.println("Lieutenant gives an order to Sergeant");
    }

}
