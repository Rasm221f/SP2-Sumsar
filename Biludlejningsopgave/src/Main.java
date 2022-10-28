public class Main {

    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();
        Car c1 = new GasolineCar("AF 22454", "Volvo", "p1800", 2, 9);
        Car c2 = new GasolineCar("MD 12945", "Toyota", "Yaris", 4, 20);
        Car c3 = new ElectricCar("ZX 32156", "Tesla", "S", 5, 85, 562);
        Car c4 = new ElectricCar("PM 34215", "Peugeot", "e-208", 5, 50, 362);
        Car c5 = new DieselCar("PO 54312", "Mercedes", "p1800", 5, 14, false);
        Car c6 = new DieselCar("PY 43123", "BMW", "3-series G20", 5, 19, true);

        fleet.addCar(c1);
        fleet.addCar(c2);
        fleet.addCar(c3);
        fleet.addCar(c4);
        fleet.addCar(c5);
        fleet.addCar(c6);
        //System.out.println(c1.getRegistrationFee());
        //System.out.println(fleet);
        System.out.println(fleet.getTotalRegistrationFeeForFleet());
        //System.out.println(c3);


    }

}
