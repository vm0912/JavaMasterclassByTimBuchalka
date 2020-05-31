package OOP2CompositionEncapsulationPolymorphism.MasterChallenge;

import java.util.HashMap;
import java.util.Map;

public class DeluxeHamburger extends Burger {

    public DeluxeHamburger(String breadRollType, String meat, double baseBurgerPrice) {
        super(breadRollType, meat, baseBurgerPrice, new HashMap<>(Map.of("chips",3., "drinks", 3.)) );
    }


}
