package JavaCollections.SetsChallenge;

// creating an immutable class for the map key
public final class HeavenlyBodyRepresentation {
    private  final String name;
    private  final BodyType bodyType;

    private HeavenlyBodyRepresentation(HeavenlyBody body) {
        this.name = body.getName();
        this.bodyType = body.getBodyType();
    }

    public static HeavenlyBodyRepresentation bodyRepresentationFactory(HeavenlyBody body){
        return new HeavenlyBodyRepresentation(body);
    }

    public String getName() {
        return name;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if( !(obj instanceof HeavenlyBodyRepresentation)){
            return false;
        }
        String objName = ((HeavenlyBodyRepresentation) obj).name;
        return (this.name.equals(objName) && this.bodyType.equals( ((HeavenlyBodyRepresentation) obj).bodyType));
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.bodyType.toString().hashCode();
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", bodyType=" + bodyType ;
    }
}
