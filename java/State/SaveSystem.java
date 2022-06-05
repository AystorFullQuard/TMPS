package State;

public class SaveSystem {
    SmartHouse smartHouse;
    private int gasSensor = 0;
    private int fireSensor = 0;
    private Boolean thief = false;
    public void setSmartHouseState(SmartHouse SH){
        smartHouse = SH;
    }
    public void nextState(){
            if (smartHouse instanceof NormalState && gasSensor>30){
                setSmartHouseState(new GasState());
            }else if(smartHouse instanceof NormalState && fireSensor>50){
                setSmartHouseState(new FireSave());
            }
            else if(smartHouse instanceof NormalState && thief){
                setSmartHouseState(new PoliceSave());
            } else if(smartHouse instanceof FireSave && thief){
                setSmartHouseState(new PoliceSave());
            }else if(smartHouse instanceof FireSave && gasSensor>30){
                setSmartHouseState(new GasState());
            }else if(smartHouse instanceof GasState && thief){
                setSmartHouseState(new PoliceSave());
            }else if(smartHouse instanceof GasState && fireSensor>50){
                setSmartHouseState(new FireSave());
            }else if(smartHouse instanceof PoliceSave && gasSensor>30){
                setSmartHouseState(new GasState());
            }else if(smartHouse instanceof PoliceSave && fireSensor>50){
                setSmartHouseState(new FireSave());
            }else {
                setSmartHouseState(new NormalState());
            }
    }
    public void protect(){
        smartHouse.protect();
    }

    public void setGasSensor(int gasSensor) {
        this.gasSensor = gasSensor;
    }
    public void setFireSensor(int fireSensor) {
        this.fireSensor = fireSensor;
    }
    public void setThief(Boolean thief) {
        this.thief = thief;
    }
}
