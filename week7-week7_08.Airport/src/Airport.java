import java.util.ArrayList;
import java.util.HashMap;

public class Airport {
    private HashMap<String, Plane> planes;
    private ArrayList<Flight> flights;

    public Airport() {
        this.planes = new HashMap<String, Plane>();
        this.flights = new ArrayList<Flight>();
    }

    public void addPlane(Plane plane) {
        planes.put(plane.getID(), plane);
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void printPlanes() {
        for (String ID: planes.keySet()) {
            System.out.println(planes.get(ID));
        }
    }

    public void printFlights() {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }

    public Plane getPlane(String ID) {
        return planes.get(ID);
    }
}
