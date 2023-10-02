//
// Chapter 11, plus some extra practice for our OOP test
//
public class Fraction
{
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
        this.cancel();
    }
    // overloaded constructor
    public Fraction()
    {
        this.numerator = 0;
        this.denominator = 1;
    }

    public double toDecimal()
    {
        return (double)this.numerator / (double)this.denominator;
    }

    // calculate the GCD to simplify a fraction
    private static int gcd(int n, int m)
    {
        int gcd;
        if ( n == m )
            gcd = n;
        else
        {
            while (n != m)
            {   if ( n < m )
                m = m - n;
            else
                n = n - m;
            }
        }
        return n;
    }

    public void cancel() // simplify
    {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator = this.numerator / gcd;
        this.denominator = this.denominator / gcd;
    }

    public int getNumerator()
    {
        return numerator;
    }

    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public void setDenominator(int denominator)
    {
        this.denominator = denominator;
    }

    //  Practice for the test: write the add, equals and compareTo methods
    public Fraction add(Fraction second)
    {
        int sumNum = this.numerator * second.denominator + second.numerator * this.denominator;
        int sumDen = this.denominator * second.denominator;
        Fraction sum = new Fraction(sumNum, sumDen);
        return sum;
    }

    // when are two fractions the same?
    public boolean equals(Fraction second)
    {
        return this.toDecimal() == second.toDecimal();
    }

    // how to compare fractions? Remember when we compare Strings?
    public double compareTo(Fraction second)
    {
        return this.toDecimal() - second.toDecimal();
    }

    public String toString()
    {
        return numerator + "/" + denominator;
    }

}
