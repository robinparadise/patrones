package es.upm.miw.pd.composite.treeNumbers;

import java.util.ArrayList;
import java.util.List;

public class TreeNumbers {
    private Integer number;

    private String name;

    private List<TreeNumbers> tree;

    public TreeNumbers(String name) {
        this.name = name;
        this.tree = new ArrayList<>();
    }

    public TreeNumbers(Integer number) {
        this.number = number;
        this.tree = null;
    }

    // Esta clase es parte de una librería pública para su distribución por
    // Internet
    public void add(TreeNumbers node) {
        if (node != null) {
            if (this.tree == null) {
                throw new UnsupportedOperationException("Operación no soportada");
            } else {
                this.tree.add(node);
            }
        }
    }

    public void remove(TreeNumbers node) {
        if (node != null && this.tree != null) {
            this.tree.remove(node);
        }
    }

    public int numberOfNodes() {
        if (this.tree == null) {
            return 1;
        } else {
            return this.tree.size();
        }

    }

    public int sum() {
        if (this.tree == null) {
            return this.number;
        } else {
            int result = 0;
            for (TreeNumbers node : this.tree) {
                result += node.sum();
            }
            return result;
        }
    }

    public int higher() {
        if (this.tree == null) {
            return this.number;
        } else {
            int result = Integer.MIN_VALUE;
            for (TreeNumbers node : this.tree) {
                int higher = node.higher();
                if (higher > result) {
                    result = higher;
                }
            }
            return result;
        }
    }

    @Override
    public String toString() {
        return "NumberTree[" + name + "]";
    }

}
