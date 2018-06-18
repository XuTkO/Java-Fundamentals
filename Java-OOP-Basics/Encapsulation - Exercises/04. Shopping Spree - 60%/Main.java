package shoppingSpree;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> personMap = new LinkedHashMap<>();
        Map<String, Product> productMap = new LinkedHashMap<>();

        String[] inputPerson = bf.readLine().split("[=;]");
        String[] inputProduct = bf.readLine().split("[=;]");

        for (int a = 0; a < inputPerson.length; a += 2) {
            Person person = null;
            try {
                person = new Person(inputPerson[a], Double.parseDouble(inputPerson[a + 1]));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
            if (person != null) {
                personMap.put(person.getNamePerson(), person);
            }

        }


        for (int a = 0; a < inputProduct.length; a += 2) {
            Product product = null;
            try {
                product = new Product(inputProduct[a], Double.parseDouble(inputProduct[a + 1]));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
            if (product != null) {
                productMap.put(product.getNameProduct(), product);
            }

        }
        String command = bf.readLine();

        while (true) {
            if ("END".equals(command)) {
                break;
            }
            String[] tokensCommands = command.split("\\s+");
            String nameCommand = tokensCommands[0];
            String nameProduct = tokensCommands[1];

            if (personMap.containsKey(nameCommand) && productMap.containsKey(nameProduct)) {
                if (personMap.get(nameCommand).hasEnoughtMoney(productMap.get(nameProduct).getCost())) {
                    personMap.get(nameCommand).correctMoney(productMap.get(nameProduct));
                    System.out.printf("%s bought %s%n", personMap.get(nameCommand).getNamePerson(), productMap.get(nameProduct).getNameProduct());
                } else {
                    System.out.printf("%s can't afford %s%n", personMap.get(nameCommand).getNamePerson(), productMap.get(nameProduct).getNameProduct());
                }
            }
            command = bf.readLine();
        }

        personMap.values().stream().forEach(System.out::println);

    }
}
