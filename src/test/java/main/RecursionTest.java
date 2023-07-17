package main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecursionTest {

    Recursion recursion = null;

    @Before
    public void setUp() throws Exception {
        recursion = new Recursion();
    }

    @Test
    public void testRecursion() {
        assertEquals(13,recursion.fibonacci(8));
    }
}