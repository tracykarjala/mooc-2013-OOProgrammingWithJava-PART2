import java.util.Scanner;

public class TextInterface {
    private Scanner reader;
    private Airport airport;

    public TextInterface() {
        this.reader = new Scanner(System.in);
        this.airport = new Airport();
    }

    public void start() {
        airportPanelTitle();
        airportPanelMenu();
        flightServiceTitle();
        flightServiceMenu();
    }

    public void airportPanelTitle() {
        System.out.println("Airport panel\n--------------------");
    }

    public void airportPanelMenu() {
        while (true) {
            System.out.println("Choose operation:\n" +
                    "[1] Add airplane\n" +
                    "[2] Add flight\n" +
                    "[x] Exit");
            System.out.print("> ");
            String command = reader.nextLine();

            if (command.equals("1")) {
                addPlane();
            } else if (command.equals("2")) {
                addFlight();
            } else if (command.equals("x")) {
                break;
            }
        }
    }

    public void flightServiceTitle() {
        System.out.println("Flight service\n" +
                "------------\n");
    }

    public void flightServiceMenu() {
        while (true) {
            System.out.println("Choose operation:\n" +
                    "[1] Print planes\n" +
                    "[2] Print flights\n" +
                    "[3] Print plane info\n" +
                    "[x] Quit");
            System.out.print("> ");
            String command = reader.nextLine();
            if (command.equals("1")) {
                airport.printPlanes();
            } else if (command.equals("2")) {
                airport.printFlights();
            } else if (command.equals("3")) {
                System.out.println("Give plane ID: ");
                String ID = reader.nextLine();
                System.out.println(airport.getPlane(ID));
            } else if (command.equals("x")) {
                break;
            }
        }
    }

    public void addPlane() {
        System.out.println("Give plane ID: ");
        String ID = reader.nextLine();
        System.out.println("Give plane capacity: ");
        Integer capacity = Integer.parseInt(reader.nextLine());
        airport.addPlane(new Plane(ID, capacity));
    }

    public void addFlight() {
        System.out.println("Give plane ID: ");
        String ID = reader.nextLine();
        System.out.println("Give departure airport code: ");
        String departure = reader.nextLine();
        System.out.println("Give destination airport code: ");
        String arrival = reader.nextLine();

        airport.addFlight(new Flight(airport.getPlane(ID), departure, arrival));
    }
}
