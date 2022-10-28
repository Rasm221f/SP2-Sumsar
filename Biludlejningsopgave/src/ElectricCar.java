public class ElectricCar extends ACar {

    private int batteryCapacity;
    private int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    int getMaxRangeKm() {
        return maxRange;
    }

    int getWhPrKm() {
        return ((getBatteryCapacityKWh() * 1000) / getMaxRangeKm());
    }

    public int getRegistrationFee() {
        int kmPrLitre = Math.round(100 / (getWhPrKm() / 91.25f));

        if (kmPrLitre < 5) {
            return 10470;
        }
        if (kmPrLitre < 10) {
            return 5500;
        }
        if (kmPrLitre < 15) {
            return 2340;
        }
        if (kmPrLitre < 20) {
            return 1050;
        }else{
            return 330;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " \n Battery capacity: " + getBatteryCapacityKWh() + "\n Max range: " + getMaxRangeKm() + "\n";
    }
}
