package laba;

public class SeniorDevBuilder extends DevBuilder {
    @Override
    void buildDevType() {
        dev.setDevType("Senior Developer");
    }

    @Override
    void buildDevWork() {
        dev.setDevwork(DevWork.Senior);
    }

    @Override
    void buildSalary() {
        dev.setSalary(3000);
    }

}
