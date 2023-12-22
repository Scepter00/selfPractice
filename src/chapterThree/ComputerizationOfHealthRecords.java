package chapterThree;

public class ComputerizationOfHealthRecords {

    /*(Computerization of Health Records) A health-care issue that has been in the news lately is
 the computerization of health records. This possibility is being approached cautiously because of
 sensitive privacy and security concerns, among others. [We address such concerns in later exercises.]
 Computerizing health records could make it easier for patients to share their health profiles and his
tories among their various health-care professionals. This could improve the quality of health care,
 help avoid drug conflicts and erroneous drug prescriptions, reduce costs and, in emergencies, could
 save lives. In this exercise, you’ll design a “starter” HealthProfile class for a person. The class attri
butes should include the person’s first name, last name, gender, date of birth (consisting of separate
 attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class
 should have a constructor that receives this data. For each attribute, provide set and get methods.
 The class also should include methods that calculate and return the user’s age in years, maximum
 heart rate and target-heart-rate range (see Exercise 3.16), and body mass index (BMI; see
 Exercise 2.33). Write a Java app that prompts for the person’s information, instantiates an object of
 class HealthProfile for that person and prints the information from that object—including the per
son’s first name, last name, gender, date of birth, height and weight—then calculates and prints the
 person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display
 the BMI values chart from Exercise 2.33.*/

    private String firstName;
    private String lastName;
    private String gender;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private double height;
    private double weight;
    public ComputerizationOfHealthRecords(String firstName, String lastName, String gender,
                              int dayOfBirth, int monthOfBirth, int yearOfBirth, double height, double weight) {
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
    public double getBMI() {
        return (weight * 703) / (height * height);
    }
}
