package Proxy;

public class RealGame implements Game {
    String file;

    public RealGame(String file) {
        this.file = file;
        load();
    }

    void load() {
        System.out.println("Loading the game by file " + file);
    }

    @Override
    public void playGame() {
        System.out.println("The game is running by file " + file);
    }

}
