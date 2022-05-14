package SingleResponsibility;

public class EmailManager implements Employee {
    void ProcessMail() {
        System.out.println("Email Manager Works this email");
    }

    @Override
    public int getSalary() {
        return 5;
    }
}
