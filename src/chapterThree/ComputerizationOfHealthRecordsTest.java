package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerizationOfHealthRecordsTest {
    ComputerizationOfHealthRecords computerizationOfHealthRecords;
    @BeforeEach
    void startTestWith() {
        computerizationOfHealthRecords = new ComputerizationOfHealthRecords("Ebuka", "Chukwunenye", "Male",
                26, 6, 2001, 2.25, 80.5);
    }

    @Test
    void testFirstName() {
        assertEquals("Ebuka", computerizationOfHealthRecords.getFirstName());
    }

    @Test
    void testLastName() {
        assertEquals("Chukwunenye", computerizationOfHealthRecords.getLastName());
    }

    @Test
    void testGender() {
        assertEquals("Male", computerizationOfHealthRecords.getGender());
    }

    @Test
    void testHeight() {
        assertEquals(2.25, computerizationOfHealthRecords.getHeight());
    }

    @Test
    void testWeight() {
        assertEquals(80.5, computerizationOfHealthRecords.getWeight());
    }

    @Test
    void testAge() {
        assertEquals(22, computerizationOfHealthRecords.getAge());
    }

    @Test
    void testBMI() {
        assertEquals(11_178.567901234568, computerizationOfHealthRecords.getBMI());
    }

    @Test
    void testMaxHeartRate() {
        assertEquals(-1_781.0, computerizationOfHealthRecords.getHeartMaxRate());
    }

    @Test
    void testMinTargetHeartRate() {
        assertEquals(-890.5, computerizationOfHealthRecords.getMinTargetRate());
    }

    @Test
    void testMaxTargetHeartRate() {
        assertEquals(-1_513.85, computerizationOfHealthRecords.getMaxTargetRate());
    }
}