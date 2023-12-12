
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description
        
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("Finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg
        
        // HashMap<LicensePlate, String> owners = new HashMap<>();
        // owners.put(li1, "Arto");
        // owners.put(li3, "Jürgen");
        VehicleRegistry vehicleRegistry = new VehicleRegistry();
        System.out.println(vehicleRegistry.add(li1, "Arto"));
        System.out.println(vehicleRegistry.add(li3, "Jürgen"));
        System.out.println(vehicleRegistry.add(li1, "Richie"));
        System.out.println(vehicleRegistry.add(li2, "Arto"));

        System.out.println("owners:");
        vehicleRegistry.printOwners();

        System.out.println(vehicleRegistry.remove(li2));
        System.out.println(vehicleRegistry.remove(li2));
        // System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        // System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
        // if the hasCode-method hasn't been overwritten, the owners won't be found
    }
}
