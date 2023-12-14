package chapterTwo;

import java.util.Scanner;

public class BodyMassIndexCalculator {

    /*(Body Mass Index Calculator) We introduced the body mass index (BMI) calculator in
 Exercise 1.10. The formulas for calculating BMI are
 Making a Difference
 119
 BMI
 or
 BMI
 =
 =
 weightInPounds 703
 ×-----------------------------------------------------------------------------------
heightInInches heightInInches
 ×
 weightInKi rams---------------------------------------------------------------------------------------
 log
 heightInMeters heightInMeters
 ×
 Create a BMI calculator that reads the user’s weight in pounds and height in inches (or, if you pre
fer, the user’s weight in kilograms and height in meters), then calculates and displays the user’s
 body mass index. Also, display the BMI categories and their values from the National Heart Lung
 and Blood Institute
http://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmicalc.htm
 so the user can evaluate his/her BMI.
 [Note: In this chapter, you learned to use the int type to represent whole numbers. The BMI
 calculations when done with int values will both produce whole-number results. In Chapter 3
 you’ll learn to use the double type to represent numbers with decimal points. When the BMI cal
culations are performed with doubles, they’ll both produce numbers with decimal points—these
 are called “floating-point” numbers.] */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Weight in Pounds: ");
        int weight = input.nextInt();
        System.out.print("Enter Height in Inches: ");
        int height = input.nextInt();

        double bmi = (double) (weight * 703) / (height * height);
        System.out.printf("The body mass index is %.2f", bmi);
    }

}
