package chapterThree;

public class TargetHeartRateCalculator {
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
            return 2022 - yearOfBirth;
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
