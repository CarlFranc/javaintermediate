package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class RecursiveBinarySearch<T extends Integer> {
    private static final Logger logger = LoggerFactory.getLogger(RecursiveBinarySearch.class);
    private T input[] = null;
    private T target = null;

    public RecursiveBinarySearch(T input[]) {
        if (input == null)
            return;
        this.input = input.clone();
        Arrays.sort(this.input);
        logger.debug("Sorted input array: {}", Arrays.toString(this.input));
    }

    public int search(T target) {
        logger.debug("Started search!");

        if (input == null || input.length == 0) {
            logger.error("Input array is empty!");
            return -1;
        }

        logger.trace("Target search is {}", target.intValue());
        this.target = target;

        return recursiveSearch(0, input.length - 1);
    }

    private int recursiveSearch(int lower_bound, int upper_bound) {

        int middle = (lower_bound + upper_bound) / 2;

        if (lower_bound > upper_bound) {
            logger.error("Not found!..");
            return -1;
        }

        if (input[middle].compareTo(target) == 0) {
            logger.debug("Found! at position: {}", middle);
            return middle;
        } else if (input[middle].compareTo(target) < 0) {
            return recursiveSearch(middle + 1, upper_bound);
        } else if (input[middle].compareTo(target) > 0) {
            return recursiveSearch(lower_bound, middle - 1);
        }
        return -1;
    }

}
