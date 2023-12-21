package chapterThree;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class TargetHeartRateCalculatorTest {
    TargetHeartRateCalculator targetHeartRateCalculator;
    @BeforeEach
    void startAllWith() {
        targetHeartRateCalculator = new TargetHeartRateCalculator();
    }
}