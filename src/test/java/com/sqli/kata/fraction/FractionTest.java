package com.sqli.kata.fraction;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FractionTest {

  @ParameterizedTest
  @CsvSource({ //
    "0,1,0,1,0,1", //
    "0,1,1,1,1,1", //
    "1,1,1,1,2,1", //
    "1,2,1,3,5,6" //
  })
  void should_add_fractions(int n1, int d1, int n2, int d2, int nx, int dx) {
    Fraction result = new Fraction(n1, d1).add(new Fraction(n2, d2));
    assertThat(result).isEqualTo(new Fraction(nx, dx));
  }
}
