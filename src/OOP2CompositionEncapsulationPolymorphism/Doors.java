package OOP2CompositionEncapsulationPolymorphism;

public class Doors {
    private String material;
    private String type;
    private boolean doorsClosed;

    public Doors(String material, String type, boolean doorsClosed) {
        this.material = material;
        this.type = type;
        this.doorsClosed = doorsClosed;
    }

    public boolean toggleDoors(){
        System.out.println("Doors were " + (doorsClosed ? "closed so we are opening them..." : "open so we are closing them...") );
        return doorsClosed = !doorsClosed;
    }

    public void openAndClose(){
        //could have used a loop but it's only two iterations/method calls
       // unnecessary to check status for the example, might add the feature later
            this.toggleDoors();
        System.out.println("Entering the room...");
            this.toggleDoors();

    }

    public boolean checkIfClosed(){
        System.out.println("Doors are "+ (doorsClosed ? "closed" : "open"));
        return doorsClosed;
    }
}
