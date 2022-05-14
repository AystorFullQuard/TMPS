package Chain;

import java.util.Arrays;

public class ThreeDim implements Handler {
    private Handler nextInOrder;

    @Override
    public void setNext(Handler next) {
        this.nextInOrder = next;

    }

    @Override
    public void handle(Dimension responsability) throws Exception {
        if (responsability.getCoordinate().length == 3) {
            System.out.println("Three dimension coordinate: " + Arrays.toString(responsability.getCoordinate()));
            ///
        } else {
            // nextInOrder.handle(responsability);
            throw new Exception("Dimension over is not supported");
        }

    }
}
