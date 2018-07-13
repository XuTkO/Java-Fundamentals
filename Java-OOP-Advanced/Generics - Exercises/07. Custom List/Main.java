package generuc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();

        Custom custom = new Custom();
        while (!"END".equals(input)){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command){
                case "Add":
                    custom.add(tokens[1]);
                    break;
                case "Remove":
                    custom.remove(Integer.parseInt(tokens[1]));
                    break;
                case "Contains":
                    System.out.println(custom.contains(tokens[1]));
                    break;
                case "Swap":
                    custom.swap(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]));
                    break;
                case "Greater":
                    System.out.println(custom.countGreaterThan(tokens[1]));
                    break;
                case "Max":
                    System.out.println(custom.getMax());
                    break;
                case "Min":
                    System.out.println(custom.getMin());
                    break;
                case "Print":
                    System.out.print(custom);
                    break;

            }


            input = bf.readLine();
        }

    }
}
