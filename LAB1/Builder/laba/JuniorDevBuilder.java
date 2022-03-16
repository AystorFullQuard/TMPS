package laba;

public class JuniorDevBuilder extends DevBuilder {

    @Override
    void buildDevType() {
        dev.setDevType("Junior Developer");
    }

    @Override
    void buildDevWork() {
        dev.setDevwork(DevWork.Junior);
    }

    @Override
    void buildSalary() {
        dev.setSalary(800);
    }
}
