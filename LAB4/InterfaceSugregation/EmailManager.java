package InterfaceSugregation;

public class EmailManager implements EmailReceiver {

    @Override
    public void TakeEmail() {
        System.out.println("EmailManager works with email");

    }

}
