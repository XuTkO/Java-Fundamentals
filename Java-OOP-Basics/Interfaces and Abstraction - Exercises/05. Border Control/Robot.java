package borderControl;

public class Robot implements Inhabitant {
        private String model;
         private String id;



    public Robot(String model) {
        this.model = model;
    }

    @Override
    public String id(String ID) {
        return this.id = ID;
    }

    @Override
    public void checkId(String check) {
        if (this.id.endsWith(check)){
            System.out.println(this.id);
        }
    }
}
