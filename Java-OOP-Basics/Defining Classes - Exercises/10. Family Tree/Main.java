package familyTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        String input = buff.readLine();
        Person person = new Person();
        if (input.substring(0, 1).matches("\\d+")) {
            person.setBirthDate(input);
        } else {
            person.setName(input);
        }

        String command = buff.readLine();

        List<String> allPersons = new ArrayList<>();


        while (!"End".equals(command)) {
            allPersons.add(command);
            command = buff.readLine();
        }

        for (int a = 0; a < allPersons.size(); a++) {
            if (!allPersons.get(a).contains(" - ")) {
                String[] tokens = allPersons.get(a).split("\\s+");
                String name = tokens[0] + " " + tokens[1];
                String birthDate = tokens[2];
                if (person.getName() != null) {
                    if (person.getName().equals(name)) {
                        person.setBirthDate(birthDate);
                        allPersons.remove(allPersons.get(a));
                        break;
                    }
                } else if (person.getName() == null) {
                    if (person.getBirthDate().equals(birthDate)) {
                        person.setName(name);
                        allPersons.remove(allPersons.get(a));
                    }
                }
            }
        }

        for (int a = 0; a < allPersons.size(); a++) {
            if (allPersons.get(a).contains(" - ")) {
                String[] tokens = allPersons.get(a).split(" - ");
                String leftName = tokens[0];
                String rightName = tokens[1];
                if (rightName.equals(person.getName()) || rightName.equals(person.getBirthDate())) {
                    if (leftName.substring(0, 1).matches("\\d")) {
                        Parent parent = new Parent();
                        parent.setBirthDateParent(leftName);
                        allPersons.remove(allPersons.get(a));
                        for (int b = 0; b < allPersons.size(); b++) {
                            if (!allPersons.get(b).contains(" - ")) {
                                String[] tokensPers = allPersons.get(b).split("\\s+");
                                if (!tokensPers[0].substring(0, 1).matches("\\d")) {
                                    String name = tokensPers[0] + " " + tokensPers[1];
                                    String birthDay = tokensPers[2];
                                    if (birthDay.equals(parent.getBirthDateParent())) {
                                        parent.setName(name);
                                        allPersons.remove(allPersons.get(b));
                                        a = -1;
                                        person.addParent(parent);
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        Parent parent = new Parent();
                        parent.setName(leftName);
                        allPersons.remove(allPersons.get(a));
                        for (int b = 0; b < allPersons.size(); b++) {
                            if (!allPersons.get(b).contains(" - ")) {
                                String[] tokensPers = allPersons.get(b).split("\\s+");
                                String name = tokensPers[0] + " " + tokensPers[1];
                                String birthDay = tokensPers[2];
                                if (name.equals(parent.getName())) {
                                    parent.setBirthDateParent(birthDay);
                                    allPersons.remove(allPersons.get(b));
                                    a = -1;
                                    person.addParent(parent);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int a = 0; a < allPersons.size(); a++) {
            if (allPersons.get(a).contains(" - ")) {
                String[] tokens = allPersons.get(a).split(" - ");
                String leftName = tokens[0];
                String rightName = tokens[1];
                if (leftName.equals(person.getName()) || leftName.equals(person.getBirthDate())) {
                    if (rightName.substring(0, 1).matches("\\d")) {
                        Child child = new Child();
                        child.setBirthDateChild(rightName);
                        allPersons.remove(allPersons.get(a));
                        for (int b = 0; b < allPersons.size(); b++) {
                            if (!allPersons.get(b).contains(" - ")) {
                                String[] tokensChild = allPersons.get(b).split("\\s+");
                                if (!tokensChild[0].substring(0, 1).matches("\\d")) {
                                    String name = tokensChild[0] + " " + tokensChild[1];
                                    String birthDay = tokensChild[2];
                                    if (birthDay.equals(child.getBirthDateChild())) {
                                        child.setName(name);
                                        allPersons.remove(allPersons.get(b));
                                        a = -1;
                                        person.addChild(child);
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        Child child = new Child();
                        child.setName(rightName);
                        allPersons.remove(allPersons.get(a));
                        for (int b = 0; b < allPersons.size(); b++) {
                            if (!allPersons.get(b).contains(" - ")) {
                                String[] tokensPers = allPersons.get(b).split("\\s+");
                                String name = tokensPers[0] + " " + tokensPers[1];
                                String birthDay = tokensPers[2];
                                if (name.equals(child.getName())) {
                                    child.setBirthDateChild(birthDay);
                                    allPersons.remove(allPersons.get(b));
                                    a = -1;
                                    person.addChild(child);
                                    break;
                                }
                            }
                        }
                    }
                }

            }
        }
        System.out.println(person);
    }
}