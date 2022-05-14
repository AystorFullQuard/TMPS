package Chain;

import java.util.Arrays;

public class TwoDim implements Handler {
    private Handler nextInOrder;

    @Override
    public void setNext(Handler next) {
        this.nextInOrder = next;

    }

    @Override
    public void handle(Dimension responsability) throws Exception {
        if (responsability.getCoordinate().length == 2) {
            System.out.println("Two dimension coordinate: " + Arrays.toString(responsability.getCoordinate()));
        } else {
            nextInOrder.handle(responsability);
        }

    }
}
