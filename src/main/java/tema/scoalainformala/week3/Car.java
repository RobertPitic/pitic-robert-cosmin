package tema.scoalainformala.week3;

abstract class Car implements Vehicle {
    String model;
    String chassisNumber;
    int fuelTankSize;
    String fuelType;
    int gears;
    double consumptionPer100Km;
    int tireSize;
    double availableFuel;
    double consumption;

    public Car(String model, String chassisNumber, int fuelTankSize, String fuelType, int gears, double consumptionPer100Km, int tireSize, double availableFuel) {
        this.model = model;
        this.chassisNumber = chassisNumber;
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.gears = gears;
        this.consumptionPer100Km = consumptionPer100Km;
        this.tireSize = tireSize;
        this.availableFuel = availableFuel;
    }

    @Override
    public void start() {
        this.consumption = 0;
        System.out.println("Car started...");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
        System.out.println("Total fuel consumed: " + consumption);
    }

    @Override
    public void drive(int distance, int gear) {

        if (gear > gears) {
            System.out.println("Invalid gear.");
        } else {
            consumption = this.consumptionPer100Km * distance / 100;
            System.out.println(" the car has been driven for " + distance + "km in gear: " + gear + ". Fuel consumed: " + consumption);
        }
    }

}
