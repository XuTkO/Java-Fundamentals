package militaryElite;

import java.util.LinkedHashSet;
import java.util.Set;

public class Commando extends SpecialisedSoldier {
    private Set<Missions> missions;

    public Commando(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new LinkedHashSet<>();
    }

    public void addMission(Missions missions){
        this.missions.add(missions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f",super.getFirstName(),super.getLastName(),super.getId(),super.getSalary()))
                .append(System.lineSeparator()).append(String.format("Corps: %s",super.getCorps())).append(System.lineSeparator())
                .append("Missions:").append(System.lineSeparator());
        if (!this.missions.isEmpty()) {
            for (Missions mission : missions) {
                sb.append(String.format("Code Name: %s State: %s", mission.getCodeName(), mission.getState())).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}
