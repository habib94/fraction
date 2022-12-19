package com.sqli.kata.fraction;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FractionTest {
    @Test
    void name() {
        Fraction result = new Fraction(1, 2).add(new Fraction(1, 3));
        assertThat(result).isEqualTo(new Fraction(5, 6));
    }

    private class Fraction {
        public Fraction(int numerator, int denominator) {

        }

        public Fraction add(Fraction that) {
            return null;
        }
    }
}
