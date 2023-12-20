package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarClassTest {
    CarClass carClass;
    CarClass carClass2;
    void startAllTestWith() {
        carClass = new CarClass("Mercedes Benz-AMG GLE 63 S Coupe", "2023", 180_000_000);
        carClass = new CarClass("Ford Mustang Gt", "2023", 18_900_000);
    }

    @Test
    void priceTest() {
    }

}