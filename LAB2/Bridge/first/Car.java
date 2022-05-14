package Bridge.first;

public class Car extends Vehicle {

    public Car(Model model) {
        super(model);

    }

    @Override
    void drive() {
        model.drive("Drive car");

    }

}
