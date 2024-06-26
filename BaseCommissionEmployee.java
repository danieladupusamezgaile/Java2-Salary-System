public class BaseCommissionEmployee extends CommissionEmployee {
    private String position = "Base Employee with Commission";
    private double baseSalary = 200;
    private int bonus = 10;
    private double salary;

    BaseCommissionEmployee() {
        setPosition(position);
    }

    @Override
    void income() {
        super.income();
        this.salary = getSalary() + this.baseSalary + this.baseSalary * this.bonus / 100;
    }

    @Override
    public String toString() {
        return "Name: " + this.getFirstName() + " " + this.getLastName() + "\n"
                + "Personal Number: " + this.getPersonalNumber() + "\n"
                + "Position: " + this.position + "\n"
                + "Base Salary: " + this.baseSalary + "Eur\n"
                + "Number of Sales: " + getNumOfSales() + "\n"
                + "Commission per Sale: " + getCommission() + "Eur\n"
                + "Bonus: " + this.bonus + "%\n"
                + "Salary: " + this.salary + "Eur";
    }
}
