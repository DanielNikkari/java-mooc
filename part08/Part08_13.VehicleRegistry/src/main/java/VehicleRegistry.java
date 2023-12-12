import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class VehicleRegistry {

  private HashMap<LicensePlate, String> vehicleRegistry;

  public VehicleRegistry() {
    vehicleRegistry = new HashMap<>();
  }

  public boolean add(LicensePlate licensePlate, String owner) {
    if (this.vehicleRegistry.containsKey(licensePlate)) {
      return false;
    }

    this.vehicleRegistry.put(licensePlate, owner);
    return true;
  }

  public String get(LicensePlate licensePlate) {
    return this.vehicleRegistry.get(licensePlate);
  }

  public boolean remove(LicensePlate licensePlate) {
      String success = this.vehicleRegistry.remove(licensePlate);
      if (success == null) {
        return false;
      }
      return true;
  }

  public void printLicensePlates() {
    for (LicensePlate licensePlate : this.vehicleRegistry.keySet()) {
      System.out.println(licensePlate.toString());
    }
  }

public void printOwners() {
    Set<String> uniqueOwners = this.vehicleRegistry.values().stream().distinct().collect(Collectors.toSet());

    for (String owner : uniqueOwners) {
        System.out.println(owner);
    }
}
}
