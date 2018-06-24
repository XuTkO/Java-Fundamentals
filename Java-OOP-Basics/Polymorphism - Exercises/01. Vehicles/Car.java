package vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicles {

    DecimalFormat df = new DecimalFormat("#.##");
    public Car(double fuelQuantity, double fuelPerKm) {
        super(fuelQuantity, fuelPerKm);
    }

    @Override
    public void drive(double distance) {
        if (distance*(super.getFuelPerKm()+0.9) <= super.getFuelQuantity()){
            this.setFuelQuantity(super.getFuelQuantity() - distance*(super.getFuelPerKm()+0.9));
            System.out.printf("Car travelled %s km%n",df.format(distance));
        } else {
            throw new IllegalArgumentException("Car needs refueling");
        }
    }

    @Override
    public void refuel(double liters) {
        this.setFuelQuantity(liters+super.getFuelQuantity());

    }
}
