package laba;

public class MiddleDevBuilder extends DevBuilder {
    @Override
    void buildDevType() {
        dev.setDevType("Middle Developer");
    }

    @Override
    void buildDevWork() {
        dev.setDevwork(DevWork.Middle);
    }

    @Override
    void buildSalary() {
        dev.setSalary(1500);
    }
}
