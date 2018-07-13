package custom_list;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();

        MyList myList= new MyArrayList();
        while (!"END".equals(input)){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command){
                case "Add":
                    myList.add(tokens[1]);
                    break;
                case "Remove":
                    myList.remove(Integer.parseInt(tokens[1]));
                    break;
                case "Contains":
                    System.out.println(myList.contains(tokens[1]));
                    break;
                case "Swap":
                    myList.swap(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]));
                    break;
                case "Greater":
                    System.out.println(myList.countGreaterThan(tokens[1]));
                    break;
                case "Max":
                    System.out.println(myList.getMax());
                    break;
                case "Min":
                    System.out.println(myList.getMin());
                    break;
                case "Print":
                    System.out.print(myList);
                    break;

            }


            input = bf.readLine();
        }

    }
}
