import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    Scanner sc;
    int option1;
    int option2;
    List<Employee> employees = new ArrayList<>();

    void menu() {
        this.sc = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("|       Choose from the menu        |");
        System.out.println("-------------------------------------");
        System.out.println("|   1. Register Employee            |");
        System.out.println("|   2. Print Employee data          |");
        System.out.println("|   3. Print by Position            |");
        System.out.println("|   4. Print by Contract            |");
        System.out.println("|   5. Exit                         |");
        System.out.println("-------------------------------------");
        System.out.println("Coose option");
        System.out.print("-->");

        // VALIDATE INPUT
        while (!sc.hasNextInt()) { // while input is not of type int
            System.out.println("Not a valid option!");
            System.out.println("Coose option"); // continue to ask for input
            System.out.print("-->");
            sc.next();
        }
        this.option1 = sc.nextInt(); // when int provided save to variable

        while (this.option1 <= 0 || this.option1 > 5) { // while input is not from menu
            System.out.println("Not a valid option!");
            System.out.println("Coose option"); // continue to ask for input
            System.out.print("-->");

            while (!sc.hasNextInt()) { // while input is not of type int
                System.out.println("Not a valid option!");
                System.out.println("Coose option"); // continue to ask for input
                System.out.print("-->");
                sc.next();
            }

            this.option1 = sc.nextInt();
        }

        if (this.option1 == 1) {
            this.employeeType();
        }
        if (this.option1 == 2) {
            this.printEmployeeData();
        }
        if (this.option1 == 3) {
            this.printByPosition();
        }
        if (this.option1 == 4) {
            this.printByContract();
        }
        if (this.option1 == 5) {
            System.out.println("Thank you, bye");
            return;
        }
    }

    void employeeType() {
        System.out.println("-------------------------------------");
        System.out.println("|   1. Full Time Employee           |");
        System.out.println("|   2. Part Time Employee           |");
        System.out.println("|   3. Commissiom Employee          |");
        System.out.println("|   4. Base Commission Employee     |");
        System.out.println("-------------------------------------");
        System.out.println("Coose Employee Type");
        System.out.print("-->");

        // VALIDATE INPUT
        while (!sc.hasNextInt()) { // while input is not of type int
            System.out.println("Not a valid option!");
            System.out.println("Coose option"); // continue to ask for input
            System.out.print("-->");
            sc.next();
        }
        this.option2 = sc.nextInt(); // when int provided save to variable

        while (this.option2 <= 0 || this.option2 > 4) { // while input is not from menu
            System.out.println("Not a valid option!");
            System.out.println("Coose option"); // continue to ask for input
            System.out.print("-->");

            while (!sc.hasNextInt()) { // while input is not of type int
                System.out.println("Not a valid option!");
                System.out.println("Coose option"); // continue to ask for input
                System.out.print("-->");
                sc.next();
            }

            this.option2 = sc.nextInt();
        }

        if (this.option2 == 1) {
            this.registerFullTimeEmployee();
        }
        if (this.option2 == 2) {
            this.registerPartTimeEmployee();
        }
        if (this.option2 == 3) {
            this.registerCommissionEmployee();
        }
        if (this.option2 == 4) {
            this.registerBaseCommissionEmployee();
        }
    }

    void registerFullTimeEmployee() {
        // 1.1. Register Full Time Employee
        System.out.println("First name");
        String firstName = sc.next();
        System.out.println("Last name");
        String lastName = sc.next();
        System.out.println("Personal Number");
        String personalNumber = sc.next();
        System.out.println("Type of Contract");
        String contractType = sc.next();

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        fullTimeEmployee.setFirstName(firstName);
        fullTimeEmployee.setLastName(lastName);
        fullTimeEmployee.setPersonalNumber(personalNumber);
        fullTimeEmployee.setContractType(contractType);
        this.employees.add(fullTimeEmployee);
        this.menu();
    }

    void registerPartTimeEmployee() {
        System.out.println("First name");
        String firstName = sc.next();
        System.out.println("Last name");
        String lastName = sc.next();
        System.out.println("Personal Number");
        String personalNumber = sc.next();
        System.out.println("Type of Contract");
        String contractType = sc.next();
        System.out.println("Hours of Work");
        // VALIDATE INPUT
        while (!sc.hasNextInt()) { // while input is not of type int
            System.out.println("Not a valid input!");
            System.out.println("Hours of Work"); // continue to ask for input
            System.out.print("-->");
            sc.next();
        }
        int hours = sc.nextInt();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        partTimeEmployee.setFirstName(firstName);
        partTimeEmployee.setLastName(lastName);
        partTimeEmployee.setPersonalNumber(personalNumber);
        partTimeEmployee.setContractType(contractType);
        partTimeEmployee.setHours(hours);
        this.employees.add(partTimeEmployee);
        this.menu();
    }

    void registerCommissionEmployee() {
        System.out.println("First name");
        String firstName = sc.next();
        System.out.println("Last name");
        String lastName = sc.next();
        System.out.println("Personal Number");
        String personalNumber = sc.next();
        System.out.println("Type of Contract");
        String contractType = sc.next();
        System.out.println("Number of Sales");
        // VALIDATE INPUT
        while (!sc.hasNextInt()) { // while input is not of type int
            System.out.println("Not a valid input!");
            System.out.println("Number of Sales"); // continue to ask for input
            System.out.print("-->");
            sc.next();
        }
        int numOfSales = sc.nextInt();

        CommissionEmployee commissionEmployee = new CommissionEmployee();
        commissionEmployee.setFirstName(firstName);
        commissionEmployee.setLastName(lastName);
        commissionEmployee.setPersonalNumber(personalNumber);
        commissionEmployee.setContractType(contractType);
        commissionEmployee.setNumOfSales(numOfSales);
        this.employees.add(commissionEmployee);
        this.menu();
    }

    void registerBaseCommissionEmployee() {
        System.out.println("First name");
        String firstName = sc.next();
        System.out.println("Last name");
        String lastName = sc.next();
        System.out.println("Personal Number");
        String personalNumber = sc.next();
        System.out.println("Type of Contract");
        String contractType = sc.next();
        System.out.println("Number of Sales");
        // VALIDATE INPUT
        while (!sc.hasNextInt()) { // while input is not of type int
            System.out.println("Not a valid input!");
            System.out.println("Number of Sales"); // continue to ask for input
            System.out.print("-->");
            sc.next();
        }
        int numOfSales = sc.nextInt();

        BaseCommissionEmployee baseCommissionEmployee = new BaseCommissionEmployee();
        baseCommissionEmployee.setFirstName(firstName);
        baseCommissionEmployee.setLastName(lastName);
        baseCommissionEmployee.setPersonalNumber(personalNumber);
        baseCommissionEmployee.setContractType(contractType);
        baseCommissionEmployee.setNumOfSales(numOfSales);
        this.employees.add(baseCommissionEmployee);
        this.menu();
    }

    void printEmployeeData() {
        System.out.println("-------------------------------------");
        System.out.println("|       Employee Information        |");
        System.out.println("-------------------------------------");
        for (Employee employee : employees) {
            employee.income();
            System.out.println(employee.toString());
            System.out.println("--------------------------------------");
        }
        System.out.println("Press 1 to continue..");
        System.out.print("-->");
        
        if (sc.hasNext()) {
            this.menu();
        }
    }

    void printByPosition() {
        System.out.println("---------------------------------");
        System.out.println("|       Employee Position       |");
        System.out.println("---------------------------------");
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " - "
                    + employee.getPosition());
            System.out.println("---------------------------------");
        }
        System.out.println("Press 1 to continue..");
        if (sc.hasNext()) {
            this.menu();
        }
    }

    void printByContract() {
        System.out.println("---------------------------------");
        System.out.println("|       Employee Contract       |");
        System.out.println("---------------------------------");
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " +
                    employee.getLastName() + " - "
                    + employee.getContractType());
            System.out.println("---------------------------------");
        }
        System.out.println("Press 1 to continue..");
        if (sc.hasNext()) {
            this.menu();
        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.menu();
    }
}