package OpenCloseprinciple;

public class Program {
    public static void main(String[] args) {

        Iphone i1 = new Iphone();
        Samsung s1 = new Samsung();
        UseCamera(s1);

    }

    static void UseCamera(Phone phone) {
        phone.takePhoto();
    }
}
