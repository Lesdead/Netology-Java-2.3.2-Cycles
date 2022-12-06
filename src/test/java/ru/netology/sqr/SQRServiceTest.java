package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {
            "'Regular date', 200, 300, 3",
            "'Large numbers', 2000, 4000, 19",
            "'Boundary values min', 0, 300, 8",
            "'Boundary values max', 200, 99999999, 85",
            "'Min = 1', 1, 300, 8",
            "'Max = 1', 200, 1, 0",
            "'Min = -500', -5, 300, 8",
            "'Max = -1', 200, -1, 0"
    })
    void shouldCalculate(String name, int min, int max, int expected) {

        SQRService service = new SQRService();

        int actual = service.calculate(min, max);

        assertEquals(expected, actual);

    }
}