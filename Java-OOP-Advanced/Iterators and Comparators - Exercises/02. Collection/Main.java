package exerc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();

        ListyIterator<String> listyIterator = null;

        while (!"END".equals(input)){
            String[] tokens = input.split("\\s+");
            switch (tokens[0]){
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Create":
                    listyIterator = new ListyIterator<>(Arrays.stream(tokens).skip(1).toArray(String[]::new));
                    break;
                case "Print":
                    listyIterator.print();
                    break;
                case "PrintAll":
                    listyIterator.PrintAll();
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
            }


            input = bf.readLine();
        }

    }
}
