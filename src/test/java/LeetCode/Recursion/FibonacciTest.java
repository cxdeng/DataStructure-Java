package LeetCode.Recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    public void testFibonacciZero() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    public void testFibonacciOne() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    public void testFibonacciPositiveNumbers() {
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(2, Fibonacci.fibonacci(3));
        assertEquals(3, Fibonacci.fibonacci(4));
        assertEquals(5, Fibonacci.fibonacci(5));
        assertEquals(8, Fibonacci.fibonacci(6));
        assertEquals(13, Fibonacci.fibonacci(7));
        assertEquals(21, Fibonacci.fibonacci(8));
        assertEquals(34, Fibonacci.fibonacci(9));
        assertEquals(55, Fibonacci.fibonacci(10));
    }

    @Test
    public void testFibonacciLargerNumbers() {
        assertEquals(144, Fibonacci.fibonacci(12));
        assertEquals(233, Fibonacci.fibonacci(13));
    }

}