package Action_Command;

/*
Action, Команда.

превращает запросы в объекты, позволяя
передавать их как аргументы при вызове методов, ставить
запросы в очередь, логировать их, а также поддерживать
отмену операций. */
public class Program {
    public static void main(String[] args) {
        Phone p = new Phone();
        User u = new User(new StartPhone(p), new StopPhone(p), new ResetPhone(p));

        u.startPhone();
        u.resetPhone();
        u.stopPhone();
    }
}
