package laba;

enum DevWork {
    Junior, Middle, Senior
}

public class Developer {
    String DevType;
    DevWork devwork;
    int salary;

    public void setDevType(String devType) {
        DevType = devType;
    }

    public void setDevwork(DevWork devwork) {
        this.devwork = devwork;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Developer {" +
                "Developer Type = " + DevType +
                ", Developer Work = " + devwork + "'s work" +
                ", Salary = " + salary +
                '}';
    }
}
