package calculator;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

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

    @Nested
    @DisplayName("Count Common Numbers")
    class Count {
        @Test
        void twoEmptyArraysContainsZeroCommonNumbers() {
            var array1 = new int[0];
            var array2 = new int[0];

            assertEquals(0, Calculator.commonCount(array1, array2));

        }

        @Test
        void twoArraysContainsOneCommonNumber() {
            var array1 = new int[]{2};
            var array2 = new int[]{2};

            assertEquals(1, Calculator.commonCount(array1, array2));

        }

        @Test
        void twoArraysContainsTwoCommonNumber() {
            var array1 = new int[]{2, 3};
            var array2 = new int[]{2, 3};
            assertEquals(2, Calculator.commonCount(array1, array2));
        }

        @Test
        void twoArraysWithDifferentLength() {

            var array1 = new int[]{1, 2, 3};
            var array2 = new int[]{1, 2};

            assertEquals(2, Calculator.commonCount(array1, array2));

        }

        @Test
        void twoArraysWithDifferentOrder() {
            var array1 = new int[]{1, 2};
            var array2 = new int[]{2, 1};

            assertEquals(2, Calculator.commonCount(array1, array2));

        }

        @Test
        void usingNullAsArgumentShouldReturnZeroCommonNumbers() {
            assertEquals(0, Calculator.commonCount(null, null));

        }
    }

    @Nested
    @DisplayName("Greeting")
    class Greeting {


        @Test
        @DisplayName("when time < 12, greet with Good morning")
        void whenTimeOfDayIsBeforeTwelveGreetWithGoodMorning() {
            assertEquals("Good morning Wille", Calculator.greeting("Wille", LocalTime.of(7, 20)));



        }
        @Test
        @DisplayName("when time > 12, greet with Good afternoon")
        void whenTimeOfDayIsAfterTwelveGreetWithGoodAfternoon() {
            assertEquals("Good afternoon Curt", Calculator.greeting("Curt", LocalTime.of(12, 1)));



        }



    }
    @Nested
    class UnpredictableDice{

        @Test
        void canReturnOne () {

            Calculator.Dice dice = new Calculator.Dice();

            assertEquals(1,dice.roll());



        }


    }

    }




