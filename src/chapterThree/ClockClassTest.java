package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockClassTest {
    ClockClass clockClass;
    @BeforeEach
    void startAllTestWIth() {
        clockClass = new ClockClass(23, 30, 0);
    }

    @Test
    void testHour() {
        assertEquals(23, clockClass.getHour());
    }

    @Test
    void testMinute() {
        assertEquals(30, clockClass.getMinute());
    }

    @Test
    void testSecond() {
        assertEquals(0, clockClass.getSecond());
    }
}