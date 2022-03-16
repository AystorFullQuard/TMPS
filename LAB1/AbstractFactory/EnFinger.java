public class EnFinger implements Finger {

    @Override
    public void tap() {
        System.out.println("Single tap");

    }

    @Override
    public void dbltap() {
        System.out.println("Double tap");

    }

    @Override
    public void slide() {
        String[] direction = new String[5];

        direction[0] = "You made slide up";
        direction[1] = "You made slide down";
        direction[2] = "You made slide to the left";
        direction[3] = "You made slide to the right";
        direction[4] = "Staying in the same position";

        int n = (int) Math.floor(Math.random() * direction.length);

        System.out.println(direction[n]);
    }

}
