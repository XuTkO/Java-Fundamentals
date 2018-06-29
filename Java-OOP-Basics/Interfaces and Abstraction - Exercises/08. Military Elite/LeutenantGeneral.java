package militaryElite;

import java.util.ArrayList;
import java.util.List;

public class LeutenantGeneral extends Private implements LeutenantGeneralImpl{
    private List<Private> privateList;

    public LeutenantGeneral(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privateList = new ArrayList<>();
    }

    public void addPrivate(Private priv){
        this.privateList.add(priv);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(super.getFirstName()).append(" ").append(super.getLastName()).append(" Id: ").append(super.getId())
                .append(" Salary: ").append(String.format("%.2f",super.getSalary())).append(System.lineSeparator()).append("Privates:");

        return sb.toString();
    }
}
