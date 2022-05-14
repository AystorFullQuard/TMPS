package Action_Command;

//Concrete Command
public class StopPhone implements Command {
    Phone phone;

    public StopPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void executeCommand() {
        phone.stopPhone();
    }

}
