public class RuFinger implements Finger {

    @Override
    public void tap() {
        System.out.println("Единичный тап");

    }

    @Override
    public void dbltap() {
        System.out.println("Двойной тап");

    }

    @Override
    public void slide() {
        String[] direction = new String[5];

        direction[0] = "Вы сделали слайд вверх";
        direction[1] = "Вы сделали слайд вниз";
        direction[2] = "Вы сделали слайд влево";
        direction[3] = "Вы сделали слайд вправо";
        direction[4] = "Стоим на прежней позиции";

        int n = (int) Math.floor(Math.random() * direction.length);

        System.out.println(direction[n]);
    }

}
