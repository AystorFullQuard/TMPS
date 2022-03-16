/*
Шаблон Abstract Factory
создание интерфейса, для создания множества взаимосвязанных или взаимозависимых объектов,
без жесткой привязки к конкретным классам.

Используется для создания множества взаимосвязанных объектов

пример использования:
- нам необходимо  предоставить множество объектов, раскрывая только их интерфейсы, а не реализацию
- система не должна зависить от метода создания и представления входящих в неё объектов.
*/
public class MainApp {
    public static void main(String[] args) {
        // создаем фабрику
        DeviceFactroy factroy = getFactoryByCountryCode("RU");
        // создаем устройства фабрики
        Finger f = factroy.getFinger();
        Button b = factroy.getButton();
        Photo p = factroy.getPhoto();

        b.PowerControl(true);

        f.tap();
        f.dbltap();
        f.slide();

        b.VolumeControl(0);

        p.TakePhoto();

        b.PowerControl(false);
    }

    private static DeviceFactroy getFactoryByCountryCode(String language) {
        switch (language) {
            case "RU":
                return new RuDeviceFactory();
            case "EN":
                return new EnDeviceFactory();
            default:
                throw new RuntimeException("Unsupported Contry Code: " + language);
        }
    }
}
