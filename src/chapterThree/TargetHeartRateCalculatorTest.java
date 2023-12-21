package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetHeartRateCalculatorTest {
    TargetHeartRateCalculator targetHeartRateCalculator;
    @BeforeEach
    void startAllWith() {
        targetHeartRateCalculator = new TargetHeartRateCalculator("Ebuka", "Chukwunenye", "Male", 26, 6, 2001, 2.25, 80.5);
    }

    @Test
    void testName() {
        assertEquals();
    }

    @Test
    void testAge() {
        assertEquals(22, targetHeartRateCalculator.getAge());
    }

    @Test
    void testMaxHeartRate() {
        assertEquals(-1_781.0, targetHeartRateCalculator.getHeartMaxRate());
    }

    @Test
    void testMinTargetRate() {
        assertEquals(-890.5, targetHeartRateCalculator.getMinTargetRate());
    }

    @Test
    void testMaxTargetRate() {
        assertEquals(-1_513.85, targetHeartRateCalculator.getMaxTargetRate());
    }
}