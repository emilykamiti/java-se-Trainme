// package com.systechafrica.interfaces;

// import org.junit.jupiter.api.Assertions;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;

// import com.systechafrica.part2.interfaces.Calculator;



// public class CalculatorTest {
//     Calculator calculator;

//     @BeforeEach
//     void setup(){
//         calculator = new CalculatorImpl(); // correct calculator implementation
//     }


//     @Test
//     void summations(){
//         // inputs
//         int a = 10;
//         int b = 20;

//         //expectated results
//         int expectedResult = 30;

//         // invoke the requests to the functio
//         int actualResult = calculator.sum(a, b);

//         Assertions.assertEquals(expectedResult, actualResult);

//         //verify results

//     }


//     class CalculatorImpl implements Calculator{

//         @Override
//         public int sum(int a, int b) {
//             return a + b;
//         }

//         @Override
//         public int sum(int a, int b, int... otherValues) {
//             int sum = a+b;
//             for (int number: otherValues){
//                 sum = sum + number;
//             }
//             return sum;
//         }

//     }
// }
