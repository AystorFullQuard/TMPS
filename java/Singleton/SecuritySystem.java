package Singleton;

public class SecuritySystem {
    private static volatile SecuritySystem instance = null;
    public String message;
    public Boolean open;
    private SecuritySystem() {
        message = "Дверь закрыта.";
        open = false;
    }
    public static SecuritySystem getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new SecuritySystem();
                }
            }
        }
        return instance;
    }
}
