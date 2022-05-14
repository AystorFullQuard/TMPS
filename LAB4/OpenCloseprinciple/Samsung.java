package OpenCloseprinciple;

public class Samsung implements Phone {

    void UseCamera() {
        System.out.println("take a photo with Samsung");
    }

    @Override
    public void takePhoto() {
        UseCamera();
    }

}
