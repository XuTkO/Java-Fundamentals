package mankind;

public class Student extends Human {

    private String facNumber;

    public Student(String firstName, String lastName,String facNumber) {
        super(firstName, lastName);
        this.setFacNumber(facNumber);
    }

    public void setFacNumber(String facNumber) {
        if (facNumber.length() < 5 || facNumber.length() > 10){
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this.facNumber = facNumber;
    }
    @Override
    public String toString() {
        return String.format("First Name: %s%nLast Name: %s%nFaculty number: %s",super.getFirstName(),super.getLastName(),this.facNumber);
    }
}
