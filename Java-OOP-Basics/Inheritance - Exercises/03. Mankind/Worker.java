package mankind;

import java.util.IllformedLocaleException;

public class Worker extends Human{

    private double weekSalary;
    private double hoursPerDay;
//    private double moneyPerHour;

    public Worker(String firstName, String lastName, double weekSalary, double hoursPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setHoursPerDay(hoursPerDay);
    }

    public void setHoursPerDay(double hoursPerDay) {
        if (hoursPerDay < 1 || hoursPerDay > 12){
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.hoursPerDay = hoursPerDay;
    }

    public void setWeekSalary(double weekSalary) {
        if (weekSalary < 10){
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.weekSalary = weekSalary;
    }

    @Override
    public String getLastName() {
        if (super.getLastName().length() < 3){
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
        return super.getLastName();
    }

    @Override
    public String toString() {
        return String.format("First Name: %s%nLast Name: %s%nWeek Salary: %.2f%nHours per day: %.2f%nSalary per hour: %.2f",
                this.getFirstName(),this.getLastName(),this.weekSalary,this.hoursPerDay,(this.weekSalary / (this.hoursPerDay*7)));
    }
}
