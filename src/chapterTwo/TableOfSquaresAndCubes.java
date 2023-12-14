package chapterTwo;

public class TableOfSquaresAndCubes {

    /*(Table of Squares and Cubes) Using only the programming techniques you learned in this
 chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and
 prints the resulting values in table format, as shown below. */

    public static void main(String[] args) {
        System.out.printf("%s%10s%10s", "Number", "Square", "Cube");
        System.out.println();
        int count = 0;
        while (count <= 10) {
            System.out.printf("%6d%10d%10d", count, (int) Math.pow(count, 2), (int) Math.pow(count, 3));
            count++;
            System.out.println();
        }
    }
}
