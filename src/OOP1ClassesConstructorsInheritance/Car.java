package OOP1ClassesConstructorsInheritance;

public class Car extends Vehicle {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    public Car() {
    }

    public Car(int cabin, int controller, int speed, int doors, int wheels, String model, String engine, String color) {
        super(cabin, controller, speed);
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.toLowerCase().equals("model s") || model.toLowerCase().equals("model x")
                || model.toLowerCase().equals("roadster")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void move(int speed) {
        System.out.println("Car.move() called");
        super.move(speed);
        this.steer("unknown");
    }

    public void steer(String direction){
        System.out.println("Car.steer() called");
    }
}
