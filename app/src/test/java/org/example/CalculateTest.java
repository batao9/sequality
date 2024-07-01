package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAverage() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.average(2, 3), 0.0);
  }

  @Test
  public void testSumArray() {
    Calculate calculate = new Calculate();
    int[] array = { 1, 2, 3, 4, 5 };
    int expected = 15;
    assertEquals(expected, calculate.sum(array));
  }

  @Test
  public void testAverageArray() {
    Calculate calculate = new Calculate();
    int[] array = { 1, 2, 3, 4, 5 };
    double expected = 3.0;
    assertEquals(expected, calculate.average(array), 0.0);
  }

  @Test
  public void testSumEven() {
    Calculate calculate = new Calculate();
    int[] array = { 1, 2, 3, 4, 5 };
    int expected = 6;
    assertEquals(expected, calculate.sum_even(array));
  }

  @Test
  public void testSumOdd() {
    Calculate calculate = new Calculate();
    int[] array = { 1, 2, 3, 4, 5 };
    int expected = 9;
    assertEquals(expected, calculate.sum_odd(array));
  }
}
