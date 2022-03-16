public class EnButton implements Button {

    @Override
    public void PowerControl(boolean state) {
        if (state) {
            System.out.println("Device power is on");
        } else {
            System.out.println("Device power is off");
        }

    }

    @Override
    public void VolumeControl(int direction) {
        if (direction > 0) {
            System.out.println("Turn up the volume by " + direction);
        } else if (direction < 0) {
            System.out.println("Lower the volume by " + direction);
        } else {
            System.out.println("Volume is on the same position");
        }
    }

}
