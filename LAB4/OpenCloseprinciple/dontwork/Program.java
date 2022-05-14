package OpenCloseprinciple.dontwork;

public class Program {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Samsung samsung = new Samsung();
        UseCamera(samsung);

    }

    static void UseCamera(Iphone iphone) {
        if (iphone instanceof Samsung) {
            iphone.takeSamsungPhoto();
        } else {
            iphone.takeIphonePhoto();
        }

    }
}
