package chapterTwo;

import java.util.Scanner;

public class DivisibleByThree {

    /*(Divisible by 3) Write an application that reads an integer and determines and prints
 whether it’s divisible by 3 or not. [Hint: Use the remainder operator. A number is divisible by 3 if
 it’s divided by 3 with a remainder of 0.]*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        double answer = num % 3;

        if (answer == 0) {
            System.out.printf("The answer is: %.2f, %d is divisible by 3%n", answer, num);
        }
        if (answer != 0) {
            System.out.printf("The answer is: %.2f, %d is not divisible by 3%n", answer, num);
        }
    }
}
