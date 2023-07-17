package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class QuickSort {
    private static final Logger logger = LoggerFactory.getLogger(QuickSort.class);

    private QuickSort() {}
    private static QuickSort instance = null;

    public static QuickSort getInstance() {
        if (instance == null)
            return new QuickSort();

        return instance;
    }

    public int[] sort(int []a, int pivot) {
        logger.trace("Sorting array using QuickSort algorithm");
        int input[] = a.clone();

        return input;
    }

    public int threeMedian(int []a) throws NullPointerException{
        int[] array = a.clone();
        if (array.length == 1)
            return array[0];

        int temp;

        for (int x = 0; x < array.length - 1; x++) {
            for (int i = 0 ; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        logger.debug("array[0]: {}", array[0]);
        logger.debug("array[1]: {}", array[1]);
        logger.debug("array[2]: {}", array[2]);
        return array[1];
    }

}
