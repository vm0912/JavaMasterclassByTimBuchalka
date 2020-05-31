package JavaCollections.SetsChallenge;

public class Planet extends HeavenlyBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.PLANET);
    }

    public Planet(String name) {
        super(name, 0, BodyType.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if((moon.getBodyType() != BodyType.MOON)){
            System.out.println("Planets can't have satellites which aren't moons.");
            return false;
        }
        return super.addSatellite(moon);
    }
}
