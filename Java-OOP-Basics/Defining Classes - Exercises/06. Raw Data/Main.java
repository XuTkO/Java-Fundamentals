package rawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int counts = Integer.parseInt(bf.readLine());

        List<Car> cars = new ArrayList<>();

        for (int a = 0; a < counts; a++) {
            String[] input = bf.readLine().split("\\s+");
            String carModel = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);

            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];

            Cargo cargo = new Cargo(cargoWeight, cargoType);

            Tire tire = new Tire(1.0);
            for (int b = 5; b < input.length; b += 2) {
                if (Double.parseDouble(input[b]) < 1) {
                    tire = new Tire(Double.parseDouble(input[b]));
                    break;
                }
            }

            Car car = new Car(carModel,engine,cargo,tire);
            cars.add(car);

        }

        String command = bf.readLine();

        if ("fragile".equals(command)){
            cars.stream().filter(car -> car.getCargo().getCargoType().equals(command)).filter(car -> car.getTire().getTirePressure() < 1).forEach(System.out::println);
        } else if ("flamable".equals(command)){
            cars.stream().filter(car -> car.getCargo().getCargoType().equals(command)).filter(car -> car.getEngine().getEnginePower() > 250).forEach(System.out::println);
        }

    }
}
