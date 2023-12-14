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
            System.out.println("The triple of the first number is: " + num + " The multiple of the second number doubled is: " + num2 + "\n The division of both number is: "  + answer + ".");
            }
        else {
            System.out.println("The division of both numbers is suppose to be 0 not "+ answer);
        }
    }
}
