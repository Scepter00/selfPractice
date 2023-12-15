package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedAccountClassTest {
    ModifiedAccountClass modifiedAccountClass;
    @BeforeEach
    void startAllTestWIth() {
        modifiedAccountClass = new ModifiedAccountClass("Scepter", 5000);
    }

    @Test
    void depositMoneyTest() {
        modifiedAccountClass.deposit(5000);
        double balance = modifiedAccountClass.getBalance();
        assertEquals(10000, balance);
    }

    @Test
    void deposi
}