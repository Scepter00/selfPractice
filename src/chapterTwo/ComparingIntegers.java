package chapterTwo;

import java.util.Scanner;

public class ComparingIntegers {

    /*(Comparing Integers) Write an application that asks the user to enter one integer, obtains
 it from the user and displays whether the number and its square are greater than, equal to, not equal
 to, or less than the number 100.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int num = scanner.nextInt();
        int numSquare = num * num;
        int num3 = 100;

        if (numSquare > num3) {
            System.out.printf("%d > %d%n", numSquare, num3);
        }

        if (numSquare == num3) {
            System.out.printf("%d == %d%n", numSquare, num3);
        }

        if (numSquare != num3) {
            System.out.printf("%d != %d%n", numSquare, num3);
        }

        if (numSquare < num3) {
            System.out.printf("%d < %d%n", numSquare, num3);
        }

    }
}
