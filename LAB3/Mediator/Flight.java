package Mediator;

public class Flight implements Command {

    private IAirTrack actMediator;

    Flight(IAirTrack actMediator) {
        this.actMediator = actMediator;
    }

    @Override
    public void land() {
        if (actMediator.isAvailable()) {
            System.out.println("Landed successfully");
            actMediator.setAvailabilityState(false); // полоса занята
        } else {
            System.out.println("Waiting for free Runway");
        }

    }

    public void readyToLand() {
        System.out.println("Landing initiated");
    }

    public void parcked() {
        System.out.println("Flight is parcked");
        actMediator.setAvailabilityState(true); // полоса свободна
    }

}
