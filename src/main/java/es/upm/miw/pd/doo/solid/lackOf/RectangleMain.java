package es.upm.miw.pd.doo.solid.lackOf;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(), r2 = new Square();
        r1.setWidth(2);
        r2.setWidth(2);
        r1.setHeight(3);
        r2.setHeight(3);

        System.out.println("r1.area(): " + r1.area());
        System.out.println("r2.area(): " + r2.area());
    }
}
