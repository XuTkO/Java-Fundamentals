import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int cycles = Integer.parseInt(bf.readLine());
        Map<String,Integer> map = new HashMap<>();

        for (int a = 0; a < cycles; a++){
            String[] input = bf.readLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name,age);

            map.put(person.getName(),person.getAge());

        }
        map.entrySet().stream().sorted((a1,a2)->a1.getKey().compareTo(a2.getKey())).filter(x->x.getValue() > 30)
                .forEach(a-> System.out.println(a.getKey() + " - " + a.getValue()));

    }
}
