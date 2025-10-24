package shape;

public class ShapeMain {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 3);
        Shape circle = new Circle(4);
        Shape tri = new Triangle(3, 4, 5);

        System.out.println("Rectangle area: " + rect.area());
        System.out.println("Circle area: " + circle.area());
        System.out.println("Triangle perimeter: " + tri.perimeter());
    }
}
