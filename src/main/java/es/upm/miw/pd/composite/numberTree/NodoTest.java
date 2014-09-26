package es.upm.miw.pd.composite.numberTree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class NodoTest {
    private NumberTree root;

    private NumberTree sub1;

    private NumberTree sub11;

    private NumberTree sub12;

    private NumberTree leaf;

    @Before
    public void ini() {
        this.root = new NumberTree("raiz");

        this.leaf = new NumberTree(1);
        this.root.add(leaf);
        this.sub1 = new NumberTree("sub1");
        this.root.add(sub1);
        this.root.add(new NumberTree(7));

        this.sub11 = new NumberTree("sub11");
        this.sub1.add(sub11);
        this.sub1.add(new NumberTree(4));
        this.sub12 = new NumberTree("sub12");
        this.sub1.add(sub12);

        this.sub11.add(new NumberTree(2));
        this.sub11.add(new NumberTree(3));

        this.sub12.add(new NumberTree(5));
        this.sub12.add(new NumberTree(6));
    }

    @Test
    public void testNumberOfNodesLeaf() {
        assertEquals(1, this.leaf.numberOfNodes());
    }

    @Test
    public void testNumberOfNodesComposite() {
        assertEquals(3, this.root.numberOfNodes());
        assertEquals(2, this.sub11.numberOfNodes());
    }

    @Test
    public void testAddNull() {
        this.root.add(null);
        assertEquals(3, this.root.numberOfNodes());
    }

    @Test
    public void testRemoveNull() {
        this.root.remove(null);
    }

    @Test
    public void testSumLeaf() {
        assertEquals(1, this.leaf.sum());
    }

    @Test
    public void testSumComposite() {
        assertEquals(28, this.root.sum());
    }

    @Test
    public void testHigherLeaf() {
        assertEquals(1, this.leaf.higher());
    }
    
    @Test
    public void testHigherComposite() {
        assertEquals(7, this.root.higher());
    }

    @Test
    public void testAddLeaf() {
         try {
            this.leaf.add(new NumberTree(2));
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

}
