package foodShortage;

public class Citizen implements Buyer{
    private int age;
    private String id;
    private String birthDate;
    private int food = Buyer.food;


    @Override
    public void buyFood() {
        this.food+=10;
    }

    @Override
    public int getFood() {
        return this.food;
    }


    public Citizen(int age, String id, String birthDate) {
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }
}
