package OOP2CompositionEncapsulationPolymorphism.MasterChallenge;

import java.util.HashMap;
import java.util.Map;

public class Burger {


    private String breadRollType;
    private String meat;
    private double baseBurgerPrice;
    private Map<String, Double> extraAdditions = new HashMap<>();



    public Burger(String breadRollType, String meat, double baseBurgerPrice, HashMap<String, Double> additions ) {
        this(breadRollType,meat, baseBurgerPrice);
        if(!additions.isEmpty()){
            if(additions.size() >4){
                System.out.println("You are limited to 4 burger additions for the basic burger.");
                int additionCount= 0;
                for(Map.Entry<String, Double> entry : additions.entrySet()){
                    this.extraAdditions.put(entry.getKey(),entry.getValue());
                    additionCount++;
                    if(additionCount>=4){
                        break;
                    }
                }

            }
            else{
                this.extraAdditions.putAll(additions);
            }
        }
    }

    public Burger(String breadRollType, String meat, double baseBurgerPrice) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.baseBurgerPrice = baseBurgerPrice;

    }

    public Map<String, Double> getAdditions() {
        if( this.extraAdditions.isEmpty()){
            System.out.println("There are no additions in the burger");
        } else {
            for (Map.Entry<String, Double> entry : this.extraAdditions.entrySet()) {
                System.out.println("Addition: " + entry.getKey() +" \tPrice: "+ entry.getValue() + "$");
            }
        }
        return this.extraAdditions;
    }


    public double calculateFullBurgerPrice(){
        double price = baseBurgerPrice;
        System.out.println("\nPRICE:\nBase burger price: " + price + "$");
        for (Map.Entry<String, Double> entry : getAdditions().entrySet()) {
                price+= entry.getValue();
        }
        System.out.println("--------------------------\nTOTAL: \t\t\t"+ price +"$\n");

        return price;
    }

}
