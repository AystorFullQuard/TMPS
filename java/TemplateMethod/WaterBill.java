package TemplateMethod;

public class WaterBill extends CalcUtilities{


    @Override
    void calcValue() {
        moneyAmount = 43*valueAmount;
    }
}
