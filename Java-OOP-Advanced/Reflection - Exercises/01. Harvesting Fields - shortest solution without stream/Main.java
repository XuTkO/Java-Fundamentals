package pr01HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        Field[] fields = RichSoilLand.class.getDeclaredFields();


        while (!"HARVEST".equals(input)) {
            for (Field field : fields) {
                if (Modifier.toString(field.getModifiers()).equals(input)) {
                    System.out.printf("%s %s %s%n", Modifier.toString(field.getModifiers()), field.getType().getSimpleName(),
                            field.getName());
                } else if (input.equals("all")) {
                    System.out.printf("%s %s %s%n", Modifier.toString(field.getModifiers()), field.getType().getSimpleName(),
                            field.getName());
                }
            }

            input = bf.readLine();
        }
    }
}
