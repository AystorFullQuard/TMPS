public class RuDeviceFactory implements DeviceFactroy {

    @Override
    public Finger getFinger() {
        return new RuFinger();
    }

    @Override
    public Button getButton() {
        return new RuButton();
    }

    @Override
    public Photo getPhoto() {
        return new RuPhoto();
    }

}
