package vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicles {
    DecimalFormat df = new DecimalFormat("#.##");

    public Truck(double fuelQuantity, double fuelPerKm,double tankCapacty) {
        super(fuelQuantity, fuelPerKm,tankCapacty);
    }

    @Override
    public void drive(double distance) {
        if (distance*(super.getFuelPerKm()+1.6) <= super.getFuelQuantity()){
            this.setFuelQuantity(super.getFuelQuantity() - distance*(super.getFuelPerKm()+1.6));
            System.out.printf("Truck travelled %s km%n",df.format(distance));
        } else {
            throw new IllegalArgumentException("Truck needs refueling");
        }
    }

    @Override
    public void refuel(double liters) {
        if (liters <= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if (liters + this.getFuelQuantity() > this.getTankCapacty()){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.setFuelQuantity(0.95*liters + super.getFuelQuantity());
    }
}
