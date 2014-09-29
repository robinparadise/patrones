package es.upm.miw.pd.visitor;

import java.util.ArrayList;
import java.util.Collection;

import upm.jbb.IO;

public final class VisitorMain {
    private Collection<element> coleccion = new ArrayList<element>();

    public VisitorMain() {
        coleccion.add(new ElementA());
        coleccion.add(new ElementA());
        coleccion.add(new ElementB());
        coleccion.add(new ElementA());
    }

    public void visitador1() {
        Visitor1 v1 = new Visitor1();
        for (element elemento : coleccion) {
            elemento.accept(v1);
        }
    }

    public static void main(String[] args) {
        IO.in.addController(new VisitorMain());
    }
}
