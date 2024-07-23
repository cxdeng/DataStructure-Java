package LeetCode.Recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HanoiTest {

    @BeforeEach
    void setUp() {
        // Reset the towers before each test
        Hanoi.a.clear();
        Hanoi.b.clear();
        Hanoi.c.clear();
    }

    @Test
    void testInitWithZeroDisks() {
        Hanoi.init(0);
        assertTrue(Hanoi.a.isEmpty(), "Tower A should be empty");
        assertTrue(Hanoi.b.isEmpty(), "Tower B should be empty");
        assertTrue(Hanoi.c.isEmpty(), "Tower C should be empty");
    }

    @Test
    void testInitWithOneDisk() {
        Hanoi.init(1);
        assertEquals(1, Hanoi.a.size(), "Tower A should have one disk");
        assertEquals(1, Hanoi.a.getLast(), "The disk should be 1");
    }

    @Test
    void testInitWithMultipleDisks() {
        Hanoi.init(3);
        assertEquals(3, Hanoi.a.size(), "Tower A should have three disks");
        assertEquals(3, (int) Hanoi.a.get(0), "The first disk should be 3");
        assertEquals(2, (int) Hanoi.a.get(1), "The second disk should be 2");
        assertEquals(1, (int) Hanoi.a.get(2), "The third disk should be 1");
    }

    @Test
    void testMoveWithZeroDisks() {
        Hanoi.init(0);
        Hanoi.move(0, Hanoi.a, Hanoi.b, Hanoi.c);
        assertTrue(Hanoi.a.isEmpty(), "Tower A should be empty");
        assertTrue(Hanoi.b.isEmpty(), "Tower B should be empty");
        assertTrue(Hanoi.c.isEmpty(), "Tower C should be empty");
    }

    @Test
    void testMoveWithOneDisk() {
        Hanoi.init(1);
        Hanoi.move(1, Hanoi.a, Hanoi.b, Hanoi.c);
        assertTrue(Hanoi.a.isEmpty(), "Tower A should be empty after move");
        assertTrue(Hanoi.b.isEmpty(), "Tower B should be empty after move");
        assertEquals(1, Hanoi.c.size(), "Tower C should have one disk after move");
        assertEquals(1, (int) Hanoi.c.getLast(), "The disk in Tower C should be 1");
    }

    @Test
    void testMoveWithMultipleDisks() {
        Hanoi.init(3);
        Hanoi.move(3, Hanoi.a, Hanoi.b, Hanoi.c);
        assertTrue(Hanoi.a.isEmpty(), "Tower A should be empty after move");
        assertTrue(Hanoi.b.isEmpty(), "Tower B should be empty after move");
        assertEquals(3, Hanoi.c.size(), "Tower C should have three disks after move");
        assertEquals(3, (int) Hanoi.c.get(0), "The first disk in Tower C should be 3");
        assertEquals(2, (int) Hanoi.c.get(1), "The second disk in Tower C should be 2");
        assertEquals(1, (int) Hanoi.c.get(2), "The third disk in Tower C should be 1");
    }
}