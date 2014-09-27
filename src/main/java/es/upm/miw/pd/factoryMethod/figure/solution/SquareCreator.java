package es.upm.miw.pd.factoryMethod.figure.solution;

import es.upm.miw.pd.doo.polymorphism.inheritance.Figure;
import es.upm.miw.pd.doo.polymorphism.inheritance.Square;

public class SquareCreator extends FigureCreator {

    @Override
    public Figure createFigure() {
        return new Square("Cuadrado", 1);
    }

}
