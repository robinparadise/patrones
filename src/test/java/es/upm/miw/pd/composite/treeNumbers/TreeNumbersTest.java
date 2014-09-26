package es.upm.miw.pd.composite.treeNumbers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.pd.composite.treeNumbers.TreeNumbers;

public class TreeNumbersTest {
    private TreeNumbers root;

    private TreeNumbers sub1;

    private TreeNumbers sub11;

    private TreeNumbers sub12;

    private TreeNumbers leaf;

    @Before
    public void ini() {
        this.root = new TreeNumbers("raiz");

        this.leaf = new TreeNumbers(1);
        this.root.add(leaf);
        this.sub1 = new TreeNumbers("sub1");
        this.root.add(sub1);
        this.root.add(new TreeNumbers(7));

        this.sub11 = new TreeNumbers("sub11");
        this.sub1.add(sub11);
        this.sub1.add(new TreeNumbers(4));
        this.sub12 = new TreeNumbers("sub12");
        this.sub1.add(sub12);

        this.sub11.add(new TreeNumbers(2));
        this.sub11.add(new TreeNumbers(3));

        this.sub12.add(new TreeNumbers(5));
        this.sub12.add(new TreeNumbers(6));
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
            this.leaf.add(new TreeNumbers(2));
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

}
