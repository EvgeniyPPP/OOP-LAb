package lab2;

public class OrganizationOwner extends Owner {
    String organizationName;
    String contactPerson;

    public OrganizationOwner() {
    }

    public OrganizationOwner(String name, String surName, Date birthdate, String organizationName, String contactPerson) {
        super(name, surName, birthdate);
        this.organizationName = organizationName;
        this.contactPerson = contactPerson;
    }


    @Override
    public String toString() {
        return super.toString() + ", organizationName=" + organizationName + ", contactPerson=" + contactPerson;
    }

}
