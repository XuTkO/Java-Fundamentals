package borderControl;

public class Citizen implements Inhabitant{
    private String name;
    private String age;
    private String id;




    public Citizen(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String id(String ID) {
        return this.id = ID;
    }

    @Override
    public void checkId(String check) {
        if (this.id.endsWith(check)){
            System.out.println(this.id);
        }
    }
}
