package enums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String number = bf.readLine();
        String suit = bf.readLine();

        Card card = new Card(number,suit);

        System.out.println(card);

    }
}
