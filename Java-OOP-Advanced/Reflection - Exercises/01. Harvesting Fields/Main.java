package pr01HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Field[] fields = RichSoilLand.class.getDeclaredFields();

        String input = bf.readLine();

        while (!"HARVEST".equals(input)) {
            for (int a =0; a< fields.length; a++) {
                if (Modifier.isPrivate(fields[a].getModifiers()) && "private".equals(input)) {
                    System.out.println("private " + fields[a].getType().getSimpleName() + " " + fields[a].getName());
                } else if (Modifier.isPublic(fields[a].getModifiers()) && "public".equals(input)) {
                    System.out.println("public " + fields[a].getType().getSimpleName() + " " + fields[a].getName());
                } else if (Modifier.isProtected(fields[a].getModifiers()) && "protected".equals(input)) {
                    System.out.println("protected " + fields[a].getType().getSimpleName() + " " + fields[a].getName());
                } else if ("all".equals(input)){
                    System.out.println(Modifier.toString(fields[a].getModifiers()) + " " + fields[a].getType().getSimpleName()
                            + " " + fields[a].getName());
                }
            }


            input = bf.readLine();
        }
    }
}
