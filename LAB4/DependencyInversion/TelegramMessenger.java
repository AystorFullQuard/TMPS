package DependencyInversion;

public class TelegramMessenger implements Messenger {

    @Override
    public void UseMessenger() {
        System.out.println("You are using TelegramMessenger");

    }

}
