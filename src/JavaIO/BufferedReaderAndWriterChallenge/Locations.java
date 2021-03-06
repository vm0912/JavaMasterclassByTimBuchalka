package JavaIO.BufferedReaderAndWriterChallenge;

import java.io.*;
import java.util.*;

/*
pt1
Read the locations with BufferedReader

pt2
Write the locations data using BufferedWriter
 */
public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();

    public static void main(String[] args) throws IOException {
//        try(FileWriter locFile = new FileWriter("locations.txt");
//            FileWriter dirFile = new FileWriter("directions.txt")) {
//            for(Location location : locations.values()) {
//                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
//                for(String direction : location.getExits().keySet()) {
//                    dirFile.write(location.getLocationID() + "," + direction + "," + location.getExits().get(direction) + "\n");
//                }
//            }
//        }
        try (BufferedWriter locationWriter = new BufferedWriter(new FileWriter("locations.txt"));
             FileWriter dirFile = new FileWriter("directions.txt")) {
            for (Location location : locations.values()) {
                locationWriter.write(location.getLocationID() + "," + location.getDescription() + "\n");
                for (String direction : location.getExits().keySet()) {
                    if(!direction.equalsIgnoreCase("Q")){
                        dirFile.write(location.getLocationID() + ","
                                + direction + "," + location.getExits().get(direction) + "\n");
                    }
                }
            }
        }
    }

    static {

        try (BufferedReader locationReader = new BufferedReader(new FileReader("locations_big.txt"));
             BufferedReader directionReader = new BufferedReader(new FileReader("directions_big.txt"))) {
            String locationInput;
            while ((locationInput = locationReader.readLine()) != null) {
                String[] data = locationInput.split(",");
                int loc = Integer.parseInt(data[0]);
                String description = data[1];
                System.out.println("Imported loc: " + loc + ": " + description);
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(loc, new Location(loc, description, tempExit));
            }

            String directionInput;
            while ((directionInput = directionReader.readLine()) != null) {
                String[] data = directionInput.split(",");
                int loc = Integer.parseInt(data[0]);
                String direction = data[1];
                int destination = Integer.parseInt(data[2]);

                System.out.println(loc + ": " + direction + ": " + destination);
                Location location = locations.get(loc);
                location.addExit(direction, destination);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();

    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
