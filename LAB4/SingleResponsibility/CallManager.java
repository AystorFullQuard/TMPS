package SingleResponsibility;

public class CallManager implements Employee {
    void TakeCall() {
        System.out.println("Call Manager Handles the call");
    }

    @Override
    public int getSalary() {
        return 10;
    }
}
