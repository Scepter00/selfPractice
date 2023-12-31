package chapterThree;

public class TargetHeartRateCalculator {

    /*(Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see
 that your heart rate stays within a safe range suggested by your trainers and doctors. According to the American Heart Association (AHA) (http://bit.ly/TargetHeartRates), the formula for cal
culating your maximum heart rate in beats per minute is 220 minus your age in years. Your target
 heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are estimates
 provided by the AHA. Maximum and target heart rates may vary based on the health, fitness and
 gender of the individual. Always consult a physician or qualified health-care professional before
 beginning or modifying an exercise program.] Create a class called HeartRates. The class attributes
 should include the person’s first name, last name and date of birth (consisting of separate attributes
 for the month, day and year of birth). Your class should have a constructor that receives this data as
 parameters. For each attribute provide set and get methods. The class also should include a method
 that calculates and returns the person’s age (in years), a method that calculates and returns the per
son’s maximum heart rate and a method that calculates and returns the person’s target heart rate.
 Write a Java app that prompts for the person’s information, instantiates an object of class Heart
Rates and prints the information from that object—including the person’s first name, last name and
 date of birth—then calculates and prints the person’s age in (years), maximum heart rate and target
heart-rate range.*/

        private String firstName;
        private String lastName;
        private String gender;
        private int dayOfBirth;
        private int monthOfBirth;
        private int yearOfBirth;
        private double height;
        private double weight;
        public TargetHeartRateCalculator(String firstName, String lastName, String gender, int dayOfBirth, int monthOfBirth, int yearOfBirth, double height, double weight) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
            this.dayOfBirth = dayOfBirth;
            this.monthOfBirth = monthOfBirth;
            this.yearOfBirth = yearOfBirth;
            this.height = height;
            this.weight = weight;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public String getFirstName() {
            return firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public String getLastName() { return lastName; }

        public void setGender(String gender) {
            this.gender = gender;
        }
        public String getGender() { return gender; }

        public void setDayOfBirth(int dayOfBirth) {
            this.dayOfBirth = dayOfBirth;
        }
        public int getDayOfBirth() { return dayOfBirth; }

        public void setMonthOfBirth(int monthOfBirth) {
            this.monthOfBirth = monthOfBirth;
        }
        public int getMonthOfBirth() { return monthOfBirth; }

        public void setYearOfBirth(int yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
        }
        public int getYearOfBirth() { return yearOfBirth; }

        public void setHeight(double height) {
            this.height = height; }
        public double getHeight() { return height; }

        public void setWeight(double weight) { this.weight = weight; }
        public double getWeight() { return weight; }

        public int getAge() {
            return 2023 - yearOfBirth;
        }

        public int getHeartMaxRate() {
            return 220 - yearOfBirth;
        }

        public double getMinTargetRate() {
            return 0.5 * getHeartMaxRate();
        }

        public double getMaxTargetRate() {
            return 0.85 * getHeartMaxRate();
        }

    }
