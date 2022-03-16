public class EnDeviceFactory implements DeviceFactroy {
    @Override
    public Finger getFinger() {
        return new EnFinger();
    }

    @Override
    public Button getButton() {
        return new EnButton();
    }

    @Override
    public Photo getPhoto() {
        return new EnPhoto();
    }
}
