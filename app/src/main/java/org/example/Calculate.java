package org.example;

public class Calculate {
  public int getIndividualFee(int age) {
    if (age <= 12) {
      return 1000;
    } else {
      return 2000;
    }
  }

  public int getTotalFee(int age, int groupSize) {
    int individualFee = getIndividualFee(age);

    if (groupSize >= 10) {
      return individualFee * groupSize * 9 / 10;
    } else {
      return individualFee * groupSize;
    }
  }
}
