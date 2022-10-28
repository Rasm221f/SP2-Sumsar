import java.util.ArrayList;

public class FleetOfCars {
    private final ArrayList<Car> cars = new ArrayList<>();

    public FleetOfCars(){}

    public void addCar(Car car) {
        cars.add(car);
    }

    public int getTotalRegistrationFeeForFleet() {
        int totalFee = 0;
        for (Car c : cars) {
            totalFee += c.getRegistrationFee();
        }
        return totalFee;
    }


    @Override
    public String toString() {
        return "FleetOfCars{" +
                "fleet=" + cars +
                '}';
    }
}
