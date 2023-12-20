package chapterThree;

public class CarClass {

    /*(Car Class) Create a class called Car that includes three instance variables—a model (type
 String), a year (type String), and a price (double). Provide a constructor that initializes the three
 instance variables. Provide a set and a get method for each instance variable. If the price is not positive,
 do not set its value. Write a test application named CarApplication that demonstrates class Car’s ca
pabilities. Create two Car objects and display each object’s price. Then apply a 5% discount on the
 price of the first car and a 7% discount on the price of the second. Display each Car’s price again.*/

    private String model;
    private String year;
    private double price;

    public CarClass(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;

        if (price > 0.0) {
            this.price = price;
        }
        else {
            throw new IllegalArgumentException("Price must be a positive value");
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void discount(double percentage) {
        if (percentage > 0.0 && percentage < 100.0) {
            double discountAmount = price * (percentage / 100.0);
            price -= discountAmount;
        } else {
            throw new IllegalArgumentException("Invalid discount percentage");
        }
    }
}
