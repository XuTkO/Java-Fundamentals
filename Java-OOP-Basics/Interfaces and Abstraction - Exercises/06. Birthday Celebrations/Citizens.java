package birthdayCelebrations;

public class Citizens implements Inhabitants {
    private String name;
    private int age;
    private String id;
    private String birthDate;

    public Citizens(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    @Override
    public void getSth(String command) {
        if (this.birthDate.endsWith(command)){
            System.out.println(this.birthDate);
        }
    }
}
