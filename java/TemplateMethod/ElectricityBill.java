package TemplateMethod;

public class ElectricityBill extends CalcUtilities{

    @Override
    void calcValue() {
        moneyAmount = valueAmount*2.17;
    }
}
