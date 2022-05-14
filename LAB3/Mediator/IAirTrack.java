package Mediator;

public interface IAirTrack {
    //
    public void registerFlight(Flight flight);

    // Для взлетно-посадочной полосы.
    public void registerRunWay(RunWay runway);

    // Метод, чтобы установить состояние нашей полосы
    public void setAvailabilityState(boolean state);

    // Доступен ли он
    public Boolean isAvailable();
}
