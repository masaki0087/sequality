package org.example;

public class Calculate {
  public int getIndividualFee(int age) {
    if (age <= 12) {
      return 1000;
    } else {
      return 2000;
    }
  }
}
