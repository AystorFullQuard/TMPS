package Liskovprinciple;

public class Program {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setVehicleEngineType("Petrol");
        System.out.println(c1.price);

        Bike b1 = new Bike();

        System.out.println(b1.price);
    }
}
