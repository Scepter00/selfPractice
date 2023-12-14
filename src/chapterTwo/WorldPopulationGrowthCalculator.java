package chapterTwo;

public class WorldPopulationGrowthCalculator {

    /*(World Population Growth Calculator) Search the Internet to determine the current world
 population and the annual world population growth rate. Write an application that inputs these val
ues, then displays the estimated world population after one, two, three, four and five years. */

    public static void main(String[] args) {
        long currentWorldPopulation = 700_000_000_000L;
        System.out.printf("The current World population is: %d", currentWorldPopulation);

        int annualWorldPopulation = 83000000;
        System.out.printf("%nThe would population is increased each year by: %d", annualWorldPopulation);

        long worldPopulationAfterOneYear = currentWorldPopulation + annualWorldPopulation;
        System.out.printf("%nWorld population after one year is: %d", worldPopulationAfterOneYear);

        long worldPopulationAfterTwoYears = worldPopulationAfterOneYear + currentWorldPopulation;
        System.out.println("\nWorld population after two years is: " + worldPopulationAfterTwoYears);

        long worldPopulationAfterThreeYears = worldPopulationAfterTwoYears + currentWorldPopulation;
        System.out.printf("%nWorld population after Three year is: %d", worldPopulationAfterThreeYears);

        long worldPopulationAfterFourYears = worldPopulationAfterThreeYears + currentWorldPopulation;
        System.out.println("\nWorld population after two years is: " + worldPopulationAfterFourYears);

        long worldPopulationAfterFiveYears = worldPopulationAfterFourYears + currentWorldPopulation;
        System.out.printf("%nWorld population after Three year is: %d", worldPopulationAfterFiveYears);
    }
}
