package main;

import com.sun.org.glassfish.gmbal.Description;
import org.junit.Before;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

import static org.junit.Assert.*;

public class QuickSortTest {

    QuickSort quickSort;

    @Before
    public void setUp() throws Exception {
        quickSort = QuickSort.getInstance();
    }

    @Test
    @Description("Should sort the array and return the middle value")
    public void threeMedianPositiveTest() {
        int[] input = {3, 2, 1};
        assertEquals(2, quickSort.threeMedian(input));
    }

    @Test
    @Description("Should throw null pointer exception when supplied with null array")
    public void threeMedianNullTest() {
        assertThrows(NullPointerException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                quickSort.threeMedian(null);
            }
        });
    }

    @Test
    @Description("Should return same element when supplied with size 1 array")
    public void threeMedianOneElement() {
        int []input = { 2 };
        assertEquals(2, quickSort.threeMedian(input));
    }
}