package generuc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        List<Double> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            double input = Double.parseDouble(bf.readLine());
            list.add(input);
        }

        double controlString = Double.parseDouble(bf.readLine());
        Box box = new Box();
        int counts = box.returnInteger(list,controlString);
        System.out.println(counts);
    }
}
