package es.upm.miw.pd.factoryMethod.figure.solution;

import es.upm.miw.pd.doo.polymorphism.inheritance.Circle;
import es.upm.miw.pd.doo.polymorphism.inheritance.Figure;

public class CircleCreator extends FigureCreator {

    @Override
    public Figure createFigure() {
        return new Circle("Círculo", 1);
    }

}
