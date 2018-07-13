package generuc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        Box box = null;
        for (int i = 0; i < num; i++) {
            int input = Integer.parseInt(bf.readLine());
            box = new Box(input);
            System.out.println(box);
        }

    }
}
