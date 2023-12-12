package cn.edu.gzhu;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SampleCalculatorTest {
    SampleCalculator calculator = new SampleCalculator();

    @Test
    public void testAdd() {
        int result = calculator.add(50, 20);
        assertEquals(70, result);
    }

    @Test
    public void testSubtration() {
        int result = calculator.subtration(50, 20);
        assertEquals(30, result);
    }
}