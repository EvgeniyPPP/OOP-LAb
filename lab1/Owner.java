package lab1;

public class Owner {
    private String name;
    private String surname;
    private Date birthdate;

    public Owner() {
    }

    public Owner(String name, String surName, Date birthdate) {
        this.name = name;
        this.surname = surName;
        this.birthdate = birthdate;
    }

    public void printInfo() {
        System.out.printf("Owner info:  Name: %s, Surname: %s%n ", name, surname);
        System.out.print("Owner birthdate: ");
        birthdate.printInfo();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surname;
    }

    public void setSurName(String surName) {
        this.surname = surName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
