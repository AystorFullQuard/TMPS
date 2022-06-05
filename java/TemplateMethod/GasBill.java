package TemplateMethod;

public class GasBill extends CalcUtilities{


    @Override
    void calcValue() {
        moneyAmount = (600*valueAmount)/1000;
    }
}
