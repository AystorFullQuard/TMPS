package second;

public class SingTon {
    private static volatile SingTon singInstance = null; /*
                                                          * Использование volatile
                                                          * это один из способов обеспечения
                                                          * согласованного доступа к
                                                          * переменной разными потоками.
                                                          */
    /*
     * Этот модификатор делает так, что каждый поток не создает свою копию
     * переменной, а все потоки работают с одной и той же.
     */

    public int counter = 0;

    public String str;

    private SingTon() {
        str = "This is a singleton class pattern.";
    }

    // Double-Checked Locking
    public static SingTon getInstance() {
        if (singInstance == null) {
            synchronized (SingTon.class) {
                if (singInstance == null)
                    singInstance = new SingTon();
            }
        }
        return singInstance;
    }
}
