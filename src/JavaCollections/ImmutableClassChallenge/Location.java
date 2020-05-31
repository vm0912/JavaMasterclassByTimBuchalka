package JavaCollections.ImmutableClassChallenge;

import java.util.HashMap;
import java.util.Map;

/**
 * Challenge is to change the constructor which at first compiled but could crash at runtime
 */
public class Location {
    private static int locationIDIncrement = 0;
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;


    //old constructor
//    public Location(int locationID, String description, Map<String, Integer> exits) {
//        this.locationID = locationID;
//        this.description = description;
//        this.exits = new HashMap<String, Integer>(exits);
//        this.exits.put("Q", 0);
//    }

    //new constructor, avoiding the NullPointerException
        public Location( String description, Map<String, Integer> exits) {
            this.locationID = locationIDIncrement;
            locationIDIncrement++;
        this.description = description;
        if(exits!= null){
            this.exits = new HashMap<>(exits);
        }else{
            this.exits = new HashMap<>();
        }

        this.exits.put("Q", 0);
    }

//    public void addExit(String direction, int location) {
//        exits.put(direction, location);
//    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
