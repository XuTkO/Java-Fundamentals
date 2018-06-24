package vehicles;


public abstract class Vehicles {
    private double fuelQuantity;
    private double fuelPerKm;

    public Vehicles(double fuelQuantity, double fuelPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.fuelPerKm = fuelPerKm;
    }

    public abstract void drive (double distance);
    public abstract void refuel(double liters);

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelPerKm() {
        return fuelPerKm;
    }

    public void setFuelPerKm(double fuelPerKm) {
        this.fuelPerKm = fuelPerKm;
    }
}
