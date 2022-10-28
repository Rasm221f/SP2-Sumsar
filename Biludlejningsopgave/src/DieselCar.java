public class DieselCar extends AFuelCar{
    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter){
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }
    boolean particleFilter;
    @Override
    String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee = 0;
        if (getKmPrLitre() < 50 && getKmPrLitre() >= 20){
            registrationFee = 330 + 130;
        }  if (getKmPrLitre() >= 15 && getKmPrLitre() < 20) {
            registrationFee = 1050 + 1390;
        }  if (getKmPrLitre() >= 10 && getKmPrLitre() < 15) {
            registrationFee = 2340 + 1850;
        }  if (getKmPrLitre() >= 5 && getKmPrLitre() < 10) {
            registrationFee = 5500 + 2770;
        }  if (getKmPrLitre() > 0 && getKmPrLitre() < 5) {
            registrationFee = 10470 + 15260;
        }
        if (!hasParticleFilter()){
            registrationFee += 1000;
        }
        return registrationFee;
    }

    boolean hasParticleFilter(){
        return particleFilter;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
