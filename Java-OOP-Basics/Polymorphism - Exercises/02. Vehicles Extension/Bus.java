package vehicles;

import java.text.DecimalFormat;

public class Bus extends Vehicles {
    private String status;
    DecimalFormat df = new DecimalFormat("#.##");

    public void setStatus(String status) {
        this.status = status;
    }

    public Bus(double fuelQuantity, double fuelPerKm, double tankCapacty) {
        super(fuelQuantity, fuelPerKm, tankCapacty);
    }

    @Override
    public void drive(double distance) {
        if (this.status.equals("DriveEmpty")) {
            if (distance * (super.getFuelPerKm()) <= super.getFuelQuantity()) {
                this.setFuelQuantity(super.getFuelQuantity() - distance * (super.getFuelPerKm()));
                System.out.printf("Bus travelled %s km%n", df.format(distance));
            } else {
                throw new IllegalArgumentException("Bus needs refueling");
            }
        } else if (this.status.equals("Drive")){
            if (distance * (super.getFuelPerKm()+1.4) <= super.getFuelQuantity()) {
                this.setFuelQuantity(super.getFuelQuantity() - distance * (super.getFuelPerKm() + 1.4));
                System.out.printf("Bus travelled %s km%n", df.format(distance));
            } else {
                throw new IllegalArgumentException("Bus needs refueling");
            }
        }
    }

    @Override
    public void refuel(double liters) {
        if (liters <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if (liters + this.getFuelQuantity() > this.getTankCapacty()) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.setFuelQuantity(liters + super.getFuelQuantity());

    }


}
