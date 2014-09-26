package es.upm.miw.pd.composite;

import java.util.ArrayList;
import java.util.List;

import upm.jbb.IO;

public class CompositeMain {

    private List<Component> compuestos = new ArrayList<Component>();

    private Component raiz;

    public CompositeMain() {
        this.raiz = new Composite("raiz");
        this.compuestos.add(raiz);
    }

    public void addCompuesto() {
        Component com = (Component) IO.in.select(compuestos.toArray());
        Component nuevo = new Composite(IO.in.readString("Nombre"));
        com.add(nuevo);
        this.compuestos.add(nuevo);
    }

    public void addHoja1() {
        Component com = (Component) IO.in.select(compuestos.toArray());
        com.add(new Leaf1(IO.in.readString("Nombre")));
    }

    public void addHoja2() {
        Component com = (Component) IO.in.select(compuestos.toArray());
        com.add(new Leaf2(IO.in.readString("Nombre")));
    }

    public void view() {
        IO.out.clear();
        IO.out.println(this.raiz.view(""));
    }

    public static void main(String[] args) {
        IO.in.addController(new CompositeMain());
    }

}
