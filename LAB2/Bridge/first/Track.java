package Bridge.first;

public class Track extends Vehicle {

    public Track(Model model) {
        super(model);
        // TODO Auto-generated constructor stub
    }

    @Override
    void drive() {
        model.drive("Drive track");

    }

}
