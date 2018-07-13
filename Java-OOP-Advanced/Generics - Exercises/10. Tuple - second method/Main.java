package Tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Tuple> tupleList = new ArrayList<>();

        addFirstTuple(bf, tupleList);
        addSecondTuple(bf,tupleList);
        addThirdTuple(bf,tupleList);
        printTuples(tupleList);
    }

    private static void addThirdTuple(BufferedReader bf, List<Tuple> tupleList) throws IOException {
        String[] tokens = bf.readLine().split("\\s+");
        int num1 = Integer.parseInt(tokens[0]);
        double num2 = Double.parseDouble(tokens[1]);
        Tuple<Integer,Double> tuple = new Tuple<>(num1,num2);
        tupleList.add(tuple);
    }

    private static void printTuples(List<Tuple> tupleList) {
        for (Tuple tuple : tupleList) {
            System.out.println(tuple);
        }
    }

    private static void addSecondTuple(BufferedReader bf, List<Tuple> tupleList) throws IOException {
        String[] tokens = bf.readLine().split("\\s+");
        String name = tokens[0];
        int litres = Integer.parseInt(tokens[1]);
        Tuple<String,Integer> tuple = new Tuple<>(name,litres);
        tupleList.add(tuple);
    }

    private static void addFirstTuple(BufferedReader bf, List<Tuple> tupleList) throws IOException {
        String[] tokens = bf.readLine().split("\\s+");
        String name = tokens[0] + " " + tokens[1];
        String adress = tokens[2];
        Tuple<String,String> tuple = new Tuple<>(name,adress);
        tupleList.add(tuple);
    }
}
