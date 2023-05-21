public class TriangleTest {
    public static void main(String[] args) {
        try {
            Triaangle triangle = new Triaangle(1, 2, 3);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}