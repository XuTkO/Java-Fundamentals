package shoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String namePerson;
    private double moneyPerson;
    private List<Product> products;

    public Person(String namePerson, double moneyPerson) {
        this.setNamePerson(namePerson);
        this.setMoneyPerson(moneyPerson);
        this.products = new ArrayList<>();
    }

    public String getNamePerson() {
        return namePerson;
    }

    private void setNamePerson(String namePerson) {
        if (namePerson == null || namePerson.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.namePerson = namePerson;
    }

    private double getMoneyPerson() {
        return moneyPerson;
    }

    public void setMoneyPerson(double moneyPerson) {
        if (moneyPerson < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.moneyPerson = moneyPerson;
    }


    private void setProducts(List<Product> products) {

        this.products = products;
    }

    public boolean hasEnoughtMoney(double money) {
        return this.moneyPerson >= money;
    }

    public void correctMoney(Product product) {
        this.moneyPerson -= product.getCost();
        this.products.add(product);
    }

    private void Product(Product product){
        this.products.add(product);
    }

    private List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {


        return String.format("%s - %s",this.namePerson,
                this.products.size() == 0 ? "Nothing bought" : this.products.stream().map(Product::getNameProduct).collect(Collectors.joining(", ")));
    }
}
