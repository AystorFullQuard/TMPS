package Action_Command;

//Concrete Command
public class StartPhone implements Command {
    Phone phone;

    public StartPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void executeCommand() {
        phone.startPhone();
    }

}
