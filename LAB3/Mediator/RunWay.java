package Mediator;

public class RunWay implements Command {
    private IAirTrack actMediator;

    RunWay(IAirTrack actMediator) {
        this.actMediator = actMediator;
    }

    @Override
    public void land() {
        System.out.println("Runway is available for landing");
        actMediator.setAvailabilityState(true);
    }

}
