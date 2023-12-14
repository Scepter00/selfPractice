package chapterTwo;

import java.util.Scanner;

public class NegativePositiveAndZeroValues {

    /*(Negative, Positive and Zero Values) Write a program that inputs five numbers and deter
mines and prints the number of negative numbers input, the number of positive numbers input and
 the number of zeros input.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your 1st num: ");
        int num = input.nextInt();

        System.out.print("Enter your 2nd num: ");
        int num2 = input.nextInt();

        System.out.print("Enter your 3rd num: ");
        int num3 = input.nextInt();

        System.out.print("Enter your 3rd num: ");
        int num4 = input.nextInt();

        System.out.print("Enter your 3rd num: ");
        int num5 = input.nextInt();

        if (num > 0) {
            System.out.println(num + " is a positive number");
        } else if (num < 0) {
            System.out.println(num + " is a negative number");
        } else {
            System.out.println(num + " is zero");
        }

        if (num2 > 0) {
            System.out.println(num2 + " is a positive number");
        } else if (num2 < 0) {
            System.out.println(num2 + " is a negative number");
        } else {
            System.out.println(num2 + " is zero");
        }

        if (num3 > 0) {
            System.out.println(num3 + " is a positive number");
        } else if (num3 < 0) {
            System.out.println(num3 + " is a negative number");
        } else {
            System.out.println(num3 + " is zero");
        }

        if (num4 > 0) {
            System.out.println(num4 + " is a positive number");
        } else if (num3 < 0) {
            System.out.println(num4 + " is a negative number");
        } else {
            System.out.println(num4 + " is zero");
        }

        if (num5 > 0) {
            System.out.println(num5 + " is a positive number");
        } else if (num5 < 0) {
            System.out.println(num5 + " is a negative number");
        } else {
            System.out.println(num5 + " is zero");
        }

        /*int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            double num = scanner.nextDouble();

           if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of zeros: " + zeroCount);
    }
*/

    }
}
