package Bridge.first;

public class BridgeApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(new Toyota());
        vehicle.drive();
        Vehicle vehicle2 = new Track(new Audi());
        vehicle2.drive();
    }
}
