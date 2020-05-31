package OOP2CompositionEncapsulationPolymorphism;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public static void makeANoise(){
        System.out.println("Unspecified noise");
    }

    public void move(){
        System.out.println("Animal.move() called : Unspecified movement");
    }

}
