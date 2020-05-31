package OOP2CompositionEncapsulationPolymorphism.MasterChallenge;

import java.util.HashMap;
import java.util.Map;

public class HealthyBurger extends Burger {

    private Map<String, Double> extraAdditions = new HashMap<>();

    public HealthyBurger( String meat,double basePrice, HashMap<String, Double> baseAdditions,
                          HashMap<String, Double> extraAdditions) {
        super("brown rye", meat, basePrice, baseAdditions);
        if(!extraAdditions.isEmpty()){
            if(extraAdditions.size() >2){
                System.out.println("You are limited to 2 extra burger additions for the healthy burger.");
                int additionCount= 0;
                for(Map.Entry<String, Double> entry : extraAdditions.entrySet()){
                    this.extraAdditions.put(entry.getKey(),entry.getValue());
                    additionCount++;
                    if(additionCount>=2){
                        break;
                    }
                }
            }
            else{
                this.extraAdditions.putAll(extraAdditions);
            }
        }
    }


    @Override
    public Map<String, Double> getAdditions() {
        Map<String, Double> allAdditions = new HashMap<>();
        allAdditions.putAll(super.getAdditions());
        if( this.extraAdditions.isEmpty()){
            System.out.println("There are no extra additions in the burger");
        } else {
            for (Map.Entry<String, Double> entry : this.extraAdditions.entrySet()) {
                System.out.println("Addition: " + entry.getKey() +" \tPrice: "+ entry.getValue() + "$");
            }
        }
        allAdditions.putAll(this.extraAdditions);
        return allAdditions;
    }

    @Override
    public double calculateFullBurgerPrice() {
        double fullHealthyBurgerPrice = super.calculateFullBurgerPrice();
        for (Map.Entry<String, Double> entry : this.extraAdditions.entrySet()) {
            fullHealthyBurgerPrice+= entry.getValue();
        }
        return fullHealthyBurgerPrice;
    }
}
