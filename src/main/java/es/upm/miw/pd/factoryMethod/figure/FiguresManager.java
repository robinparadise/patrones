package es.upm.miw.pd.factoryMethod.figure;

import es.upm.miw.pd.doo.polymorphism.inheritance.Circle;
import es.upm.miw.pd.doo.polymorphism.inheritance.Figure;
import es.upm.miw.pd.doo.polymorphism.inheritance.Square;
import es.upm.miw.pd.doo.polymorphism.inheritance.Triangle;

public class FiguresManager {
    private Figure figure;
    private FigureType type;

    public void setType(FigureType type) {
        this.type = type;
    }

    public void createFigure() {
        if (this.type == FigureType.CIRCLE) {
            this.figure = new Circle("Circle", 1);
        } else if (this.type == FigureType.SQUARE) {
            this.figure = new Square("Square", 1);
        } else if (this.type == FigureType.TRIANGLE) {
            this.figure = new Triangle("Triangle", 1, 1);
        } else {
            assert false : "tipo figura inesperado";
        }
    }

    public Figure getFigure() {
        return figure;
    }

}
