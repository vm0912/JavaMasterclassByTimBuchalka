package JavaCollections.SetsChallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
      Modify the previous HeavenlyBody example so that the HeavenlyBody
      class also has a "bodyType" field. This field will store the
      type of HeavenlyBody (such as STAR, PLANET, MOON, etc).

      You can include as many types as you want, but must support at
      least PLANET and MOON.

      For each of the types that you support, subclass the HeavenlyBody class
      so that your program can create objects of the appropriate type.

      Although astronomers may shudder at this, our solar systems will
      allow two bodies to have the same name as long as they are not the
      same type of body: so you could have a star called "BetaMinor" and
      an asteroid also called "BetaMinor", for example.

      Hint: This is much easier to implement for the Set than it is for the Map,
      because the Map will need a key that uses both fields.

      There is a restriction that the only satellites that planets can have must
      be moons. Even if you don't implement a STAR type, though, your program
      should not prevent one being added in the future (and a STAR's satellites
      can be almost every kind of HeavenlyBody).

      Test cases:
      1. The planets and moons that we added in the previous video should appear in
      the solarSystem collection and in the sets of moons for the appropriate planets.

      2. a.equals(b) must return the same result as b.equals(a) - equals is symmetric.

      3. Attempting to add a duplicate to a Set must result in no change to the set (so
      the original value is not replaced by the new one).

      4. Attempting to add a duplicate to a Map results in the original being replaced
      by the new object.

      5. Two bodies with the same name but different designations can be added to the same set.

      6. Two bodies with the same name but different designations can be added to the same map,
      and can be retrieved from the map.
*/
public class SetChallenge {
    private static Map<HeavenlyBodyRepresentation, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();


    public static void main(String[] args) {
        Planet temp = new Planet("Mercury", 88);
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(temp), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(temp), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(temp), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(tempMoon), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(temp), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(tempMoon), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(tempMoon), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(temp), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(tempMoon), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(tempMoon), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(tempMoon), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(tempMoon), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        temp = new Planet("Saturn", 10759);
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(temp), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(temp), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(temp), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(temp), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(temp), temp);

        Star tempStar = new Star("BetaMinor", 5555);
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(tempStar), tempStar);

        tempStar = new Star("Sun", 5555);
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(tempStar), tempStar);

        test();
    }

    public static void test() {
        System.out.println("\nTesting assumption no.1\n-------------------");
        System.out.println("All heavenly bodies: ");
        for (HeavenlyBodyRepresentation bodyRepresentation : solarSystem.keySet()) {
            System.out.println(bodyRepresentation);
        }
        for (HeavenlyBody planet : planets) {
            System.out.println("Moons of planet " + planet.getName() + ":");
            if (planet.getSatellites().isEmpty()) {
                System.out.println("\tno moons evidented");
            } else {
                for (HeavenlyBody moon : planet.getSatellites()) {
                    System.out.println("\t" + moon);
                }
            }
        }

        System.out.println("\nTesting assumption no.2\n-------------------");
        Planet tempBodyMars = new Planet("Mars", 555);
        if (solarSystem.containsKey(HeavenlyBodyRepresentation.bodyRepresentationFactory(
                new Planet("Mars")))) {
            System.out.println("it contains the key");
            System.out.println("Checking newMars.equals(oldMars): " +
                    solarSystem.get(HeavenlyBodyRepresentation.bodyRepresentationFactory(
                            new Planet("Mars"))).equals(tempBodyMars));
            System.out.println("Checking oldMars.equals(newMars): " +
                    tempBodyMars.equals(solarSystem.get(HeavenlyBodyRepresentation.bodyRepresentationFactory(
                            new Planet("Mars")))));

        }
        System.out.println("\nTesting assumption no.3\n-------------------");
        System.out.println("The newMars is added: " + planets.add(tempBodyMars));


        System.out.println("\nTesting assumption no.4\n-------------------");
        System.out.println("Printing the oldMars value from the map");
        Planet mars = new Planet("Mars");
        HeavenlyBody oldMars = solarSystem.get(HeavenlyBodyRepresentation.bodyRepresentationFactory(
                mars));
        System.out.println("\t" + oldMars);
        System.out.println("Trying to add newMars to the map...");
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(tempBodyMars), tempBodyMars);
        System.out.println("Fetching the value from Mars again");
        HeavenlyBody newMars = solarSystem.get(HeavenlyBodyRepresentation.bodyRepresentationFactory(
                mars));
        System.out.println("\t" + newMars);


        System.out.println("\nTesting assumption no.5\n-------------------");
        System.out.println("Adding Pluto as a dwarf planet");
        planets.add(new DwarfPlanet("Pluto", 123));
        System.out.println("Printing the planets set:");
        for (HeavenlyBody planet : planets) {
            System.out.println(planet);
        }

        System.out.println("\nTesting assumption no.6\n-------------------");
        Star beta1 = new Star("BetaMinor", 4444);
        Moon beta2 = new Moon("BetaMinor", 42);
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(beta1), beta1);
        solarSystem.put(HeavenlyBodyRepresentation.bodyRepresentationFactory(beta2), beta2);

        System.out.println("Now fetching the two different heavenly bodies with same name: ");
        System.out.println(solarSystem.get(HeavenlyBodyRepresentation.bodyRepresentationFactory(beta1)));
        System.out.println(solarSystem.get(HeavenlyBodyRepresentation.bodyRepresentationFactory(beta2)));

    }
}
