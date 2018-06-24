package vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicles {
    DecimalFormat df = new DecimalFormat("#.##");

    public Truck(double fuelQuantity, double fuelPerKm) {
        super(fuelQuantity, fuelPerKm);
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
        this.setFuelQuantity(0.95*liters + super.getFuelQuantity());
    }
}
