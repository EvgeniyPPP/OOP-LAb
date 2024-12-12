package lab2;

public class IndividualOwner extends Owner {
    String passportNumber;
    String address;

    public IndividualOwner() {
    }

    public IndividualOwner(String name, String surName, Date birthdate, String passportNumber, String address) {
        super(name, surName, birthdate);
        this.passportNumber = passportNumber;
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + ", PassportNumber=" + passportNumber + " Address=" + address;
    }
}
