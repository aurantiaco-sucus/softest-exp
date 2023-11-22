package cn.edu.gzhu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

class DateUtilTest {

    @Test
    void testIsLeapYear() { // dividable by 4, by both 100 and 400, but not just 100 and not 400
        assertTrue(DateUtil.isLeapYear(4));
        assertTrue(DateUtil.isLeapYear(8));
        assertTrue(DateUtil.isLeapYear(400));
        assertTrue(DateUtil.isLeapYear(800));
        assertFalse(DateUtil.isLeapYear(1));
        assertFalse(DateUtil.isLeapYear(5));
        assertFalse(DateUtil.isLeapYear(200));
        assertFalse(DateUtil.isLeapYear(600));

        for (int year = 1; year < 1000000; year++) {
            assertEquals(LocalDate.ofYearDay(year, 1).isLeapYear(), DateUtil.isLeapYear(year));
        }
    }

    @Test
    void testGetDayofYear() {
        for (int epochDay = 0; epochDay < LocalDate.of(9999, 12,31).toEpochDay(); epochDay++) {
            var localDate = LocalDate.ofEpochDay(epochDay);
            var ldDoy = localDate.getDayOfYear();
            var doy = DateUtil.getDayofYear(
                    new Date(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth()));
            assertEquals(ldDoy, doy);
        }
    }
}