package Animal;

public class Dog extends Animal {


    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void produceSound(){
        System.out.println("BauBau");
    }

    @Override
    public String toString() {
        return String.format("%s%n%s %d %s%n",this.getClass().getSimpleName(),super.getName(),super.getAge(),super.getGender());
    }
}
