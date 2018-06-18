package shoppingSpree;

public class Product {
    private String nameProduct;
    private double cost;

    public Product(String nameProduct, double cost) {
        this.setNameProduct(nameProduct);
        this.setCost(cost);
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        if (nameProduct == null || nameProduct.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.nameProduct = nameProduct;
    }

    public double getCost() {

        return cost;
    }

    private void setCost(double cost) {
        if (cost < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.cost = cost;
    }
}
