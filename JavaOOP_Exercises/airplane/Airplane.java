package airplane;

public class Airplane {
    String flightNumber;
    String destination;
    String departureTime;
    boolean delayed;

    public Airplane(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delayed = false;
    }

    public void setDelayed(boolean delayed) { this.delayed = delayed; }
    public String checkStatus() { return delayed ? "Delayed" : "On Time"; }
}
