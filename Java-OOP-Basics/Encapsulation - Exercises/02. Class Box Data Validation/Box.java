package classBox;

public class Box {

    private double length;
    private double width ;
    private double height;

    public Box(double length, double width, double height) {
        if (length < 0 ){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
        if (width < 0 ){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
        if (height < 0 ){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }



    public double surfaceArea(){
        return 2*this.length*this.width + 2*this.length*this.height + 2*this.width*this.height;
    }

    public double sateralSurfaceArea (){
        return 2*this.length*this.height + 2*this.width*this.height;
    }
    public double volume (){
        return this.length*this.width*this.height;
    }

    @Override
    public String toString() {
        return String.format("Surface Area - %.2f%nLateral Surface Area - %.2f%nVolume - %.2f",surfaceArea(),sateralSurfaceArea(),volume());
    }
}
