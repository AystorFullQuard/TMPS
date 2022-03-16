package firstAttemp;

public class RunClass implements Runnable {

    @Override
    public void run() {
        Singleton.getInstance();
    }

}
