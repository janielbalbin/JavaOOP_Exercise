package circle;

public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle(4);
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());
    }
}
