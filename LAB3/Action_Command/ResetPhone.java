package Action_Command;

//Concrete Command
public class ResetPhone implements Command {
    Phone phone;

    public ResetPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void executeCommand() {
        phone.resetPhone();
    }

}
