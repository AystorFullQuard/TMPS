package InterfaceSugregation;

public class SuperEmployee implements IEmployee {

    @Override
    public void TakeCall() {
        System.out.println("SuperManager takes a call");

    }

    @Override
    public void TakeEmail() {
        System.out.println("SuperManager works with email.");

    }
}
