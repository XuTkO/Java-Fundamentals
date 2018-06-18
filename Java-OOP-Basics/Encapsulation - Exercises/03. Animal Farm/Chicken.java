package animalFarm;

public class Chicken {

    private String name;
    private int age;
    private String eggsPerDay;

    public Chicken(String name, int age) {
        this.setName(name);
        if (age > 15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.setAge(age);
    }

    public void setName(String name) {
        if (name==null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private  String eggsProduced(){
        if (this.age < 6){
            this.eggsPerDay = "2";
        } else if (this.age < 12 ){
            this.eggsPerDay = "1";
        } else if (this.age < 15){
            this.eggsPerDay = "0.75";
        }
        return this.eggsPerDay;
    }


    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %s eggs per day.",this.name,this.age,this.eggsProduced());
    }
}
