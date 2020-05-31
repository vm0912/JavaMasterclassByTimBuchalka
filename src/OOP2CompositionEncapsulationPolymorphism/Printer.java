package OOP2CompositionEncapsulationPolymorphism;

public class Printer {
    private double tonerLevel;
    private int pagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(double tonerLevel, boolean isDuplexPrinter) {
        if(tonerLevel<=100 && tonerLevel>=0){
            this.tonerLevel = tonerLevel;
        } else{
            this.tonerLevel=100.0d;
        }
        this.pagesPrinted = 0;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void fillTheToner(){
        if(this.tonerLevel == 100){
            System.out.println("No need for filling, already 100%...");
        } else{
            System.out.println("The printer is filled up to 100%...");
            this.tonerLevel = 100.0d;
        }

    }

    public void simulatePrinting(int numberOfPages){
        System.out.println(numberOfPages+" pages were sent printing...");
        if(this.isDuplexPrinter){
            System.out.println("Printing in duplex mode...");
            this.pagesPrinted += (numberOfPages/2 + numberOfPages%2);
        } else{
            this.pagesPrinted += numberOfPages;
        }
    }


}
