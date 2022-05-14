package Bridge.second;

public class Mosin implements Model {

    @Override
    public void shoot(String str) {
        System.out.println(str + " from Mosin");
    }
}
