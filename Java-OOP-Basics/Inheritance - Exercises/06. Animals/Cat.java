package Animal;

public class Cat extends Animal {


    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void produceSound(){
        System.out.println("MiauMiau");
    }
    @Override
    public String toString() {
        return String.format("%s%n%s %d %s%n",this.getClass().getSimpleName(),super.getName(),super.getAge(),super.getGender());
    }
}
