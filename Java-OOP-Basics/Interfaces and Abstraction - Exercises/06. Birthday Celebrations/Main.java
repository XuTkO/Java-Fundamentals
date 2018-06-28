package birthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        List<Inhabitants> inhabitants = new ArrayList<>();

        while (!"End".equals(input)){
            String[] tokens = input.split("\\s+");
            switch (tokens[0]){
                case "Citizen":
                    Inhabitants citizen = new Citizens(tokens[1],Integer.parseInt(tokens[2]),tokens[3],tokens[4]);
                    inhabitants.add(citizen);
                    break;
                case "Robot":
                    Inhabitants robot = new Robots(tokens[1],tokens[2]);
                    inhabitants.add(robot);
                    break;
                case "Pet":
                    Inhabitants pet = new Pets(tokens[1],tokens[2]);
                    inhabitants.add(pet);
                    break;
            }


            input = bf.readLine();
        }

        String command = bf.readLine();

        for (Inhabitants inhabitant : inhabitants) {
            inhabitant.getSth(command);
        }
    }
}
