package Chain;

public class Program {
    public static void main(String[] args) throws Exception {
        Handler h1 = new OneDim();
        Handler h2 = new TwoDim();
        Handler h3 = new ThreeDim();
        h1.setNext(h2);
        h2.setNext(h3);
        int[] a = { 2, 5, 7 };
        h1.handle(new Dimension(5));
        h1.handle(new Dimension(5, 6));
        h1.handle(new Dimension(8, 4, 4));
        // h1.handle(new Dimension(a));
    }
}
