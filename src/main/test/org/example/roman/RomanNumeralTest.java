package org.example.roman;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {

    RomanNumeral romanNumeral = new RomanNumeral();
    @DisplayName("Convert From Roman Numeral to Decimal")
    @ParameterizedTest
    @CsvSource({"I, 1",
            "V, 5",
            "X, 10",
            "L, 50",
            "C, 100",
            "D, 500",
            "M, 1000",
            "IV, 4"
    })
    void convertFromRomanToDecimal(String romanNumber, int expected) {
        var result = romanNumeral.convert(romanNumber);
        assertEquals(expected,result);
    }

}