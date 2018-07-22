package pr01HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();

        while (!"HARVEST".equals(input)) {

            Field[] fields = getModifier(input);
            for (Field field : fields) {
                System.out.printf("%s %s %s%n",Modifier.toString(field.getModifiers())
                        ,field.getType().getSimpleName()
                        ,field.getName());
            }


            input = bf.readLine();
        }
    }

    private static Field[] getModifier(String input) {
        Field[] fields = RichSoilLand.class.getDeclaredFields();
        switch (input) {
            case "private":
                return Arrays.stream(fields).filter(f -> Modifier.isPrivate(f.getModifiers())).toArray(Field[]::new);
            case "protected":
                return Arrays.stream(fields).filter(f -> Modifier.isProtected(f.getModifiers())).toArray(Field[]::new);
            case "public":
                return Arrays.stream(fields).filter(f -> Modifier.isPublic(f.getModifiers())).toArray(Field[]::new);
            case "all":
                return fields;
        }
        return fields;
    }
}
