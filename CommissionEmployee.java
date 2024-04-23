public class CommissionEmployee extends Employee {
    private String position = "Commission Employee";
    private int numOfSales;
    private int commission = 120;
    private double salary;

    CommissionEmployee() {
        setPosition(position);
    }

    public void setNumOfSales(int numOfSales) {
        this.numOfSales = numOfSales;
    }

    public int getNumOfSales() {
        return this.numOfSales;
    }

    public int getCommission() {
        return this.commission;
    }

    public double getSalary() {
        return this.salary;
    }

    void income() {
        this.salary = this.commission * this.numOfSales;
    }

    @Override
    public String toString() {
        return super.toString()
                // + "Position: " + this.position + "\n"
                + "Number of Sales: " + this.numOfSales + "\n"
                + "Commission per Sale: " + this.commission + "Eur\n"
                + "Salary: " + this.salary + "Eur";
    }
}
