package person;

public class Citizen implements Person,Identifiable,Birthable{
    private String name;
    private int age;
    private String id;
    private String birthDate;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public int age() {
        return this.age;
    }

    @Override
    public String Birthdate() {
        return this.birthDate;
    }

    @Override
    public String Id() {
        return this.id;
    }
}
