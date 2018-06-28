package ferrari;

public class Ferrari implements Car{
    private String driverName;
    private String model = "488-Spider";

    public Ferrari(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String useBrakes() {
    return  "Brakes!";
    }

    @Override
    public String pushPedal() {
       return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",this.model,useBrakes(),pushPedal(),this.driverName);
    }
}
