package lab1;

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
