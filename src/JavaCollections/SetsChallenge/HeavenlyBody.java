package JavaCollections.SetsChallenge;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final BodyType bodyType;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.bodyType = BodyType.UNDEFINED;
        this.satellites = new HashSet<>();
    }

    public HeavenlyBody(String name, BodyType bodyType) {
        this.name = name;
        this.bodyType = bodyType;
        this.orbitalPeriod = 0;
        this.satellites = new HashSet<>();
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        if(bodyType != null){
            this.bodyType = bodyType;

        } else{
            this.bodyType = BodyType.UNDEFINED;
        }
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public boolean addSatellite(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }


    @Override
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if( !(obj instanceof HeavenlyBody)){
            return false;
        }
//        System.out.println("obj.getClass() is " + obj.getClass());
//        System.out.println("this.getClass() is " + this.getClass());
//        if ((obj == null) || (obj.getClass() != this.getClass())) {
//            return false;
//        }
        String objName = ((HeavenlyBody) obj).getName();
        return (this.name.equals(objName) && this.bodyType.equals( ((HeavenlyBody) obj).bodyType));
    }

    @Override
    public int hashCode() {
//        System.out.println("HeavenlyBody.hashcode() called");
        return this.name.hashCode() + this.bodyType.toString().hashCode();
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", orbitalPeriod=" + orbitalPeriod +
                ", bodyType=" + bodyType;
    }
}
