package main;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class CollectionsFrameworkTest {
    private static final Logger logger = LoggerFactory.getLogger(CollectionsFramework.class);
    CollectionsFramework collectionsFramework;

    @Before
    public void setUp() throws Exception {
        collectionsFramework = new CollectionsFramework();
    }

    @Test
    public void printTest() {
        collectionsFramework.print();
    }

    @Test
    public void intTest() {
        int value1 = 9;
        int value2 = 2;
        double answer = (double) (value1 + value2) / 2;
        logger.debug("Answer is {}", answer);
    }
}