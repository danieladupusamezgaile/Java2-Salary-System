abstract public class Employee {
    private String firstName;
    private String lastName;
    private String personalNumber;
    private String contractType;
    private String position;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPersonalNumber() {
        return this.personalNumber;
    }

    public String getContractType() {
        return this.contractType;
    }

    public String getPosition() {
        return this.position;
    }

    abstract void income();

    @Override
    public String toString() {
        return "Name: " + getFirstName() + " " + getLastName() + "\n"
                + "Personal Number: " + getPersonalNumber() + "\n"
                + "Position: " + getPosition() + "\n";
    }
}
