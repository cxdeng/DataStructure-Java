package LeetCode.Recursion;

import org.junit.jupiter.api.Test;

import static LeetCode.Recursion.Factorial.factorial;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {


    @Test
    public void testFactorialBaseCase() {
        assertEquals(1, factorial(1));
    }

    @Test
    public void testFactorialSmallNumbers() {
        assertEquals(2, factorial(2));
        assertEquals(6, factorial(3));
        assertEquals(24, factorial(4));
    }

    @Test
    public void testFactorialLargerNumbers() {
        assertEquals(120, factorial(5));
        assertEquals(720, factorial(6));
        assertEquals(5040, factorial(7));
        assertEquals(40320, factorial(8));
    }

    @Test
    public void testFactorialEdgeCase() {
        assertEquals(1, factorial(1));
    }

    @Test
    public void testFactorialZero() {
        // Test if the factorial method handles zero as input.
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void testFactorialNegative() {
        try {
            Factorial.factorial(-1);
        } catch (IllegalArgumentException e) {
            assertEquals("Factorial is not defined for negative numbers", e.getMessage());
        }
    }
}