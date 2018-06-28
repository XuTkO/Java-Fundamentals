package foodShortage;

public class Rebel implements Buyer{
    private int age;
    private String group;
    private int food;

    public Rebel(int age, String group) {
        this.age = age;
        this.group = group;
    }

    @Override
    public void buyFood() {
        this.food+=5;
    }

    @Override
    public int getFood() {
        return this.food;
    }


}
