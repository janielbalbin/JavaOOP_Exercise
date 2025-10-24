package airplane;

public class AirplaneMain {
    public static void main(String[] args) {
        Airplane a = new Airplane("FL123", "Paris", "09:00 AM");
        System.out.println("Flight status: " + a.checkStatus());
        a.setDelayed(true);
        System.out.println("Updated: " + a.checkStatus());
    }
}
