package cn.edu.gzhu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DateTest {
    Date date = new Date(1, 1, 1);

    @Test
    void testIsDayValid() {
        // boundary: day, month large
        Assertions.assertTrue(date.isDayValid(1, 4, 1));
        Assertions.assertTrue(date.isDayValid(1, 4, 30));
        Assertions.assertFalse(date.isDayValid(1, 4, 0));
        Assertions.assertFalse(date.isDayValid(1, 4, 31));
        // boundary: day, month small
        Assertions.assertTrue(date.isDayValid(1, 1, 1));
        Assertions.assertTrue(date.isDayValid(1, 1, 31));
        Assertions.assertFalse(date.isDayValid(1, 1, 0));
        Assertions.assertFalse(date.isDayValid(1, 1, 32));
        // boundary: month
        Assertions.assertFalse(date.isDayValid(1, 0, 1));
        Assertions.assertFalse(date.isDayValid(1, 13, 1));
        // boundary: day, leap
        Assertions.assertTrue(date.isDayValid(4, 2, 29));
        Assertions.assertFalse(date.isDayValid(4, 2, 30));
        Assertions.assertTrue(date.isDayValid(3, 2, 28));
        Assertions.assertFalse(date.isDayValid(3, 2, 29));
    }

    @Test
    void testIsMonthValid() {
        for (int i = 1; i < 13; i++) {
            Assertions.assertTrue(date.isMonthValid(i));
        }
        Assertions.assertFalse(date.isMonthValid(0));
        Assertions.assertFalse(date.isMonthValid(13));
    }

    @Test
    void testIsYearValid() {
        Assertions.assertTrue(date.isYearValid(1));
        Assertions.assertFalse(date.isYearValid(0));
    }
}