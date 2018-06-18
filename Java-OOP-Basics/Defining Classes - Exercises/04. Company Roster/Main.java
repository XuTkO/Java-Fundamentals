import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int nLines = Integer.parseInt(bf.readLine());

        List<Employee> employees = new ArrayList<>();

        while (nLines-- > 0) {
            String[] tokens = bf.readLine().split("\\s+");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String department = tokens[3];

            Employee employee = null;

            switch (tokens.length) {
                case 4:
                    employee = new Employee(name, salary, position, department);
                    break;
                case 5:
                    if (tokens[4].matches("\\d+")){
                        int age = Integer.parseInt(tokens[4]);
                        employee = new Employee(name,salary,position,department,age);
                    } else {
                        String email = tokens[4];
                        employee = new Employee(name,salary,position,department,email);
                    }
                    break;
                case 6:
                    String email = tokens[4];
                    int age = Integer.parseInt(tokens[5]);
                    employee = new Employee(name, salary, position, department, email, age);
                    break;

            }
            employees.add(employee);
        }
            employees.stream().collect(Collectors.groupingBy(Employee::getDepartment))
                    .entrySet().stream()
                    .sorted((e1,e2)-> Double.compare(e2.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble(),
                            e1.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble()))
                    .limit(1)
                    .forEach(d-> {
                        StringBuilder result = new StringBuilder();
                        result.append(String.format("Highest Average Salary: %s",d.getKey())).append(System.lineSeparator());
                        d.getValue().stream().sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))
                                .forEach( employee -> result.append(employee).append(System.lineSeparator()));
                        System.out.print(result.toString());
                    });
    }
}
