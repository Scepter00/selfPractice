package chapterThree;

import static org.junit.jupiter.api.Assertions.*;

class CarClassTest {
    CarClass carClass;
    void startAllTestWith() {
        carClass = new CarClass("Mercedes Benz-AMG GLE 63 S Coupe", "2023", 180_000_000);
    }

}