package google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private List<Pokemon> pokemons;
    private List<Parents> parents;
    private  List<Children> children;
    private  Car car;

    public Person(String name) {
        this.setName(name);
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setPokemons (List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
    public boolean addPokemon (Pokemon pokemon){
        this.pokemons.add(pokemon);
        return true;
    }




    public void setName(String name) {
        this.name = name;
    }

    public void setParents(List<Parents> parents) {
        this.parents = parents;
    }

    public boolean addParent(Parents parents){
        this.parents.add(parents);
        return true;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }

    public boolean addChildren(Children children){
        this.children.add(children);
        return true;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public List<Parents> getParents() {
        return parents;
    }

    public List<Children> getChildren() {
        return children;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {

        this.car = car;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.name).append(System.lineSeparator()).append("Company:").append(System.lineSeparator());

        if (getCompany()!=null){
            result.append(this.company.getCompanyName()).append(" ").append(this.company.getDepartment()).append(" ")
                    .append(String.format("%.2f",this.company.getSalary())).append(" ").append(System.lineSeparator());
        }

        result.append("Car:").append(System.lineSeparator());
        if (getCar()!=null){
            result.append(this.car.getCarModel()).append(" ").append(this.car.getCarSpeed()).append(System.lineSeparator());
        }
        result.append("Pokemon:").append(System.lineSeparator());
        if (this.pokemons.size() > 0){
            this.pokemons.forEach(pokemon -> result.append(pokemon.getPokemonName()).append(" ").append(pokemon.getPokemonType()).append(" ").append(System.lineSeparator()));

        }
        result.append("Parents:").append(System.lineSeparator());
        if (this.parents.size() > 0) {
            this.parents.forEach(parents1 -> result.append(parents1.getParentName()).append(" ").append(parents1.getParentBirthday()).append(" ").append(System.lineSeparator()));
        }
        result.append("Children:").append(System.lineSeparator());
        if (this.children.size() > 0){
            this.children.forEach(children1 -> result.append(children1.getChildName()).append(" ").append(children1.getChildBirthday()).append(" ").append(System.lineSeparator()));
        }

        return result.toString();
    }
}
