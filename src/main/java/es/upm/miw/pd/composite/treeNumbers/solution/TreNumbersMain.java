package es.upm.miw.pd.composite.treeNumbers.solution;

import java.util.ArrayList;
import java.util.List;

import upm.jbb.IO;

public class TreNumbersMain {

    private List<TreeNumbers> compuestos = new ArrayList<TreeNumbers>();

    private TreeNumbers raiz;

    public TreNumbersMain() {
        this.raiz = new CompositeNode("Raiz");
        this.compuestos.add(raiz);
    }

    public void addCompuesto() {
        TreeNumbers com = (TreeNumbers) IO.in.select(compuestos.toArray());
        if (com == null) {
            return;
        }
        TreeNumbers nuevo = new CompositeNode(IO.in.readString("Nombre"));
        com.add(nuevo);
        this.compuestos.add(nuevo);
    }

    public void addHoja() {
        TreeNumbers com = (TreeNumbers) IO.in.select(compuestos.toArray());
        if (com == null) {
            return;
        }
        com.add(new LeafNode(IO.in.readInt("Valor")));
    }

    public void suma() {
        IO.out.println("Suma: " + this.raiz.sum());
    }

    public void mayor() {
        IO.out.println("Mayor: " + this.raiz.higher());
    }

    public static void main(String[] args) {
        IO.in.addController(new TreNumbersMain());
    }

}
