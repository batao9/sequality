package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    return sum(x, y) / 2.0;
  }

  public int sum(int[] array) {
    int sum = 0;
    for (int num : array) {
      sum += num;
    }
    return sum;
  }

  double average(int[] array) {
    return sum(array) / (double) array.length;
  }

  public int sum_even(int[] array) {
    int sum = 0;
    for (int num : array) {
      if (num % 2 == 0) {
        sum += num;
      }
    }
    return sum;
  }

  public int sum_odd(int[] array) {
    int sum = 0;
    for (int num : array) {
      if (num % 2 != 0) {
        sum += num;
      }
    }
    return sum;
  }
}
