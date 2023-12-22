package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerizationOfHealthRecordsTest {
    ComputerizationOfHealthRecords computerizationOfHealthRecords;
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
}