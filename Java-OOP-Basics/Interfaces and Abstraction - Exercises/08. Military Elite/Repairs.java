package militaryElite;

public class Repairs {
    private String partName;
    private int hoursWorked;

    public Repairs(String partName, int hoursWorked) {
        this.partName = partName;
        this.hoursWorked = hoursWorked;
    }

    public String getPartName() {
        return partName;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}
