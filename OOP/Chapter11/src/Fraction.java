public class Fraction {
    // attributes/fields/member or instance variables
    // (no static/class variables needed in this class)
    int numerator;
    int denominator;

    // constructor
    public Fraction(int numerator, int denominator) {
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public Fraction add(Fraction b) {

    }

    // toString = polymorphism/overriding the Object class' toString method
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}
 