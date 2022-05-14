package Chain;

import java.util.Arrays;

// concrete handler
public class OneDim implements Handler {

    private Handler nextInOrder;

    @Override
    public void setNext(Handler next) {
        this.nextInOrder = next;

    }

    @Override
    public void handle(Dimension responsability) throws Exception {
        if (responsability.getCoordinate().length == 1) {
            System.out.println("One dimension coordinate: " + Arrays.toString(responsability.getCoordinate()));
        } else {
            nextInOrder.handle(responsability);
        }

    }

}
