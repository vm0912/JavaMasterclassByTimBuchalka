package OOP2CompositionEncapsulationPolymorphism;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nComposition example:");
        RoomComposition room = new RoomComposition(new Dimensions(10,10,3),
                2,"on wood",new Doors("wooden","single-handle",true),
                new TV(22,"Sony","smartTVUE291419",false));

        System.out.println("Checking the doors..");
        room.getDoors().checkIfClosed();
        System.out.println("Planning to watch Netflix...");
        room.netflixNChill();


        System.out.println("\n******************************\nPolymorphism example:\n");


        Animal duck = new Duck();
        Animal lion = new Lion();
        Animal mysterious = new MysteriousAnimal();
        //static method called with instance, the refference is from class Animal
        duck.makeANoise();
        mysterious.makeANoise();
        // duck makes a noise, the refference changed from Animal to Duck
        ((Duck) duck).makeANoise();
        duck.move();
        lion.move();
        mysterious.move();
    }
}
