package vehicles;


public abstract class Vehicles {
    private double fuelQuantity;
    private double fuelPerKm;
    private double tankCapacty;

    public Vehicles(double fuelQuantity, double fuelPerKm,double tankCapacty) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelPerKm(fuelPerKm);
        this.setTankCapacty(tankCapacty);
    }

    public abstract void drive (double distance);

    public abstract void refuel(double liters);

    public double getTankCapacty() {
        return tankCapacty;
    }

    public void setTankCapacty(double tankCapacty) {
        this.tankCapacty = tankCapacty;
    }

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
