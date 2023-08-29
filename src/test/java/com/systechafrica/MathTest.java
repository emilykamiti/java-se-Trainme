package com.systechafrica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.systechafrica.Tests.Math;

class MathTest{

    @Test
    void twoplusthreeShouldEqualFive(){
        Math app = new Math(); //? create Math Object
        app.add(2, 2);
        //assertEquals(4, app.add(2, 2));
        assertEquals(4, app.add(2,2));
    }

    @Test
    void twoplusthreeShouldEqualTen(){
        Math app = new Math(); //? create Math Object
        app.add(2, 2);
        //assertEquals(4, app.add(2, 2));
        assertEquals(10, app.add(3, 7));
    }
}
