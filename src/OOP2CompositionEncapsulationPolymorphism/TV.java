package OOP2CompositionEncapsulationPolymorphism;

public class TV {
    private int diagonal;
    private String manufacturer;
    private String model;
    private boolean tvOn;

    public TV(int diagonal, String manufacturer, String model, boolean tvOn) {
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
        this.model = model;
        this.tvOn = tvOn;
    }

    public boolean turnTvOnOrOff() {
        System.out.println("TV was " + (tvOn ? "on so we are turning it off..." : "off so we are turning it on..."));
        return tvOn = !tvOn;
    }

    public void watchNetflix() {
        if(!tvOn){
            turnTvOnOrOff();
        }
        System.out.println("Currently watching Netflix...");
    }
}
