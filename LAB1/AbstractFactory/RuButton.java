public class RuButton implements Button {

    @Override
    public void PowerControl(boolean state) {
        if (state) {
            System.out.println("Устройство включено");
        } else {
            System.out.println("Устройство выключено");
        }

    }

    @Override
    public void VolumeControl(int direction) {
        if (direction > 0) {
            System.out.println("Повышаем громкость на " + direction);
        } else if (direction < 0) {
            System.out.println("Понижаем громкость на " + direction);
        } else {
            System.out.println("Громкость на прежнем уровне");
        }
    }

}
