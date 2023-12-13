package chapterTwo;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {

    /*(Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
 user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
 shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
 representation of the average. So, if the sum of the values is 7, the average should be 2, not
 2.3333….]*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = scanner.nextInt();

        int sum = num + num2 + num3;
        System.out.printf("The sum is: %d%n", sum);

        double average = (double) sum / 3;
        System.out.printf("The average is: %.2f%n", average);

        int product = num * num2 * num3;
        System.out.printf("The product is: %d%n", product);

        int smallest = sum;
        if (product < smallest)
            smallest = product;

        if (average < smallest)
            smallest = (int) average;

        int largest = product;
        if (average > largest)
            average = largest;

        if (sum > largest)
            largest = sum;

        System.out.printf("Smallest is: %d%n", smallest);
        System.out.printf("Largest is: %d%n", largest);

    }
}
