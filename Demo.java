import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    Scanner sc;
    List<Employee> employees = new ArrayList<>();

    void menu() {
        int option1;
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
        System.out.println("Choose option");
        System.out.print("--> ");

        // VALIDATE INPUT
        while (!sc.hasNextInt()) { // while input is not of type int
            System.out.println("Not a valid option!");
            System.out.println("Choose option"); // continue to ask for input
            System.out.print("--> ");
            sc.next();
        }
        option1 = sc.nextInt(); // when int provided save to variable

        while (option1 <= 0 || option1 > 5) { // while input is not from menu
            System.out.println("Not a valid option!");
            System.out.println("Choose option"); // continue to ask for input
            System.out.print("--> ");

            while (!sc.hasNextInt()) { // while input is not of type int
                System.out.println("Not a valid option!");
                System.out.println("Choose option"); // continue to ask for input
                System.out.print("--> ");
                sc.next();
            }

            option1 = sc.nextInt();
        }

        switch (option1) {
            case 1:
                this.employeeType();
                break;
            case 2:
                this.printEmployeeData();
                break;
            case 3:
                this.printByPosition();
                break;
            case 4:
                this.printByContract();
                break;
            case 5:
                System.out.println("Thank you, bye");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
        }
    }

    void employeeType() {
        int option2;
        System.out.println("-------------------------------------");
        System.out.println("|   1. Full Time Employee           |");
        System.out.println("|   2. Part Time Employee           |");
        System.out.println("|   3. Commissiom Employee          |");
        System.out.println("|   4. Base Commission Employee     |");
        System.out.println("-------------------------------------");
        System.out.println("Choose Employee Type");
        System.out.print("--> ");

        // VALIDATE INPUT
        while (!sc.hasNextInt()) { // while input is not of type int
            System.out.println("Not a valid option!");
            System.out.println("Choose option"); // continue to ask for input
            System.out.print("--> ");
            sc.next();
        }
        option2 = sc.nextInt(); // when int provided save to variable

        while (option2 <= 0 || option2 > 4) { // while input is not from menu
            System.out.println("Not a valid option!");
            System.out.println("Choose option"); // continue to ask for input
            System.out.print("--> ");

            while (!sc.hasNextInt()) { // while input is not of type int
                System.out.println("Not a valid option!");
                System.out.println("Choose option"); // continue to ask for input
                System.out.print("--> ");
                sc.next();
            }

            option2 = sc.nextInt();
        }

        if (option2 == 1) {
            registerFullTimeEmployee();
        }
        if (option2 == 2) {
            this.registerPartTimeEmployee();
        }
        if (option2 == 3) {
            this.registerCommissionEmployee();
        }
        if (option2 == 4) {
            this.registerBaseCommissionEmployee();
        }
    }

    void registerFullTimeEmployee() {
        // 1.1. Register Full Time Employee
        System.out.println("First name");
        String firstName = sc.next();
        System.out.println("Last name");
        String lastName = sc.next();
        System.out.println("Personal Number (xxxxxx-xxxxx)");
        String personalNumber = sc.next();
        System.out.println("Type of Contract (1 for Annual / 2 for Seasonal)");
        int contractChoice = sc.nextInt();
        String contractType;

        // Validate input and set contract type accordingly
        while (contractChoice != 1 && contractChoice != 2) {
            System.out.println("Please choose 1 for Annual or 2 for Seasonal: ");
            contractChoice = sc.nextInt();
        }
        contractType = (contractChoice == 1) ? "annual" : "seasonal";

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
        System.out.println("Personal Number (xxxxxx-xxxxx)");
        String personalNumber = sc.next();
        System.out.println("Type of Contract (1 for Annual / 2 for Seasonal)");
        int contractChoice = sc.nextInt();
        String contractType;

        // Validate input and set contract type accordingly
        while (contractChoice != 1 && contractChoice != 2) {
            System.out.println("Please choose 1 for Annual or 2 for Seasonal: ");
            contractChoice = sc.nextInt();
        }
        contractType = (contractChoice == 1) ? "annual" : "seasonal";

        System.out.println("Hours of Work");
        // VALIDATE INPUT
        while (!sc.hasNextInt()) { // while input is not of type int
            System.out.println("Not a valid input!");
            System.out.println("Hours of Work"); // continue to ask for input
            System.out.print("--> ");
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
        System.out.println("Personal Number (xxxxxx-xxxxx)");
        String personalNumber = sc.next();
        System.out.println("Type of Contract (1 for Annual / 2 for Seasonal)");
        int contractChoice = sc.nextInt();
        String contractType;

        // Validate input and set contract type accordingly
        while (contractChoice != 1 && contractChoice != 2) {
            System.out.println("Please choose 1 for Annual or 2 for Seasonal: ");
            contractChoice = sc.nextInt();
        }
        contractType = (contractChoice == 1) ? "annual" : "seasonal";

        System.out.println("Number of Sales");
        // VALIDATE INPUT
        while (!sc.hasNextInt()) { // while input is not of type int
            System.out.println("Not a valid input!");
            System.out.println("Number of Sales"); // continue to ask for input
            System.out.print("--> ");
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
        System.out.println("Personal Number (xxxxxx-xxxxx)");
        String personalNumber = sc.next();
        System.out.println("Type of Contract (1 for Annual / 2 for Seasonal)");
        int contractChoice = sc.nextInt();
        String contractType;

        // Validate input and set contract type accordingly
        while (contractChoice != 1 && contractChoice != 2) {
            System.out.println("Please choose 1 for Annual or 2 for Seasonal: ");
            contractChoice = sc.nextInt();
        }
        contractType = (contractChoice == 1) ? "annual" : "seasonal";

        System.out.println("Number of Sales");
        // VALIDATE INPUT
        while (!sc.hasNextInt()) { // while input is not of type int
            System.out.println("Not a valid input!");
            System.out.println("Number of Sales"); // continue to ask for input
            System.out.print("--> ");
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
        System.out.println("---------------------------------------------");
        System.out.println("|           Employee Information            |");
        System.out.println("---------------------------------------------");
        for (Employee employee : employees) {
            employee.income();
            System.out.println(employee.toString());
            System.out.println("---------------------------------------------");
        }
        System.out.println("Press Enter to continue..");
        sc.nextLine(); // Consume the newline character left by nextInt()
        sc.nextLine(); // Wait for any key press
        this.menu(); // Return to the menu
    }

    void printByPosition() {
        System.out.println("----------------------------------------");
        System.out.println("|           Employee Position          |");
        System.out.println("----------------------------------------");
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + " - "
                    + employee.getPosition());
            System.out.println("----------------------------------------");
        }
        System.out.println("Press Enter to continue..");
        sc.nextLine(); // Consume the newline character left by nextInt()
        sc.nextLine(); // Wait for any key press
        this.menu(); // Return to the menu
    }

    void printByContract() {
        System.out.println("----------------------------------------");
        System.out.println("|           Employee Contract          |");
        System.out.println("----------------------------------------");
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName() + " " +
                    employee.getLastName() + " - "
                    + employee.getContractType());
            System.out.println("----------------------------------------");
        }
        System.out.println("Press Enter to continue..");
        sc.nextLine(); // Consume the newline character left by nextInt()
        sc.nextLine(); // Wait for any key press
        this.menu(); // Return to the menu
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.menu();
    }
}