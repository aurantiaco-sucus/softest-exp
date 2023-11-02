package cn.edu.gzhu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DateTest {
    Date date = new Date(1, 1, 1);

    @Test
    void testIsDayValid() {
        Assertions.assertTrue(date.isDayValid(1, 4, 1));
        Assertions.assertTrue(date.isDayValid(1, 4, 30));
        Assertions.assertFalse(date.isDayValid(1, 4, 0));
        Assertions.assertFalse(date.isDayValid(1, 4, 31));
        Assertions.assertTrue(date.isDayValid(1, 1, 1));
        Assertions.assertTrue(date.isDayValid(1, 1, 31));
        Assertions.assertFalse(date.isDayValid(1, 1, 0));
        Assertions.assertFalse(date.isDayValid(1, 1, 32));
    }

    @Test
    void testIsMonthValid() {
        boolean result = date.isMonthValid(0);
        Assertions.assertEquals(true, result);
    }

    @Test
    void testIsYearValid() {
        boolean result = date.isYearValid(0);
        Assertions.assertEquals(true, result);
    }
}