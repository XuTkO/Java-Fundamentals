package mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Human human = null;
        Worker worker = null;
        Student student = null;

        String[] studentInfo = bf.readLine().split("\\s+");
        String[] workerInfo  = bf.readLine().split("\\s+");
        try {
            human = new Human(studentInfo[0],studentInfo[1]);
            student = new Student(studentInfo[0],studentInfo[1],studentInfo[2]);
            worker = new Worker(workerInfo[0],workerInfo[1],Double.parseDouble(workerInfo[2]),Double.parseDouble(workerInfo[3]));
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        if (human!=null && student!=null && worker!=null){
            System.out.println(student);
            System.out.println(worker);
        }

    }
}
