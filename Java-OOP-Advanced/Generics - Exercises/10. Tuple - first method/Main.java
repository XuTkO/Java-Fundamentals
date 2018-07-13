package Tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        Tuple tuple = new Tuple();

        String[] nameAndAdress = bf.readLine().split("\\s+");
        String wholeName = nameAndAdress[0] + " " + nameAndAdress[1];
        String adress = nameAndAdress[2];
        tuple.setItem1(wholeName);
        tuple.setItem2(adress);
        String[] nameAndBeer = bf.readLine().split("\\s+");
        String name = nameAndBeer[0];
        int litres = Integer.parseInt(nameAndBeer[1]);
        tuple.setItem1(name);
        tuple.setItem2(litres);
        String[] intAndDoubles = bf.readLine().split("\\s+");
        int integer = Integer.parseInt(intAndDoubles[0]);
        double doulbe = Double.parseDouble(intAndDoubles[1]);
        tuple.setItem1(integer);
        tuple.setItem2(doulbe);

        System.out.println(tuple);
    }
}
