package OOP1ClassesConstructorsInheritance;

public class Vehicle {

    private int cabin;
    private int controller;
    private int speed;

    public Vehicle() {
    }

    public Vehicle(int cabin, int controller, int speed) {
        this.cabin = cabin;
        this.controller = controller;
        this.speed = speed;
    }



    public  void move(int speed){
        System.out.println("Vehicle.move() called");
    }

    public int getCabin() {
        return cabin;
    }

    public void setCabin(int cabin) {
        this.cabin = cabin;
    }

    public int getController() {
        return controller;
    }

    public void setController(int controller) {
        this.controller = controller;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
