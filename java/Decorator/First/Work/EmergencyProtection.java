package Decorator.First.Work;

public class EmergencyProtection extends CoverHouse{

    public EmergencyProtection(HouseShell component) {
        super(component);
    }

    @Override
    public void wrapHouse(){
        System.out.println("Включен режим экстренной защиты дома");
        super.wrapHouse();
        System.out.println("Включен режим экстренной защиты дома");
    }

}
