package telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = bf.readLine().split("\\s+");
        for (int a=0; a<numbers.length;a++) {
            Smartphone smartphone = new Smartphone();
            System.out.println(smartphone.calling(numbers[a]));
        }

        String[] sites = bf.readLine().split("\\s+");
        for (int b = 0; b < sites.length; b++) {
            Smartphone smartphone = new Smartphone();
            System.out.println(smartphone.browsing(sites[b]));
        }

    }
}
