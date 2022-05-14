package InterfaceSugregation.dontwork;

public class EmailManager implements IEmployee {

    @Override
    public void TakeCall() {
        // не используется

    }

    @Override
    public void TakeEmail() {
        System.out.println("EmailManager works with email.");

    }

}
