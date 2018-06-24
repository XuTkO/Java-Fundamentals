package person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name = bf.readLine();
        int age = Integer.parseInt(bf.readLine());

        try {

        Child child = new Child(name, age);
            System.out.println(child);




        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }


    }
}
