package es.upm.miw.pd.doo.polymorphims.inheritance;

public class Quadrilateral extends Figure {

    public Quadrilateral(String description, int lado) {
        super(description);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double numberOfSides() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
