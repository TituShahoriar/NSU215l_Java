public class Driver {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle("Red", 4, 5);
        Shape shape2 = new Triaangle("Blue", 3, 6);

        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
    }
}