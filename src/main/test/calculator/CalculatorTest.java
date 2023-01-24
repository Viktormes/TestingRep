package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void addZeroWithZeroShouldReturnZero() {
        int result = Calculator.test(0,0);
        assertEquals(0,result);
    }
    @Test
    void addOneWithOneShouldReturnTwo() {
        int result = Calculator.test(1,1);
        assertEquals(2,result);
    }

    @Test
    void addOneWithTwoShouldReturnThree() {
        int result = Calculator.test(1,2);
        assertEquals(3,result);
    }
    @Test
    void twoEmptyArraysContainsZeroCommonNumbers(){
        var array1 = new int [0];
        var array2 = new int [0];

        assertEquals(0,Calculator.commonCount(array1,array2));

    }
    @Test
    void twoArraysContainsOneCommonNumber(){
        var array1 = new int []{2};
        var array2 = new int []{2};

        assertEquals(1,Calculator.commonCount(array1,array2));

    }


}
