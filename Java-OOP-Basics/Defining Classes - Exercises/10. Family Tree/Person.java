package familyTree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String birthDate;
    private List<Parent> parents;
    private List<Child> children;

    public Person() {
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public List<Child> getChildren() {
        return children;
    }

    public List<Parent> getParents() {
        return parents;
    }



    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public void addChild(Child child){
        this.children.add(child);
    }
    public void addParent(Parent parent){
        this.parents.add(parent);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.name).append(" ").append(this.birthDate)
                .append(System.lineSeparator()).append("Parents:").append(System.lineSeparator());

        for (Parent parent : parents) {
            result.append(parent.getName()).append(" ").append(parent.getBirthDateParent()).append(System.lineSeparator());
        }

        result.append("Children:").append(System.lineSeparator());

        for (Child child : children) {
            result.append(child.getName()).append(" ").append(child.getBirthDateChild());
        }

        return result.toString();
    }
}