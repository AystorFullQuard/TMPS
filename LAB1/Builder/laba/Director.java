package laba;

//реализация директора
//Директор управляет нашими строителями.
public class Director {
    DevBuilder builder; // сылка на класс строителя
    // передовать метод, в зависимоти от желаемого строителя

    void setBuilder(DevBuilder a) {
        builder = a;
    }

    // по шагам создается наш Developer
    Developer BuildDeveloper() {
        builder.createDev();
        builder.buildDevType();
        builder.buildDevWork();
        builder.buildSalary();

        Developer dev = builder.getDev();
        return dev;
    }
}
