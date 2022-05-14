package DependencyInversion;

public class VKmessenger implements Messenger {

    @Override
    public void UseMessenger() {
        System.out.println("You are using VKmessenger");

    }
}
