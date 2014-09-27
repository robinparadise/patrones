package es.upm.miw.pd.composite.treeNumbers.solution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;


public class TreeNumbersTest {
    private TreeNumbers root;

    private TreeNumbers sub1;

    private TreeNumbers sub11;

    private TreeNumbers sub12;

    private TreeNumbers leaf;

    //Se prueban otros valores
    @Before
    public void ini() {
        this.root = new CompositeNode("raiz");

        this.leaf = new LeafNode(1);
        this.root.add(leaf);
        this.sub1 = new CompositeNode("sub1");
        this.root.add(sub1);
        this.root.add(new LeafNode(7));

        this.sub11 = new CompositeNode("sub11");
        this.sub1.add(sub11);
        this.sub1.add(new LeafNode(4));
        this.sub12 = new CompositeNode("sub12");
        this.sub1.add(sub12);

        this.sub11.add(new LeafNode(-999999));
        this.sub11.add(new LeafNode(-3));
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
        assertEquals(-999990, this.root.sum());
    }

    @Test
    public void testHigherLeaf() {
        assertEquals(1, this.leaf.higher());
    }
    
    @Test
    public void testHigherComposite() {
        assertEquals(7, this.root.higher());
        assertEquals(-3, this.sub11.higher());
    }

    @Test
    public void testAddLeaf() {
         try {
            this.leaf.add(new LeafNode(2));
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

}
