public class Flight {
    private Plane plane;
    private String departureAirport;
    private String arrivalAirport;

    public Flight(Plane plane, String departureAirport, String arrivalAirport) {
        this.plane = plane;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    @Override
    public String toString() {
        return plane + " (" + departureAirport + "-" + arrivalAirport + ")";
    }
}
