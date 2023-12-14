package chapterTwo;

import java.util.Scanner;

public class Multiples {

    /*(Multiples) Write an application that reads two integers, determines whether the first
 number tripled is a multiple of the second number doubled, and prints the result. [Hint: Use the
 remainder operator.]*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num = input.nextInt() * 3;
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt() * 2;
        int answer = num % num2;

        if (answer == 0) {
            System.out.println("The triple of " + num + " is a multiple of the double of " + num2 + ": " + answer + ".");
            }
        else {
            System.out.println("");
        }
    }
}
