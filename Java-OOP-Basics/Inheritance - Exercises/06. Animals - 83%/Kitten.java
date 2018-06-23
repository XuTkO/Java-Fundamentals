package Animal;

public class Kitten extends Animal {


    public Kitten(String name, int age, String gender) {
        super(name, age, gender);
    }


    @Override
    public void produceSound(){
        System.out.println("Miau");
    }
    @Override
    public String toString() {
        return String.format("%s%n%s %d %s%n",this.getClass().getSimpleName(),super.getName(),super.getAge(),super.getGender());
    }
}
