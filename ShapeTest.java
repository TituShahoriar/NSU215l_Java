public class ShapeTest {
    public static void main(String[] args) {
        Square square = new Square(5.0);

        System.out.println("Shape Name: " + square.getName());
        System.out.println("Area: " + square.area());
        System.out.println("Perimeter: " + square.perimeter());
    }
}
