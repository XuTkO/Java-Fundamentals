package militaryElite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();

        List<Private> privateList = new ArrayList<>();
        LeutenantGeneral leutenantGeneral = null;
        Engineer engineer = null;
        Commando commando = null;
        Spy spy = null;

        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");

            switch (tokens[0]) {
                case "Private":
                    Private priv = new Private(Integer.parseInt(tokens[1]), tokens[2], tokens[3], Double.parseDouble(tokens[4]));
                    System.out.println(priv);
                    privateList.add(priv);
                    break;
                case "LeutenantGeneral":
                    leutenantGeneral = new LeutenantGeneral(Integer.parseInt(tokens[1]), tokens[2], tokens[3], Double.parseDouble(tokens[4]));
                    System.out.println(leutenantGeneral);
                    List<Private> privates = new ArrayList<>();
                    for (int a=5; a < tokens.length; a++){
                        int id = Integer.parseInt(tokens[a]);
                        for (Private aPrivate : privateList) {
                            if (aPrivate.getId() == id){
                                privates.add(aPrivate);
                            }
                        }
                    }

                    if (!privates.isEmpty()) {
                        privates.stream().sorted((x1, x2) -> Integer.compare(x2.getId(), x1.getId())).forEach(System.out::println);
                    }
                    break;
                case "Engineer":
                    if (tokens[5].equals("Airforces") || tokens[5].equals("Marines")) {
                        engineer = new Engineer(Integer.parseInt(tokens[1]), tokens[2], tokens[3], Double.parseDouble(tokens[4]), tokens[5]);
                        for (int a = 6; a < tokens.length; a += 2) {
                            String partName = tokens[a];
                            int hours = Integer.parseInt(tokens[a + 1]);
                            Repairs repairs = new Repairs(partName, hours);
                            engineer.addRepairs(repairs);
                        }

                    System.out.print(engineer);
                    }
                    break;
                case "Commando":
                    if (tokens[5].equals("Airforces") || tokens[5].equals("Marines")) {
                        commando = new Commando(Integer.parseInt(tokens[1]), tokens[2], tokens[3], Double.parseDouble(tokens[4]), tokens[5]);
                        for (int a = 6; a < tokens.length; a += 2) {
                            String missionName = tokens[a];
                            String missionState = tokens[a + 1];
                            Missions missions = new Missions(missionName, missionState);
                            if (missions.getState().equals("inProgress") || missions.getState().equals("Finished")){
                                commando.addMission(missions);
                            }
                        }

                    System.out.print(commando);
                    }
                    break;
                case "Spy":
                    spy = new Spy(Integer.parseInt(tokens[1]), tokens[2], tokens[3], tokens[4]);
                    System.out.println(spy);
                    break;

            }

            input = bf.readLine();
        }


    }
}
