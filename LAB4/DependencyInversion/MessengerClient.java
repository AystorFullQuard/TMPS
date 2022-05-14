package DependencyInversion;

public class MessengerClient implements Messenger {

    Messenger client;

    MessengerClient(Messenger messenger) {
        this.client = messenger;
    }

    @Override
    public void UseMessenger() {
        this.client.UseMessenger();
    }
}
