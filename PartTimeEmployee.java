public class PartTimeEmployee extends Employee {
    private String position = "Part Time Employee";
    private double hourRate = 8.50;
    private int hours;
    private double salary;

    PartTimeEmployee() {
        setPosition(position);
    }

    void setHours(int hours) {
        this.hours = hours;
    }

    void income() {
        this.salary = this.hourRate * this.hours;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Hour Rate: " + this.hourRate + "Eur/h\n"
                + "Number of hours of work: " + this.hours + "\n"
                + "Salary: " + this.salary + "Eur";
    }
}
