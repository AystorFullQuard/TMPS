package Singleton;

public class Singleton {
    private static volatile Singleton instance = null;
    public String str;
    public Boolean open;
    private Singleton() {
        str = "Дверь закрыта.";
        open = false;
    }
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
