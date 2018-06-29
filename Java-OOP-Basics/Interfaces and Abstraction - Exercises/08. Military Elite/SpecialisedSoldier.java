package militaryElite;

public class SpecialisedSoldier extends Private implements SpecialisedSoldierImpl{
    private String corps;

    public SpecialisedSoldier(int id, String firstName, String lastName, double salary,String corps) {
        super(id, firstName, lastName, salary);
        this.corps = corps;
    }

    public String getCorps() {
        return corps;
    }
}
