import java.util.*;

public class Directory {
    private Map<String, Person> nameMap;
    private Map<String, Person> phoneMap;
    private Map<String, Person> addressMap;

    public Directory() {
        this.nameMap = new HashMap<String, Person>();
        this.phoneMap = new HashMap<String, Person>();
        this.addressMap = new HashMap<String, Person>();
    }



    public void addPersonToDirectory(Person person) {
        String name = person.getName();
        nameMap.put(name, person);
        Set<String> numbers = person.getPhoneNumbers();
        if (!numbers.isEmpty()) {
            for (String number: numbers) {
                phoneMap.put(number, person);
            }
        }
    }

    public void addAddressToDirectory(String address, Person person) {
        addressMap.put(address, person);
    }

    public void addNumberToDirectory(String number, Person person) {
        phoneMap.put(number, person);
    }

    public boolean searchByName(String name) {
        return nameMap.containsKey(name);
    }

    public Person getPersonByName(String name) {
        return nameMap.get(name);
    }

    public Person getPersonByAddress(String address) {
        return addressMap.get(address);
    }

    public boolean searchByNumber(String number) {
        return phoneMap.containsKey(number);
    }

    public Person getPersonByNumber(String number) {
        return phoneMap.get(number);
    }

    public void removePerson(String name) {
        Person person = getPersonByName(name);
        if (!person.getPhoneNumbers().isEmpty()) {
            for (String number : person.getPhoneNumbers()) {
                phoneMap.remove(number);
            }
        }
        if (!person.getAddress().isEmpty()) {
            addressMap.remove(person.getAddress());
        }
        nameMap.remove(person.getName());
    }

    public void filterSearch(String searchString) {
        List<Person> personList = new ArrayList<Person>();
        String printString = "";
        if (searchString.isEmpty()) {
            personList.addAll(nameMap.values());
        } else {
            for (String name : nameMap.keySet()) {
                if (name.contains(searchString)) {
                    personList.add(getPersonByName(name));
                }
            }
            for (String address : addressMap.keySet()) {
                if (address.contains(searchString)) {
                    personList.add(getPersonByAddress(address));
                }
            }
        }
        if (personList.isEmpty()) {
            System.out.println(" keyword not found");
        } else {
            // run the arraylist through a set to filter duplicates
            Set<Person> personSet = new HashSet<Person>();
            personSet.addAll(personList);
            List<Person> newList = new ArrayList<Person>();
            newList.addAll(personSet);
            // sort the list before printing
            Collections.sort(newList);
            for (Person person : newList) {
                // build our print string
                printString += person.getName() + "\n" + person;
            }
            System.out.println(printString);
        }
    }
}
