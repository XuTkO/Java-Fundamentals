package birthdayCelebrations;

public class Pets implements Inhabitants {
    private String name;
    private String birthDate;

    public Pets(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public void getSth(String command) {
        if (this.birthDate.endsWith(command)){
            System.out.println(this.birthDate);
        }
    }
}
