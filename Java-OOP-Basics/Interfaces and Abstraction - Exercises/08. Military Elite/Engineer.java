package militaryElite;

import java.util.LinkedHashSet;
import java.util.Set;

public class Engineer extends SpecialisedSoldier implements EngineerImpl{
    private Set<Repairs> repairs;

    public Engineer(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new LinkedHashSet<>();
    }

    public void addRepairs(Repairs repair){
        this.repairs.add(repair);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f",super.getFirstName(),super.getLastName(),super.getId(),super.getSalary()))
                .append(System.lineSeparator()).append(String.format("Corps: %s",super.getCorps())).append(System.lineSeparator())
                .append("Repairs:").append(System.lineSeparator());
        if (!this.repairs.isEmpty()) {
            for (Repairs repair : repairs) {
               sb.append(String.format("Part Name: %s Hours Worked: %d", repair.getPartName(), repair.getHoursWorked())).append(System.lineSeparator());
            }
        }

        return sb.toString();
    }
}
