package Threeuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        
        List<Threeuple> list = new ArrayList<>();


        String[] nameAndAdress = bf.readLine().split("\\s+");
        String wholeName = nameAndAdress[0] + " " + nameAndAdress[1];
        String adress = nameAndAdress[2];
        String town = nameAndAdress[3];

        Threeuple<String,String,String> threeupleFirst = new Threeuple(wholeName,adress,town);
        list.add(threeupleFirst);

        String[] nameAndBeer = bf.readLine().split("\\s+");
        String name = nameAndBeer[0];
        int litres = Integer.parseInt(nameAndBeer[1]);
        boolean condition;
        if (nameAndBeer[2].equals("drunk")){
            condition = true;
        } else {
            condition = false;
        }
        Threeuple<String,Integer,Boolean> threeupleSecond = new Threeuple(name,litres,condition);
        list.add(threeupleSecond);

        String[] intAndDoubles = bf.readLine().split("\\s+");
        String name1 = intAndDoubles[0];
        double doulbe = Double.parseDouble(intAndDoubles[1]);
        String bankName = intAndDoubles[2];
        Threeuple<String,Double,String> threeuple = new Threeuple(name1,doulbe,bankName);
        list.add(threeuple);

        StringBuilder sb = new StringBuilder();
        for (Threeuple threeuple1 : list) {
            sb.append(threeuple1).append(System.lineSeparator());
        }
        System.out.print(sb.toString());

    }

}
