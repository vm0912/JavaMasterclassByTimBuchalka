package OOP2CompositionEncapsulationPolymorphism;

public class EncapsulationChallenge {
    public static void main(String[] args) {

        Printer printer = new Printer(44,true);
        printer.fillTheToner();
        System.out.println("At the moment, the printer has printed " + printer.getPagesPrinted()+" pages");
        printer.simulatePrinting(12);
        System.out.println("At the moment, the printer has printed " + printer.getPagesPrinted()+ " pages");

    }
}
