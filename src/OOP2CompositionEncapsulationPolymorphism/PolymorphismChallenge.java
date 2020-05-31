package OOP2CompositionEncapsulationPolymorphism;

public class PolymorphismChallenge {

    public static void main(String[] args) {

        Car car = new Car("base car",8 );
        car.startEngine();
        car.accelerate();
        car.brake();

        Car mazda = new Mazda("Mazda 6 ", 4);
        mazda.startEngine();
        mazda.accelerate();
        mazda.brake();

        Car audi = new Audi("Audi A6 ", 4);
        audi.startEngine();
        audi.accelerate();
        audi.brake();

    }

}

class Car{
    private String name;
    private boolean engine;
    private int cylindersNumber;
    private int wheelsNumber;

    public Car(String name, int cylindersNumber) {
        this.name = name;
        this.engine = true;
        this.cylindersNumber = cylindersNumber;
        this.wheelsNumber = 4;
    }

    public void startEngine(){
        System.out.println("Car.startEngine() was called");
    }

    public void brake(){
        System.out.println("Car.brake() was called");
    }

    public void accelerate(){
        System.out.println("Car.accelerate() was called");
    }


}


class Audi extends Car {

    public Audi(String name, int cylindersNumber) {
        super(name, cylindersNumber);
    }

    @Override
    public void startEngine() {
        System.out.println("Audi.startEngine() was called");
    }

    @Override
    public void brake() {
        System.out.println("Audi.brake() was called");

    }

    @Override
    public void accelerate() {
        System.out.println("Audi.accelerate() was called");
    }
}


class Unknown extends Car {
    public Unknown( int cylindersNumber) {
        super("Unknown", cylindersNumber);
    }

}

class Mazda extends Car {
    public Mazda(String name, int cylindersNumber) {
        super(name, cylindersNumber);
    }

    @Override
    public void startEngine() {
        System.out.println("Mazda.startEngine() was called");
    }


    //method brake() not overridden

    @Override
    public void accelerate() {
        System.out.println("Mazda.accelerate() was called -> calling the functionality of a superclass...");
        super.accelerate();
    }
}
