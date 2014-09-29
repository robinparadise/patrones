package es.upm.miw.pd.visitor.solution;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.pd.visitor.ElementA;
import es.upm.miw.pd.visitor.ElementB;
import es.upm.miw.pd.visitor.element;

public class Visitor2Test {
    private Collection<element> coleccion = new ArrayList<element>();

    @Before
    public void ini() {
        coleccion.add(new ElementA());
        coleccion.add(new ElementA());
        coleccion.add(new ElementB());
        coleccion.add(new ElementA());
        coleccion.add(new ElementB());
    }

    @Test
    public void testVisitorAs() {
        Visitor2 v2 = new Visitor2();
        for (element elemento : coleccion) {
            elemento.accept(v2);
        }
        assertEquals(3, v2.getAs());
    }

    @Test
    public void testVisitorBs() {
        Visitor2 v2 = new Visitor2();
        for (element elemento : coleccion) {
            elemento.accept(v2);
        }
        assertEquals(2, v2.getBs());
    }

}
