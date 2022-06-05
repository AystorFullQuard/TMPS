package Decorator.First.Work;

public class TemperatureProtection extends CoverHouse{

    public TemperatureProtection(HouseShell component) {
        super(component);
    }

    @Override
    public void wrapHouse(){
        System.out.println("Включен режим повыщеной защиты дома от экстренных температур");
        super.wrapHouse();
        System.out.println("Включен режим повыщеной защиты дома от экстренных температур");
    }

}
