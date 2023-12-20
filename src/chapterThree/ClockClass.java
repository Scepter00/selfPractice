package chapterThree;

public class ClockClass {

    /*Create a class called Clock that includes three instance variables—an hour
 (type int), a minute (type int) and a second (type int). Provide a constructor that initializes the
 three instance variables and assumes that the values provided are correct. Provide a set and a get
 method for each instance variable. The set method should set the value of all three variables to 0 if
 the value of hour is more than 23, the value of minute is more than 59, and the value of second is
 more than 59. Provide a method displayTime that display the time in an “hh:mm:ss” format. Write
 a test app named ClockTest that demonstrates class Clock’s capabilities.*/

    private int hour;
    private int minute;
    private int second;

    public ClockClass(int hh, int mm, int ss) {
        if (hh > 23 || hh < 0) {
            throw new IllegalArgumentException("Hour is out of bond!");
        }

        if (mm > 59 || mm < 0) {
            throw new IllegalArgumentException("Minute is out of bond!");
        }

        if (ss > 59 || ss < 0) {
            throw new IllegalArgumentException("Second is out of bond!");
        }
        this.hour = hh;
        this.minute = mm;
        this.second = ss;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getSecond() {
        return second;
    }
}
