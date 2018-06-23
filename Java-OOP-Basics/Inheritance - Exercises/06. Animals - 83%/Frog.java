package Animal;

public class Frog extends Animal {


    public Frog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void produceSound(){
        System.out.println("Frogggg");
    }
    @Override
    public String toString() {
        return String.format("%s%n%s %d %s%n",this.getClass().getSimpleName(),super.getName(),super.getAge(),super.getGender());
    }
}
