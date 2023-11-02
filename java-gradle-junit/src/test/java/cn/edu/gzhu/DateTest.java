package cn.edu.gzhu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DateTest {
    Date date = new Date(1, 1, 1);

    @Test
    void testIsDayValid() {
        for (int m : new int[]{4, 6, 9, 11}) {
            for (int d = 1; d <= 30; d++) {
                Assertions.assertTrue(date.isDayValid(0, m, d));
            }
            Assertions.assertFalse(date.isDayValid(0, m, 31));
            Assertions.assertFalse(date.isDayValid(0, m, 0));
            Assertions.assertFalse(date.isDayValid(0, m, -1));
        }
        for (int m : new int[]{1, 3, 5, 7, 8, 10, 12}) {
            for (int d = 1; d <= 31; d++) {
                Assertions.assertTrue(date.isDayValid(0, m, d));
            }
            Assertions.assertFalse(date.isDayValid(0, m, 32));
            Assertions.assertFalse(date.isDayValid(0, m, 0));
            Assertions.assertFalse(date.isDayValid(0, m, -1));
        }
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