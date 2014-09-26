package es.upm.miw.pd.composite.treeNumbers.solution;

public abstract class TreeNumbers {
    public abstract void add(TreeNumbers subNodo);

    public abstract void remove(TreeNumbers subNodo);
    
    public abstract int numberOfNodes();

    public abstract int sum();

    public abstract int higher();
}
