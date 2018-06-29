package militaryElite;

public class Soldier implements SoldierImpl {
    private int id;
    private String firstName;
    private String lastName;

    public Soldier(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected int getId() {
        return id;
    }

    protected String getFirstName() {
        return firstName;
    }

    protected String getLastName() {
        return lastName;
    }
}
