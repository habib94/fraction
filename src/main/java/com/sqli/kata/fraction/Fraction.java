package com.sqli.kata.fraction;

import java.util.Objects;

class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction that) {
        int resultNumerator = numerator * that.denominator + that.numerator * denominator;
        int resultDenominator = that.denominator * denominator;
        if (resultNumerator == resultDenominator) {
            return new Fraction(1, 1);
        } else {
            return new Fraction(resultNumerator, resultDenominator);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return "Fraction{" + "numerator=" + numerator + ", denominator=" + denominator + '}';
    }
}
