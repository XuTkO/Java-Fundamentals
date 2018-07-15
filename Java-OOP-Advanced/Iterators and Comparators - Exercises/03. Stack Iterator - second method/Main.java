package stackIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();

        Stack<Integer> stack = new Stack<>();

        while (!"END".equals(input)) {
            String[] tokens = input.split(" ", 2);
            String command = tokens[0];
            switch (command) {
                case "Push":
                    int[] nums = Arrays.stream(tokens[1].trim().split(", ")).mapToInt(Integer::parseInt).toArray();
                    for (int num : nums) {
                        stack.push(num);
                    }
                    break;
                case "Pop":
                    try {
                        stack.pop();
                    } catch (NoSuchElementException ex) {
                        System.out.println("No elements");
                    }
                    break;
            }


            input = bf.readLine();
        }


        System.out.print(stack);
        System.out.print(stack);
    }

}
