package google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();

        Map<String, Person> map = new LinkedHashMap<>();

        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            String personName = tokens[0];
            Person person = new Person(personName);
            if (!map.containsKey(personName)){
                map.put(personName,person);
            }
            switch (tokens[1]) {
                case "company":
                    Company company = new Company(tokens[2], tokens[3], Double.parseDouble(tokens[4]));
                    map.get(personName).setCompany(company);
                    break;
                case "car":
                    Car car = new Car(tokens[2],Integer.parseInt(tokens[3]));
                    map.get(personName).setCar(car);
                    break;
                case "pokemon":
                    Pokemon pokemon = new Pokemon(tokens[2],tokens[3]);
                    map.get(personName).addPokemon(pokemon);
                    break;
                case "parents":
                    Parents parents = new Parents(tokens[2],tokens[3]);
                    map.get(personName).addParent(parents);
                    break;
                case "children":
                    Children children = new Children(tokens[2],tokens[3]);
                    map.get(personName).addChildren(children);
                    break;
            }

            input = bf.readLine();
        }

        String command = bf.readLine();
        System.out.println(map.get(command));
    }
}
