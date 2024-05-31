package chapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditLimitCalculatorTest {
    CreditLimitCalculator creditLimitCalculator;
    @BeforeEach
    void startTestWith() {
        creditLimitCalculator = new CreditLimitCalculator(123, 5000,
                2500, 4000, 10000);
    }

    @Test
    void testCreditLimitExceeded() {
        assertTrue(creditLimitCalculator.isCreditLimitExceeded());
    }

}