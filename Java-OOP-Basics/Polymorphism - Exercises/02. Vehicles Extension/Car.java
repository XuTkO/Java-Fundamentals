package vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicles {

    DecimalFormat df = new DecimalFormat("#.##");
    public Car(double fuelQuantity, double fuelPerKm,double tankCapacty) {
        super(fuelQuantity, fuelPerKm, tankCapacty);
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
        if (liters <= 0){
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if (liters + this.getFuelQuantity() > this.getTankCapacty()){
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.setFuelQuantity(liters+super.getFuelQuantity());

    }
}
