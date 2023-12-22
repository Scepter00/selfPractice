package chapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasMileageTest {
    GasMileage gasMileage;
    @BeforeEach
    void startTestWith() {
        gasMileage = new GasMileage(300, 10);
    }

    @Test
    void testMilesPerGallon() {
        assertEquals(30, gasMileage.MilesPerGallon());
    }

    @Test
    void testTotalGallons() {
        assertEquals(10, gasMileage.getTotalGallons());
    }

    @Test
    void testTotalMiles() {
        assertEquals(300, gasMileage.getTotalMiles());
    }
}