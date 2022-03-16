package second;

//тестовый класс, который будет вызывать singleton в
//нескольких потоках одновременно, чтобы проверить
//работу singleton в многопоточной среде
public class Run implements Runnable {
    @Override
    public void run() {
        SingTon.getInstance();
    }
    // либо создается, либо берет существующий
}
