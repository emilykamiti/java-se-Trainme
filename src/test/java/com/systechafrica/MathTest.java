package com.systechafrica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathTest {
    Math app = new Math();

     @Test
        void subtract() {
            int result = app.subtract(2, 3);
            //then
            int expected = -1;
            //verify that result = expected
            Assertions.assertEquals(expected, result, "The answer  should be -1");
        }

        }

     

