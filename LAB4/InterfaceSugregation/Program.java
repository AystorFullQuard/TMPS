package InterfaceSugregation;

public class Program {
    public static void main(String[] args) {
        SuperEmployee superEmployee = new SuperEmployee();
        superEmployee.TakeCall();
        superEmployee.TakeEmail();

        EmailManager emailManager = new EmailManager();
        emailManager.TakeEmail();
    }
}
