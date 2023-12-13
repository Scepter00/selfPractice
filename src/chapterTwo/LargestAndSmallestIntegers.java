package chapterTwo;

import java.util.Scanner;

public class LargestAndSmallestIntegers {

    /*(Largest and Smallest Integers) Write an application that reads five integers and determines
 and prints the largest and smallest integers in the group. Use only the programming techniques you
 learned in this chapter.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = scanner.nextInt();

        System.out.print("Enter forth integer: ");
        int num4 = scanner.nextInt();

        System.out.print("Enter fifth integer: ");
        int num5 = scanner.nextInt();

        int largest = Math.max(num, Math.max(num2, Math.max(num3, Math.max(num4, num5))));
        int smallest = Math.min(num, Math.min(num2, Math.min(num3, Math.min(num4, num5))));

        System.out.printf("The smallest is %d%n", smallest);
        System.out.printf("The largest is %d%n", largest);
    }

}
