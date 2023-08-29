package com.systechafrica.Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GradeTest {

    @Test
    void shouldReturnC(){
        Grade app = new Grade(); // create Object
        assertEquals('C', app.DetermineGrade(59));
    }

    @Test
    void shouldReturnD(){
        Grade app = new Grade();
        assertEquals('D', app.DetermineGrade(40));
    }    
    @Test
    void shouldReturnF(){
        Grade app = new Grade();
        assertEquals('F', app.DetermineGrade(20));
    }    
    @Test
    void shouldReturnB(){
        Grade app = new Grade();
        assertEquals('B', app.DetermineGrade(69));
    }
        @Test
        void shouldReturnA(){
        Grade app = new Grade();
        assertEquals('A', app.DetermineGrade(89));
        
    }    

}
