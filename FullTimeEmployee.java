public class FullTimeEmployee extends Employee {
    private String position = "Full Time Employee";
    private int baseSalary = 220;
    private double salary;

    FullTimeEmployee() {
        setPosition(position);
    }

    void income() {
        this.salary = this.baseSalary;
    }

    @Override
    public String toString() {
        return super.toString()
                // + "Position: " + getPosition() + "\n"
                + "Base Salary: " + this.baseSalary + "Eur \n"
                + "Salary: " + this.salary + "Eur";
    }
}
