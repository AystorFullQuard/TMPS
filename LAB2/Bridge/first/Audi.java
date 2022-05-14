package Bridge.first;

public class Audi implements Model {

    @Override
    public void drive(String str) {
        System.out.println(str + "Audi");
    }

}
