package Action_Command;

//invoker
public class User {
    Command start;
    Command stop;
    Command reset;

    public User(Command start, Command stop, Command reset) {
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }

    void startPhone() {
        start.executeCommand();
    }

    void stopPhone() {
        stop.executeCommand();
    }

    void resetPhone() {
        reset.executeCommand();
    }
}
