package es.upm.miw.pd.composite.treeNumbers.solution;

import java.util.ArrayList;
import java.util.List;

public class CompositeNode extends TreeNumbers {
    private String nombre;

    private List<TreeNumbers> lista;

    public CompositeNode(String nombre) {
        this.nombre = nombre;
        this.lista = new ArrayList<TreeNumbers>();
    }

    @Override
    public void add(TreeNumbers subNodo) {
        if (subNodo != null) {
            this.lista.add(subNodo);
        }
    }

    @Override
    public void remove(TreeNumbers subNodo) {
        if (subNodo != null) {
            this.lista.remove(subNodo);
        }
    }

    @Override
    public int sum() {
        int res = 0;
        for (TreeNumbers subNodo : this.lista) {
            res += subNodo.sum();
        }
        return res;
    }

    @Override
    public int higher() {
        int max = Integer.MIN_VALUE;
        for (TreeNumbers subNodo : this.lista) {
            if (subNodo.higher() > max) {
                max = subNodo.higher();
            }
        }
        return max;
    }

    @Override
    public int numberOfNodes() {
        return this.lista.size();
    }

    @Override
    public String toString() {
        return "[" + this.nombre + "]";
    }

}
