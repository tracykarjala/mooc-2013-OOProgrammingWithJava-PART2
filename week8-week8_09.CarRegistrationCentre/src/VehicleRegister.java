import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> register;

    public VehicleRegister() {
        this.register = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (register.containsKey(plate)) {
            return false;
        }
        register.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate) {
        if (register.containsKey(plate)) {
            return register.get(plate);
        }
        return null;
    }

    public boolean delete(RegistrationPlate plate) {
        if (register.containsKey(plate)) {
            register.remove(plate);
            return true;
        }
        return false;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : register.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        HashSet<String> owners = new HashSet<String>();
        for (RegistrationPlate plate : register.keySet()) {
            owners.add(register.get(plate));
        }
        for (String owner : owners) {
            System.out.println(owner);
        }
    }
}
