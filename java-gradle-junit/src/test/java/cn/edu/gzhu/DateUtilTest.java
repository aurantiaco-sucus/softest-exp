package cn.edu.gzhu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DateUtilTest {

    @Test
    void testIsLeapYear() { // dividable by 4, by both 100 and 400, but not just 100 and not 400
        Assertions.assertTrue(DateUtil.isLeapYear(4));
        Assertions.assertTrue(DateUtil.isLeapYear(8));
        Assertions.assertTrue(DateUtil.isLeapYear(400));
        Assertions.assertTrue(DateUtil.isLeapYear(800));
        Assertions.assertFalse(DateUtil.isLeapYear(1));
        Assertions.assertFalse(DateUtil.isLeapYear(5));
        Assertions.assertFalse(DateUtil.isLeapYear(200));
        Assertions.assertFalse(DateUtil.isLeapYear(600));
    }

    @Test
    void testGetDayofYear() {
        Assertions.assertEquals(DateUtil.getDayofYear(new Date(0, 0, 0)), 0);
    }
}