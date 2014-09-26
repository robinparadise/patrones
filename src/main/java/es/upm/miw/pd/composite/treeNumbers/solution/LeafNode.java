package es.upm.miw.pd.composite.treeNumbers.solution;

public class LeafNode extends TreeNumbers {
    private int valor;

    public LeafNode(int valor) {
        this.valor = valor;
    }

    @Override
    public void add(TreeNumbers subNodo) {
        throw new UnsupportedOperationException("Operación no soportada");
    }

    @Override
    public void remove(TreeNumbers subNodo) {
    }

    @Override
    public int sum() {
        return this.valor;
    }

    @Override
    public int higher() {
        return this.valor;
    }

    @Override
    public String toString() {
        return "Hoja[" + valor + "]";
    }

    @Override
    public int numberOfNodes() {
        return 1;
    }

}
