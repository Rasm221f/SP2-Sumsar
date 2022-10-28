public abstract class AFuelCar extends ACar {

    private int kmPrLitre;
    private String fuelType;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre){
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    abstract String getFuelType();

    public int getKmPrLitre() {
return kmPrLitre;
    }


    @Override
    public String toString() {
        return super.toString() + "\n Fueltype: " + getFuelType() + "\n Kilometers per litre: " + getKmPrLitre() + "\n";
    }
}
