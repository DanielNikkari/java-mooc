import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

  private HashMap<String, ArrayList<String>> storageFacility;

  public StorageFacility() {
    this.storageFacility = new HashMap<>();
  }

  public void add(String unit, String item) {
    if (this.storageFacility.containsKey(unit)) {
      this.storageFacility.get(unit).add(item);
      return;
    }

    ArrayList<String> newUnit = new ArrayList<>();
    newUnit.add(item);

    this.storageFacility.put(unit, newUnit);
  }

  public ArrayList<String> contents(String storageUnit) {
    if (!this.storageFacility.containsKey(storageUnit)) {
      return new ArrayList<>();
    }

    return this.storageFacility.get(storageUnit);
  }

  public void remove(String storageUnit, String item) {
    this.storageFacility.get(storageUnit).remove(item);
    if(this.storageFacility.get(storageUnit).size() == 0) {
      this.storageFacility.remove(storageUnit);
    }
  }

  public ArrayList<String> storageUnits() {
    ArrayList<String> storageUnitsWithItems = new ArrayList<>();
    for (String storageUnit : this.storageFacility.keySet()) {
      if (this.storageFacility.get(storageUnit).size() == 0) {
        continue;
      }

      storageUnitsWithItems.add(storageUnit);
    }

    return storageUnitsWithItems;
  }
}
