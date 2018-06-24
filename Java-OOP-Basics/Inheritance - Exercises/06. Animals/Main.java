package Animal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();

        while (!"Beast!".equals(input)) {
            String[] tokens = bf.readLine().split("\\s+");
            try {
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                String gender = tokens[2];

                switch (input) {
                    case "Cat":
                        Animal cat = new Cat(name, age, gender);
                        System.out.print(cat);
                        cat.produceSound();
                        break;
                    case "Dog":
                        Animal dog = new Dog(name, age, gender);
                        System.out.print(dog);
                        dog.produceSound();
                        break;
                    case "Frog":
                        Animal frog = new Frog(name, age, gender);
                        System.out.print(frog);
                        frog.produceSound();
                        break;
                    case "Kitten":
                        Animal kitten = new Kitten(name, age, gender);
                        System.out.print(kitten);
                        kitten.produceSound();
                        break;
                    case "Tomcat":
                        Animal tomcat = new Tomcat(name, age, gender);
                        System.out.print(tomcat);
                        tomcat.produceSound();
                        break;
                        default:
                            throw new IllegalArgumentException("Invalid input!");

                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
            input = bf.readLine();
        }
    }
}