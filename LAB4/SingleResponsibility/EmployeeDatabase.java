package SingleResponsibility;

public class EmployeeDatabase {
    CallManager callManager = new CallManager();
    EmailManager emailManager = new EmailManager();

    void TakeCall() {
        callManager.TakeCall();
    }

    void ProcessMail() {
        emailManager.ProcessMail();
    }
}
