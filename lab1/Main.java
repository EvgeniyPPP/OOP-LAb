package lab1;

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Tayler", "Derden", new Date(24, 5,1995));
        Visit vis1 = new Visit("asd", "13123", new Date(11, 12, 2003));
        Visit vis2 = new Visit("asd", "13123", new Date(11, 12, 2003));

        Animal animal1 =new Animal("Yosha", AnimalType.CAT, owner1);
        animal1.addVisitList(vis1);
        animal1.addVisitList(vis2);

        System.out.println("animal 1 full info");
        animal1.printInfo();
        System.out.println("__________________________________________________");

        System.out.println("animal 1 short info");
        animal1.printInfo();
        System.out.println("__________________________________________________");

        Owner owner = animal1.getOwner();
        System.out.println("animal1 via getter: ");
        owner.printInfo();
        System.out.println("__________________________________________________");


        
        Owner Owner2 = new Owner("BO", "SIN", new Date(24, 5,1995));
        Visit vis3 = new Visit("asdd", "13123", new Date(11, 12, 2003));
        Visit vis4 = new Visit("asdda", "13123", new Date(11, 12, 2003));

        Animal animal2 =new Animal("Yosha", AnimalType.CAT, owner1);
        animal1.addVisitList(vis3);
        animal1.addVisitList(vis4);

        System.out.println("animal 2 full info");
        animal2.printInfo();
        System.out.println("__________________________________________________");

        System.out.println("animal 2 short info");
        animal2.printInfo();
        System.out.println("__________________________________________________");

        Owner owner2 = animal2.getOwner();
        System.out.println("animal2 via getter: ");
        owner2.printInfo();
        System.out.println("__________________________________________________");
    }
}
