package OOP2CompositionEncapsulationPolymorphism;

public class Lion extends Animal {

    public Lion() {
        super("Lion");
    }

    public static void makeANoise(){
        System.out.println("Roar");
    }

    @Override
    public void move() {
        System.out.println("Lion.move() called : lion can walk or run");
    }
}
