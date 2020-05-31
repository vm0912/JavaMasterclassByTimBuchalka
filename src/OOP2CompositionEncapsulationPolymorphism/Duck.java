package OOP2CompositionEncapsulationPolymorphism;

public class Duck extends Animal {

    public Duck() {
        super("Duck");
    }

    @Override
    public void move() {
        System.out.println("Duck.move() called : Duck can walk, run, swim, dive or fly ");
    }

    public static void makeANoise(){
        System.out.println("Quack");
    }
}
