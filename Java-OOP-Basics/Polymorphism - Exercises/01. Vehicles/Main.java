package vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] carInfo = bf.readLine().split("\\s+");
        double fuelCar = Double.parseDouble(carInfo[1]);
        double carConsumptionPerKm = Double.parseDouble(carInfo[2]);
        Vehicles car = new Car(fuelCar,carConsumptionPerKm);
        String[] truckInfo = bf.readLine().split("\\s+");
        double fuelTruck = Double.parseDouble(truckInfo[1]);
        double truckConsumptionPerKm = Double.parseDouble(truckInfo[2]);
        Vehicles truck = new Truck(fuelTruck,truckConsumptionPerKm);

        int numCommands = Integer.parseInt(bf.readLine());

        for (int a=0; a < numCommands; a++){
            String[] commands = bf.readLine().split("\\s+");
            String command = commands[0];
            String vehicle = commands[1];
            double kilometers = Double.parseDouble(commands[2]);
            try {
                if ("Car".equals(vehicle)) {
                    if ("Drive".equals(command)) {
                        car.drive(kilometers);
                    } else if ("Refuel".equals(command)) {
                        car.refuel(kilometers);
                    }
                } else if ("Truck".equals(vehicle)){
                    if ("Drive".equals(command)) {
                        truck.drive(kilometers);
                    } else if ("Refuel".equals(command)){
                        truck.refuel(kilometers);
                    }
                }
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }

        System.out.printf("Car: %.2f%n",car.getFuelQuantity());
        System.out.printf("Truck: %.2f",truck.getFuelQuantity());
    }
}
