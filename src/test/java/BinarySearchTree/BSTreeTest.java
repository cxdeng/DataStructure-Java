package BinarySearchTree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BSTreeTest {

    private BSTree bst;

    @BeforeEach
    void setUp() {
        bst = new BSTree();
    }

    @Test
    void testPutAndGet() {
        bst.put(5, "A");
        bst.put(3, "B");
        bst.put(7, "C");
        bst.put(2, "D");
        bst.put(4, "E");
        bst.put(6, "F");
        bst.put(8, "G");

        assertEquals("A", bst.getRecur(5));
        assertEquals("B", bst.getRecur(3));
        assertEquals("C", bst.getRecur(7));
        assertEquals("D", bst.getRecur(2));
        assertEquals("E", bst.getRecur(4));
        assertEquals("F", bst.getRecur(6));
        assertEquals("G", bst.getRecur(8));

        assertEquals("A", bst.getNonRecur(5));
        assertEquals("B", bst.getNonRecur(3));
        assertEquals("C", bst.getNonRecur(7));
        assertEquals("D", bst.getNonRecur(2));
        assertEquals("E", bst.getNonRecur(4));
        assertEquals("F", bst.getNonRecur(6));
        assertEquals("G", bst.getNonRecur(8));
    }

    @Test
    void testMinMax() {
        bst.put(5, "A");
        bst.put(3, "B");
        bst.put(7, "C");
        bst.put(1, "D");
        bst.put(9, "E");

        assertEquals("D", bst.minRecur());
        assertEquals("E", bst.maxRecur());

        assertEquals("D", bst.minNonRecur());
        assertEquals("E", bst.maxNonRecur());
    }

    @Test
    void testPredecessorAndSuccessor() {
        bst.put(20, "A");
        bst.put(10, "B");
        bst.put(30, "C");
        bst.put(5, "D");
        bst.put(15, "E");
        bst.put(25, "F");
        bst.put(35, "G");

        assertEquals("E", bst.predecessor(20));
        assertEquals("F", bst.successor(20));

        assertNull(bst.predecessor(5));
        assertNull(bst.successor(35));

        assertEquals("B", bst.predecessor(15));
        assertEquals("A", bst.successor(15));
    }

    @Test
    void testDeleteNonRecur() {
        bst.put(20, "A");
        bst.put(10, "B");
        bst.put(30, "C");
        bst.put(5, "D");
        bst.put(15, "E");
        bst.put(25, "F");
        bst.put(35, "G");

        assertEquals("A", bst.deleteNonRecur(20));
        assertNull(bst.getRecur(20));
        assertNull(bst.getNonRecur(20));

        assertEquals("B", bst.deleteNonRecur(10));
        assertNull(bst.getRecur(10));
        assertNull(bst.getNonRecur(10));

        assertEquals("D", bst.deleteNonRecur(5));
        assertNull(bst.getRecur(5));
        assertNull(bst.getNonRecur(5));

        assertEquals("C", bst.deleteNonRecur(30));
        assertNull(bst.getRecur(30));
        assertNull(bst.getNonRecur(30));

        assertEquals("E", bst.deleteNonRecur(15));
        assertNull(bst.getRecur(15));
        assertNull(bst.getNonRecur(15));

        assertEquals("F", bst.deleteNonRecur(25));
        assertNull(bst.getRecur(25));
        assertNull(bst.getNonRecur(25));

        assertEquals("G", bst.deleteNonRecur(35));
        assertNull(bst.getRecur(35));
        assertNull(bst.getNonRecur(35));
    }

    @Test
    void testDeleteRecur() {
        bst.put(20, "A");
        bst.put(10, "B");
        bst.put(30, "C");
        bst.put(5, "D");
        bst.put(15, "E");
        bst.put(25, "F");
        bst.put(35, "G");

        bst.deleteRecur(20);
        assertNull(bst.getRecur(20));
        assertNull(bst.getNonRecur(20));

        bst.deleteRecur(10);
        assertNull(bst.getRecur(10));
        assertNull(bst.getNonRecur(10));

        bst.deleteRecur(5);
        assertNull(bst.getRecur(5));
        assertNull(bst.getNonRecur(5));

        bst.deleteRecur(30);
        assertNull(bst.getRecur(30));
        assertNull(bst.getNonRecur(30));

        bst.deleteRecur(15);
        assertNull(bst.getRecur(15));
        assertNull(bst.getNonRecur(15));

        bst.deleteRecur(25);
        assertNull(bst.getRecur(25));
        assertNull(bst.getNonRecur(25));

        bst.deleteRecur(35);
        assertNull(bst.getRecur(35));
        assertNull(bst.getNonRecur(35));
    }

    @Test
    void testLess() {
        bst.put(20, "A");
        bst.put(10, "B");
        bst.put(30, "C");
        bst.put(5, "D");
        bst.put(15, "E");

        List<Object> lessThan20 = bst.less(20);
        assertTrue(lessThan20.contains("B"));
        assertTrue(lessThan20.contains("D"));
        assertTrue(lessThan20.contains("E"));
        assertFalse(lessThan20.contains("A"));
        assertFalse(lessThan20.contains("C"));
    }

    @Test
    void testGreater() {
        bst.put(20, "A");
        bst.put(10, "B");
        bst.put(30, "C");
        bst.put(5, "D");
        bst.put(15, "E");

        List<Object> greaterThan10 = bst.greater(10);
        assertTrue(greaterThan10.contains("A"));
        assertTrue(greaterThan10.contains("C"));
        assertTrue(greaterThan10.contains("E"));
        assertFalse(greaterThan10.contains("B"));
        assertFalse(greaterThan10.contains("D"));
    }

    @Test
    void testBetween() {
        bst.put(20, "A");
        bst.put(10, "B");
        bst.put(30, "C");
        bst.put(5, "D");
        bst.put(15, "E");
        bst.put(25, "F");

        List<Object> between10And30 = bst.between(10, 30);
        assertTrue(between10And30.contains("A"));
        assertTrue(between10And30.contains("E"));
        assertTrue(between10And30.contains("F"));
        assertFalse(between10And30.contains("B"));
        assertFalse(between10And30.contains("C"));
        assertFalse(between10And30.contains("D"));
    }

    @Test
    void testGreaterAlternative() {
        bst.put(20, "A");
        bst.put(10, "B");
        bst.put(30, "C");
        bst.put(5, "D");
        bst.put(15, "E");

        List<Object> greaterThan10Alt = bst.greaterAlternative(10);
        assertTrue(greaterThan10Alt.contains("A"));
        assertTrue(greaterThan10Alt.contains("C"));
        assertTrue(greaterThan10Alt.contains("E"));
        assertFalse(greaterThan10Alt.contains("B"));
        assertFalse(greaterThan10Alt.contains("D"));
    }

    @Test
    void testEmptyTree() {
        assertNull(bst.minRecur());
        assertNull(bst.maxRecur());
        assertNull(bst.minNonRecur());
        assertNull(bst.maxNonRecur());
        assertNull(bst.getRecur(1));
        assertNull(bst.getNonRecur(1));
        assertNull(bst.deleteNonRecur(1));
        assertNull(bst.predecessor(1));
        assertNull(bst.successor(1));
        assertTrue(bst.less(1).isEmpty());
        assertTrue(bst.greater(1).isEmpty());
        assertTrue(bst.between(1, 10).isEmpty());
    }

    @Test
    void testSingleElementTree() {
        bst.put(10, "A");

        assertEquals("A", bst.minRecur());
        assertEquals("A", bst.maxRecur());
        assertEquals("A", bst.minNonRecur());
        assertEquals("A", bst.maxNonRecur());
        assertEquals("A", bst.getRecur(10));
        assertEquals("A", bst.getNonRecur(10));
        assertEquals("A", bst.deleteNonRecur(10));
        assertNull(bst.getRecur(10));
        assertNull(bst.getNonRecur(10));
        assertNull(bst.predecessor(10));
        assertNull(bst.successor(10));
        assertTrue(bst.less(10).isEmpty());
        assertTrue(bst.greater(10).isEmpty());
        assertTrue(bst.between(5, 15).isEmpty());
    }
}