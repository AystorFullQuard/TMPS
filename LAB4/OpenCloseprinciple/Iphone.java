package OpenCloseprinciple;

public class Iphone implements Phone {

    void UseCamera() {
        System.out.println("take a photo with iPhone");
    }

    @Override
    public void takePhoto() {
        UseCamera();
    }

}
