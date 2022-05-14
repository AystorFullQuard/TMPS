package Composite;

public class Captain implements Soldier {

    @Override
    public void Order() {
        System.out.println("Captain gives an order to Lieutenant");
    }

}
