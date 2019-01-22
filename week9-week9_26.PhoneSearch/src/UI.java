import java.util.Scanner;
import java.util.Set;

public class UI {
    private Scanner reader;
    private Directory directory;

    public UI(Scanner reader) {
        this.reader = reader;
        this.directory = new Directory();
    }

    public void startUI() {
        menu();
        commands();
    }

    public void menu() {
        System.out.println("phone search\n" +
                "available operations:\n" +
                " 1 add a number\n" +
                " 2 search for a number\n" +
                " 3 search for a person by phone number\n" +
                " 4 add an address\n" +
                " 5 search for personal information\n" +
                " 6 delete personal information\n" +
                " 7 filtered listing\n" +
                " x quit");
    }

    public void notFound() {
        System.out.println("  not found");
    }

    public void commands() {
        while (true) {
            System.out.print("\ncommand: ");
            String command = reader.nextLine();

            if (command.equals("1")) {
                System.out.print("whose number: ");
                String name = reader.nextLine();
                System.out.print("number: ");
                String number = reader.nextLine();
                if (!directory.searchByName(name)) {
                    directory.addPersonToDirectory(new Person(name, number));
                } else {
                    Person person = directory.getPersonByName(name);
                    person.addNumber(number);
                    directory.addNumberToDirectory(number, person);
                }
            }

            if (command.equals("2")) {
                System.out.print("whose number: ");
                String name = reader.nextLine();
                if (directory.searchByName(name)) {
                    Person person = directory.getPersonByName(name);
                        for (String number : person.getPhoneNumbers()) {
                            System.out.println(" " + number);
                        }
                    } else {
                    notFound();
                }
            }

            if (command.equals("3")) {
                System.out.print("number: ");
                String number = reader.nextLine();
                if (!directory.searchByNumber(number)) {
                    notFound();
                } else {
                    Person person = directory.getPersonByNumber(number);
                    System.out.println(" " + person.getName());
                }
            }

            if (command.equals("4")) {
                System.out.print("whose address: ");
                String name = reader.nextLine();
                if (!directory.searchByName(name)) {
                    directory.addPersonToDirectory(new Person(name));
                }
                Person person = directory.getPersonByName(name);
                String addressString = "";
                System.out.print("street: ");
                addressString = reader.nextLine();
                System.out.print("city: ");
                addressString += " " + reader.nextLine();
                person.setAddress(addressString);
                directory.addAddressToDirectory(addressString, person);
            }

            if (command.equals("5")) {
                System.out.print("whose information: ");
                String name = reader.nextLine();
                if (!directory.searchByName(name)) {
                    notFound();
                } else {
                    Person person = directory.getPersonByName(name);
                    System.out.print(person);
                }
            }

            if (command.equals("6")) {
                System.out.print("whose information: ");
                String name = reader.nextLine();
                if (directory.searchByName(name)) {
                    directory.removePerson(name);
                }
            }

            if (command.equals("7")) {
                System.out.print("keyword (if empty, all listed): ");
                String searchString = reader.nextLine();
                directory.filterSearch(searchString);
            }

            if (command.equals("x")) {
                break;
            }
        }
    }
}
