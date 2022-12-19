package com.sqli.kata.fraction;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class FractionTest {

  @Test
  void name() {
    Fraction result = new Fraction(1, 2).add(new Fraction(1, 3));
    assertThat(result).isEqualTo(new Fraction(5, 6));
  }
}
