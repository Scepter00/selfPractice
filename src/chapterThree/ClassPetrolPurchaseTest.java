package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassPetrolPurchaseTest {
    ClassPetrolPurchase classPetrolPurchase;
    @BeforeEach
    void startAllTestWIth() {
        classPetrolPurchase = new ClassPetrolPurchase("Total","Petrol", 91, 630.63, 2.50);
    }

    @Test
    void purchaseAmountTest() {
        double purchaseAmount = classPetrolPurchase.purchase(  57.384);
        double expectedAmount = 57.384 * 630.63 - 2.50;

        assertEquals(expectedAmount, purchaseAmount);
    }
}