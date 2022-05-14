package Mediator;

public class AirTrack implements IAirTrack {

    private RunWay runway;
    private Flight flight;
    public Boolean avaliable;

    // задаем наш точный полёт
    @Override
    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    // Назначаем конкретную взлетную полосу
    @Override
    public void registerRunWay(RunWay runway) {
        this.runway = runway;

    }

    // Доступно или нет, в зависимости от состояния
    @Override
    public void setAvailabilityState(boolean state) {
        this.avaliable = state;
    }

    @Override
    public Boolean isAvailable() {
        return avaliable;
    }
}
