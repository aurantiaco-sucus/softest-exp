package cn.edu.gzhu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DateUtilTest {

    @Test
    void testIsLeapYear() {
        boolean result = DateUtil.isLeapYear(0);
        Assertions.assertEquals(true, result);
    }

    @Test
    void testGetDayofYear() {
        int result = DateUtil.getDayofYear(new Date(0, 0, 0));
        Assertions.assertEquals(0, result);
    }
}