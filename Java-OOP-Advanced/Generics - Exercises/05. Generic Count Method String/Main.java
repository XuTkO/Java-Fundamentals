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

        List<String> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String input = bf.readLine();
            list.add(input);
        }

        String controlString = bf.readLine();
        Box box = new Box();
        int counts = box.returnInteger(list,controlString);
        System.out.println(counts);
    }
}
