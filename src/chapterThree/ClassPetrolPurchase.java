package chapterThree;

public class ClassPetrolPurchase {

    /*(Class PetrolPurchase) Create a class called PetrolPurchase to represent information
 about the petrol you purchase. The class should include five pieces of information in the form of
instance variables—the station’s location (type String), the type of petrol (type String), the quan
tity (type int) of the purchase in liters, the price per liter (double), and the percentage discount
 (double). Your class should have a constructor that initializes the five instance variables. Provide a
 set and a get method for each instance variable. In addition, provide a method named getPurchase
Amount that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter)
 minus the discount, then returns the net amount you had to pay as a double value. Write an appli
cation class named Petrol that demonstrates the capabilities of class PetrolPurchase.*/

        private String station;
        private String typeOfPetrol;
        private int petrolQuantity;
        private double literOfPetrol;
        private double petrolDiscount;

        public ClassPetrolPurchase(String station, String typeOfPetrol, int petrolQuantity, double literOfPetrol, double petrolDiscount) {
            this.station = station;
            this.typeOfPetrol = typeOfPetrol;
            this.petrolQuantity = petrolQuantity;
            this.literOfPetrol = literOfPetrol;
            this.petrolDiscount = petrolDiscount;
        }

        public void setStation(String station) {
            this.station = station;
        }

        public String getStation() {
            return station;
        }

        public void setTypeOfPetrol(String typeOfPetrol) {
            this.typeOfPetrol = typeOfPetrol;
        }

        public String getTypeOfPetrol() {
            return typeOfPetrol;
        }

        public void setPetrolQuantity(int petrolQuantity) {
            this.petrolQuantity = petrolQuantity;
        }

        public int getPetrolQuantity() {
            return petrolQuantity;
        }

        public void setLiterOfPetrol(double literOfPetrol) {
            this.literOfPetrol = literOfPetrol;
        }

        public double getLiterOfPetrol() {
            return literOfPetrol;
        }

        public void setPetrolDiscount(double petrolDiscount) {
            this.petrolDiscount = petrolDiscount;
        }

        public double purchase(double purchaseAmount) {
            return purchaseAmount * literOfPetrol - petrolDiscount;
        }
}
