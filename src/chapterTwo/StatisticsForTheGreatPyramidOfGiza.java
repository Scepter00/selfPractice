package chapterTwo;

public class StatisticsForTheGreatPyramidOfGiza {

    /*(Statistics for the Great Pyramid of Giza) The Great Pyramid of Giza is considered an en
gineering marvel of its time. Use the web to get statistics related to the Great Pyramid of Giza, and
 find the estimated number of stones used to build it, the average weight of each stone, and the num
ber of years it took to build. Create an application that calculates an estimate of how much, by
 weight, of the pyramid was built each year, each hour, and each minute as it was being built. The
 application should input the following information:
a) Estimated number of stones used.
b) Average weight of each stone.
c) Number of years taken to build the pyramid (assuming a year comprises 365 days). */

    public static void main(String[] args) {
        int numberOfStoneUsed = 144_000;
        System.out.println("\nNumber of stone used: " + numberOfStoneUsed);

        int weightOfEachStone = 50;
        System.out.println("\nNumber of each stone used: " + weightOfEachStone);

        int numberOfYears = 20;
        System.out.println("\nNumber of years used in building the Pyramid: " + numberOfYears);

        int totalWeightOfPyramid = numberOfStoneUsed * weightOfEachStone;
        System.out.println("\nTotal weight of Pyramid:  " + totalWeightOfPyramid);

        double weightOfPyramidBuildPerYear = (double) totalWeightOfPyramid / numberOfYears;;
        System.out.printf("\nWeight of Pyramid built per year is: %.2f%n", weightOfPyramidBuildPerYear);

        double weightOfPyramidBuildPerHour = weightOfPyramidBuildPerYear / 365 / 24;
        System.out.printf("\nWeight of Pyramid built per hour is: %.2f%n", weightOfPyramidBuildPerHour);

        double weightOfPyramidBuiltPerMinute = weightOfPyramidBuildPerHour / 60;
        System.out.printf("\nWeight of Pyramid built per minute is: %.2f%n", weightOfPyramidBuiltPerMinute);
    }
}
