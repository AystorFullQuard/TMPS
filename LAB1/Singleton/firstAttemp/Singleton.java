package firstAttemp;

public class Singleton {
    private static final Object sync = new Object();

    public static int counter = 0;
    private static volatile Singleton instance = null;

    private Singleton() {
        counter++;
    }

    // public static Singleton getInstance() {
    // return instance;
    // }
    // public static Singleton getInstance() {
    // if (instance == null) {
    // instance = new Singleton();
    // }
    // return instance;
    // }
    // public static synchronized Singleton getInstance() {
    // if (instance == null) {
    // instance = new Singleton();
    // }
    // return instance;
    // }
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (sync) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int a) {
        counter = a;
    }
}