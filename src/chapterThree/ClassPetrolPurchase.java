package chapterThree;

public class ClassPetrolPurchase {

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
