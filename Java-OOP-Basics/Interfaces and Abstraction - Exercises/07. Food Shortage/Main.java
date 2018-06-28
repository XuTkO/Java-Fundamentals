package foodShortage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());
        Map<String, Buyer> map = new LinkedHashMap<>();

        for (int a=0; a < num; a++){
            String[] tokens = bf.readLine().split("\\s+");
                if (tokens.length == 4){
                    Buyer citizen = new Citizen(Integer.parseInt(tokens[1]),tokens[2],tokens[3]);
                    map.put(tokens[0],citizen);
                } else {
                    Buyer rebel = new Rebel(Integer.parseInt(tokens[1]),tokens[2]);
                    map.put(tokens[0],rebel);
            }
        }

        String command = bf.readLine();

        while (!"End".endsWith(command)){
            if (map.containsKey(command)) {
                map.get(command).buyFood();
            }

            command = bf.readLine();
        }

        System.out.println(map.entrySet().stream().mapToInt(x -> x.getValue().getFood()).sum());
    }
}
