public class FractionTest {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 4);
        Fraction fraction2 = new Fraction(3, 5);

        System.out.println("Fraction 1: " + fraction1.toString());
        System.out.println("Fraction 2: " + fraction2.toString());

        fraction1.add(fraction2);
        System.out.println("Addition: " + fraction1.toString());

        fraction1.sub(fraction2);
        System.out.println("Subtraction: " + fraction1.toString());

        fraction1.multiplication(fraction2);
        System.out.println("Multiplication: " + fraction1.toString());

        fraction1.division(fraction2);
        System.out.println("Division: " + fraction1.toString());
    }
}
