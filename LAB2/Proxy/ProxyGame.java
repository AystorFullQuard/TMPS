package Proxy;

public class ProxyGame implements Game {

    String file;
    RealGame game;

    public ProxyGame(String file) {
        this.file = file;
    }

    @Override
    public void playGame() {
        if (game == null) {
            game = new RealGame(file);
            game.playGame();
        } else {
            game.playGame();
        }
    }

}
