package OOP1ClassesConstructorsInheritance;

public class ManualTransmissionCar extends Car {

    private int numberOfGears;
    private int currentGear;

    @Override
    public void move(int speed) {
        System.out.println("ManualTransmissionCar.move() called");
        super.move(speed);
    }

    public void changeGears(int gearValue){
        System.out.println("ManualTransmissionCar.changeGears() called");
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
}
