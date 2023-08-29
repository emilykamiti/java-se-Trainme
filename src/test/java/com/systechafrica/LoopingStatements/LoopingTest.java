package com.systechafrica.LoopingStatements;


import java.util.logging.Logger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) //? default insance
public class LoopingTest {
Looping app = new Looping();
private static final Logger LOGGER = Logger.getLogger(Looping.class.getName());

    @Test
    public void test_number_in_range_one_fifty(){
        int search = app.search(10);
        LOGGER.info("search value: " + search);
        Assertions.assertEquals(10,  search);

    }
}
 