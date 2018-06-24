package Animal;

public class Tomcat extends Animal {


    public Tomcat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void produceSound(){
        System.out.println("Give me one million b***h");
    }



    @Override
    public String toString() {
        return String.format("%s%n%s %d %s%n",this.getClass().getSimpleName(),super.getName(),super.getAge(),super.getGender());
    }
}