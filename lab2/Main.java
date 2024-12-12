package lab2;

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Tayler", "Derden", new Date(24, 5,1995));
        Visit vis1 = new Visit("asd", "13123", new Date(11, 12, 2003));
        Visit vis2 = new Visit("asd", "13123", new Date(11, 12, 2003));

        Animal animal1 =new Animal("Yosha", AnimalType.CAT, owner1);
        animal1.addVisitList(vis1);
        animal1.addVisitList(vis2);

        System.out.println("animal 1 full info");
        System.out.println(animal1);
        System.out.println();
        System.out.println("__________________________________________________");


        
        Owner owner2 = new IndividualOwner("BO", "SIN", new Date(24, 5,1995), "123456789", "Address1");
        Visit vis3 = new Visit("asdd", "132123", new Date(11, 12, 2003));
        Visit vis4 = new Visit("asdda", "13123", new Date(11, 12, 2003));

        Animal animal2 =new Animal("Yosha", AnimalType.CAT, owner2);
        animal2.addVisitList(vis3);
        animal2.addVisitList(vis4);

        System.out.println("animal 2 full info");
        System.out.println(animal2);
        System.out.println();
        System.out.println("__________________________________________________");


        Owner owner3 = new OrganizationOwner("BO", "SIN", new Date(24, 5,1995), "ADASDASD", "IIFASD");
        Visit vis5 = new Visit("asdd", "131232", new Date(11, 12, 2003));
        Visit vis6 = new Visit("asdda", "113123", new Date(11, 12, 2003));

        Animal animal3 =new Animal("Yosha", AnimalType.CAT, owner3);
        animal3.addVisitList(vis5);
        animal3.addVisitList(vis6);

        System.out.println("animal 3 full info");
        System.out.println(animal3);
        System.out.println();
        System.out.println("__________________________________________________");
    }
}
