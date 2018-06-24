package mordor;

public class Food {
    private String name;

    public Food(String name) {
        this.setName(name);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toLowerCase();
    }
}

