package State;

public class PoliceSave implements SmartHouse{
    @Override
    public void protect() {
        System.out.println("В дом пытается ворваться вор. \s" +
                "Звоним в полицию 102");
    }
}
