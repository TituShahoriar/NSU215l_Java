public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public void add(Fraction fraction) {
        numerator = (numerator * fraction.getDenominator()) + (fraction.getNumerator() * denominator);
        denominator = denominator * fraction.getDenominator();
    }

    public void sub(Fraction fraction) {
        numerator = (numerator * fraction.getDenominator()) - (fraction.getNumerator() * denominator);
        denominator = denominator * fraction.getDenominator();
    }

    public void multiplication(Fraction fraction) {
        numerator = numerator * fraction.getNumerator();
        denominator = denominator * fraction.getDenominator();
    }

    public void division(Fraction fraction) {
        numerator = numerator * fraction.getDenominator();
        denominator = denominator * fraction.getNumerator();
    }
}
