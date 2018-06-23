package Animal;

public class Animal {
    private String name;
    private int age;
    private String gender;


    public Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public void setName(String name) {
        if (name.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender==null){
            throw new IllegalArgumentException("Invalid input!");
        } else if (!gender.equals("Male") && !gender.equals("Female")){
            throw new IllegalArgumentException("Invalid input!");

        }
        this.gender = gender;
    }

    public void produceSound(){
        System.out.println("Not implemented!");
    }

    @Override
    public String toString() {
        return String.format("");
    }
}
