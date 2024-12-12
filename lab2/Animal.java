package lab2;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;
    private AnimalType animalType;
    private Owner owner;
    private List<Visit> visitList = new ArrayList<>();

    public Animal() {
    }

    public Animal(String name, AnimalType animalType, Owner owner) {
        this.name = name;
        this.animalType = animalType;
        this.owner = owner;
    }

    public void printInfo() {
        System.out.printf("Animal info:  Name: %s, AnimalType: %s%n ", name, animalType);
        System.out.println("Owner info: ");
        owner.printInfo();
        for (Visit visit : visitList) {
            visit.printInfo();
        }
    }

    public void printShortInfo () {
        System.out.printf("Short info:  AnimalName: %s, OwnerName: %s%n", name, owner.getName());
        System.out.println( " Number of visits" + visitList.size());
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Visit visit : visitList) {
            sb.append(visit.toString()).append("\n");
        }

        return "name=%s, animalType=%s, \nowner=[%s],%nVisits [%n%s]".formatted(name, animalType, owner.toString(), sb.toString());
    }

    public void addVisitList(Visit visit) {
        visitList.add(visit);
    }

    public List<Visit> getVisitList() {
        return visitList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
