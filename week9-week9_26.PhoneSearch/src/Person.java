import java.util.HashSet;
import java.util.Set;

public class Person implements Comparable {
    private String name;
    private String address = "";
    private Set<String> phoneNumbers = new HashSet<String>();

    public Person(String name, String number) {
        this.name = name;
        phoneNumbers.add(number);
    }

    public Person(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addNumber(String number) {
        phoneNumbers.add(number);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Set<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    @Override
    public String toString() {
        String returnString = "";
        if (address.isEmpty()) {
            returnString += "  address unknown\n";
        } else {
            returnString += "  address: " + getAddress() + "\n";
        }
        if (phoneNumbers.isEmpty()) {
            returnString += "  phone number not found\n";
        } else {
            returnString += "  phone numbers:\n";
            for (String number : phoneNumbers) {
                returnString += "   " + number + "\n";
            }
        }
        return returnString;
    }

    @Override
    public int compareTo(Object o) {
        return this.getName().compareTo(((Person) o).getName());
    }
}
