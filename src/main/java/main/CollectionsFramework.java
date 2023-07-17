package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionsFramework {

    private static final Logger logger = LoggerFactory.getLogger(CollectionsFramework.class);
    Set<Integer> setList = new HashSet<>();

    public CollectionsFramework() {
        logger.trace("Started this class");
        //setList.add(20);
        setList.add(35);
        setList.add(-2);
        setList.add(20);
        setList.add(1);
    }

    public void print() {
        logger.debug("Set list size: {}", setList.size());
        Iterator<Integer> iterator = setList.iterator();
        while (iterator.hasNext()) {
            logger.debug("{}", iterator.next());
        }
    }
}
