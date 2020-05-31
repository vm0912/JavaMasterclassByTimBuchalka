package OOP2CompositionEncapsulationPolymorphism;

public class RoomComposition {

    private Dimensions dimensions;
    private int numberOfWindows;
    private String heating;
    private Doors doors;
    private TV tv;


    public RoomComposition(Dimensions dimensions, int numberOfWindows, String heating, Doors doors, TV tv) {
        this.dimensions = dimensions;
        this.numberOfWindows = numberOfWindows;
        this.heating = heating;
        this.doors = doors;
        this.tv = tv;
    }

    public void netflixNChill(){
        enterRoom();
        tv.watchNetflix();
    }

    public void enterRoom(){
        if(doors.checkIfClosed()){
            doors.openAndClose();
        } else {
            doors.toggleDoors();
        }
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public String getHeating() {
        return heating;
    }

    public Doors getDoors() {
        return doors;
    }

    public TV getTv() {
        return tv;
    }
}
