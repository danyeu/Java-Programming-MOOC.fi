import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate,String> registry;
    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }
    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.containsKey(licensePlate)) {
            return false;
        }
        registry.put(licensePlate,owner);
        return true;
    }
    public String get(LicensePlate licensePlate) {
        return registry.getOrDefault(licensePlate, null);
    }
    public boolean remove(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            return true;
        }
        return false;
    }
    public void printLicensePlates() {
        for (LicensePlate lp : registry.keySet()) {
            System.out.println(lp);
        }
    }
    public void printOwners() {
        HashMap<String, Integer> owners = new HashMap<>();
        for (String owner : registry.values()) {
            if (owners.containsKey(owner)) {
                continue;
            }
            owners.put(owner,0);
            System.out.println(owner);
        }
    }
}
