package rawData;

public class Car {

    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire tire;

    public Car(String model, Engine engine, Cargo cargo, Tire tire) {
        this.setModel(model);
        this.setEngine(engine);
        this.setCargo(cargo);
        this.setTire(tire);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    @Override
    public String toString() {
        return String.format("%s",this.model);
    }
}
