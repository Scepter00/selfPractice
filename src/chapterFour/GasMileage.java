package chapterFour;

public class GasMileage {

    /* (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
 kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
 a Java application that will input the miles driven and gallons used (both as integers) for each trip.
 The program should calculate and display the miles per gallon obtained for each trip and print the
 combined miles per gallon obtained for all trips up to this point. All averaging calculations should
 produce floating-point results. Use class Scanner and sentinel-controlled iteration to obtain the data
 from the user.*/

    private int totalMiles;
    private int totalGallons;

    public GasMileage(int miles, int gallons) {
        totalMiles += miles;
        totalGallons += gallons;
    }
    public void recordTrip(int miles, int gallons) {
        totalMiles += miles;
        totalGallons += gallons;
    }
    public double MilesPerGallon() {
        if (totalGallons == 0) {
            return 0.0;
        }
        return (double) totalMiles / totalGallons;
    }
    public int getTotalMiles() {
        return totalMiles;
    }
    public int getTotalGallons() {
        return totalGallons;
    }
}
