package militaryElite;

public class Spy extends Soldier implements SpyImpl {
    private String codeNumber;

    public Spy(int id, String firstName, String lastName,String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %s%nCode Number: %s",super.getFirstName(),super.getLastName(),super.getId(),this.codeNumber);
    }
}
