package main;

import com.sun.org.glassfish.gmbal.Description;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class RecursiveBinarySearchTest {

    private static final Logger logger = LoggerFactory.getLogger(RecursiveBinarySearchTest.class);
    private RecursiveBinarySearch<Integer> recursiveBinarySearch;
    private final Integer input[] = {23, -1, 56, 69, 41, 12, 65, 250, 10, 7};

    @Before
    public void setUp() throws Exception {
        recursiveBinarySearch = new RecursiveBinarySearch<Integer>(input);
    }

    @Test
    public void testIntegerCompareMethod() {
        assertEquals(0,input[0].compareTo(23));
    }

    @Test
    @Description("Should return element position of search value")
    public void testPositiveScenario() {
        assertEquals(1, recursiveBinarySearch.search(7));
    }

    @Test
    @Description("Should return -1 for non-existent search value")
    public void testNegativeScenario() {
        assertEquals(-1, recursiveBinarySearch.search(1000));
    }

    @Test
    @Description("Test for null input array. search method should return -1")
    public void testNullInput() {
        recursiveBinarySearch = new RecursiveBinarySearch<>(null);
        assertEquals(-1, recursiveBinarySearch.search(12));

    }
}