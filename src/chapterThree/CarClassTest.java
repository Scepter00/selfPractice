package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarClassTest {
    CarClass carClass;
    CarClass carClass2;

    @Test
    void startAllTestWith() {
        carClass = new CarClass("Mercedes Benz-AMG GLE 63 S Coupe", "2023", 180_000_000);
        carClass2 = new CarClass("Ford Mustang Gt", "2023", 18_900_000);

        System.out.println("Car 1 Price: $" + carClass.getPrice());
        System.out.println("Car 2 Price: $" + carClass2.getPrice());

        carClass.discount(5);
        carClass2.discount(7);

        System.out.println("\nDiscounts:");
        System.out.println("Car 1 Price: $" + carClass.getPrice());
        System.out.println("Car 2 Price: $" + carClass2.getPrice());

        assertEquals(171_000_000, carClass.getPrice());
        assertEquals(17_577_000, carClass2.getPrice());
    }
}