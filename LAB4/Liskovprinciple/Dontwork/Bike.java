package Liskovprinciple.Dontwork;

public class Bike extends Vehicle {

    public int price = 500;

    // Но у велосипеда нет двигателя, и метод setVehicleEngineType нелогично
    // использовать
    // и если он переопределяет метод setEngineType, он нарушает LSP.
    @Override
    public void setVehicleEngineType(String vehicleEngineType) {

    }

}
