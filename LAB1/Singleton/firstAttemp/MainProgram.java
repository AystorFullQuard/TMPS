package firstAttemp;

public class MainProgram {
    public static void main(String[] args) throws InterruptedException {

        final int SIZE = 10;

        Thread t[] = new Thread[SIZE];

        for (int i = 0; i < SIZE; i++) {
            t[i] = new Thread(new RunClass());
            t[i].start();
        }
        for (int i = 0; i < SIZE; i++) {
            t[i].join();
        }
        Singleton f = Singleton.getInstance();
        Singleton f1 = Singleton.getInstance();

        System.out.println(f);
        System.out.println(f1);

        System.out.println("Counter is: " + Singleton.getCounter());
    }
}
