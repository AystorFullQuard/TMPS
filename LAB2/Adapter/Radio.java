package Adapter;

public class Radio {
    // радио работает только с европейской розеткой
    public void listenMusic(EuroSocket euroSocket) {
        euroSocket.getPower();
        System.out.println("Music is playing");
    }
}
