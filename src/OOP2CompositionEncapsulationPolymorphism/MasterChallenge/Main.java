package OOP2CompositionEncapsulationPolymorphism.MasterChallenge;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Burger regularBurgerNoAdditions = new Burger("white flour", "beef", 5.99);
        regularBurgerNoAdditions.getAdditions();
        Burger regularWithOnionsAndKetchup = new Burger("white flour", "beef", 5.99,
                new HashMap<>(Map.of("Onions", 1., "Ketchup", 1.)));
        regularWithOnionsAndKetchup.getAdditions();
        regularWithOnionsAndKetchup.calculateFullBurgerPrice();

        HealthyBurger healthyBurger = new HealthyBurger("turkey", 9.99,
                new HashMap<>(Map.of("Onions", 1., "Ketchup", 1.)),
                new HashMap<>(Map.of("Cheese", 1., "Corn", 1.)));

        healthyBurger.getAdditions();
        healthyBurger.calculateFullBurgerPrice();


        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("integral", "beef", 12.);
        deluxeHamburger.getAdditions();
        deluxeHamburger.calculateFullBurgerPrice();

        //regular burger with more than 4 additions
        Burger burgerWithFiveAdditions = new Burger("white flour", "beef", 5.99,
                new HashMap<>(Map.of("Onions", 1.,
                        "Ketchup", 1.,
                        "Corn", 1.,
                        "Mayo", 1.,
                        "Cheese", 1.)));
        burgerWithFiveAdditions.getAdditions();
        burgerWithFiveAdditions.calculateFullBurgerPrice();

        //healthy burger with more than allowed additions
        HealthyBurger healthyBurgerWithTooMuchAdditions = new HealthyBurger("turkey", 9.99,
                new HashMap<>(Map.of("Onions", 1., "Ketchup", 1.)),
                new HashMap<>(Map.of("Cheese", 1., "Corn", 1.,
                        "Mayo", 1.)));

        healthyBurgerWithTooMuchAdditions.getAdditions();
        healthyBurgerWithTooMuchAdditions.calculateFullBurgerPrice();
    }
}
