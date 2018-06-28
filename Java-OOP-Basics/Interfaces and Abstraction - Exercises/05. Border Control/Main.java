package borderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();

        List<Inhabitant> inhabitants = new ArrayList<>();

        while (!"End".equals(input)){
            String[] tokens = input.split("\\s+");
            if (tokens.length ==2 ){
                Inhabitant robot = new Robot(tokens[0]);
                robot.id(tokens[1]);
                inhabitants.add(robot);
            } else {
                Inhabitant citizen = new Citizen(tokens[0],tokens[1]);
                citizen.id(tokens[2]);
                inhabitants.add(citizen);
            }

            input = bf.readLine();
        }

        String toCheck = bf.readLine();

        for (Inhabitant inhabitant : inhabitants) {
            inhabitant.checkId(toCheck);
        }

    }
}
