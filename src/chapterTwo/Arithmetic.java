package chapterTwo;

import java.util.Scanner;

/*(Arithmetic) Write an application that asks the user to enter two integers, obtains them from
        the user and prints the square of each, the sum of their squares, and the difference of the squares (first
        number squared minus the second number squared).*/
public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num = scanner.nextInt();
        int square = num * num;

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        int square2 = num2 * num2;

        System.out.printf("The square of num is: %d and num2 is: %d%n", square, square2);
        System.out.printf("The sum of the square of num is: %d and num2 is: %d%n", square + square, square2 + square2);
        System.out.printf("The difference of the square of num and num2 is: %d%n", square - square2);
    }
}
