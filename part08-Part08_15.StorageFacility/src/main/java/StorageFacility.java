import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String,ArrayList<String>> facility;
    public StorageFacility() {
        this.facility = new HashMap<>();
    }
    public void add(String unit, String item) {
        if (facility.containsKey(unit)) {
            facility.get(unit).add(item);
        } else {
            ArrayList<String> newUnit = new ArrayList<>();
            newUnit.add(item);
            facility.put(unit, newUnit);
        }
    }
    public ArrayList<String> contents(String storageUnit) {
        if (facility.containsKey(storageUnit)) {
            return facility.get(storageUnit);
        }
        return new ArrayList<>();
    }

    public void remove(String storageUnit, String item) {
        if (!facility.containsKey(storageUnit)) {
            return;
        }
        for (int i = 0; i < facility.get(storageUnit).size(); i++) {
            if (facility.get(storageUnit).get(i).equals(item)) {
                facility.get(storageUnit).remove(i);
                return;
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String unit : facility.keySet()) {
            if (facility.get(unit).isEmpty()) {
                continue;
            }
            units.add(unit);
        }
        return units;
    }
}
