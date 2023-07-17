package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Recursion {
    private static final Logger logger = LoggerFactory.getLogger(Recursion.class);
    public int fibonacci(int num) {
        if (num == 1 || num == 2)
            return 1;

        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
