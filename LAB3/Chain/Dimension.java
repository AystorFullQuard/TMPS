package Chain;

/*
Chain - цепочка обязанностей.
 Связывание объектов - получателей в цепочку и передача запроса по ней.
 Каждый последующий обработчик решает, может ли он обработать
запрос сам и стоит ли передавать запрос дальше по цепи.
 */
//Condrete handler
public class Dimension {
    private int[] coordinate;
    private int sum = 0;

    public Dimension(int x) {
        this.coordinate = new int[] { x };
        int sum = (int) Math.pow(x, 2);
        System.out.println("Modul vecotor of OneDim " + Math.sqrt(sum));
    }

    public Dimension(int x, int y) {
        this.coordinate = new int[] { x, y };
        int sum = (int) Math.pow(x, 2) + (int) Math.pow(y, 2);
        System.out.println("Modul vecotor of TwoDim " + Math.sqrt(sum));
    }

    public Dimension(int x, int y, int z) {
        this.coordinate = new int[] { x, y, z };
        int sum = (int) Math.pow(x, 2) + (int) Math.pow(y, 2) + (int) Math.pow(z, 2);
        System.out.println("Modul vecotor of ThreeDim " + Math.sqrt(sum));
    }

    public Dimension(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            this.coordinate = new int[] { arr[i] };
            sum += Math.pow(arr[i], 2);
        }
        System.out.println("Modul vector of " + arr.length + " dimension " + Math.sqrt(sum));
        return;
    }

    public int[] getCoordinate() {
        return this.coordinate;
    }
}
