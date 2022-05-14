package SingleResponsibility;

/*класс должен иметь одну и только одну причину для изменения */
public class Program {
    public static void main(String[] args) {
        EmployeeDatabase employeeDatabase = new EmployeeDatabase();
        employeeDatabase.TakeCall();
        employeeDatabase.ProcessMail();

    }
}
