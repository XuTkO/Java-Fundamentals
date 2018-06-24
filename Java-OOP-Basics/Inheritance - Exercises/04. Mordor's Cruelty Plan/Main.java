package mordor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split("\\s+");
        List<Food> foods = new ArrayList<>();

        for (String s : input) {
            Food food = new Food(s);
            foods.add(food);
        }

        Mood mood = new Mood(foods);

        System.out.println(mood);
    }
}
