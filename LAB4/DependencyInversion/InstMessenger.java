package DependencyInversion;

public class InstMessenger implements Messenger {

    @Override
    public void UseMessenger() {
        System.out.println("You are using InstMessenger");

    }

}
