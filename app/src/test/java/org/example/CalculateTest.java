package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testGetIndividualFee_10() {
    Calculate calculate = new Calculate();
    int expected = 1000;
    assertEquals(expected, calculate.getIndividualFee(10));
  }

  @Test
  public void testGetIndividualFee_25() {
    Calculate calculate = new Calculate();
    int expected = 2000;
    assertEquals(expected, calculate.getIndividualFee(25));
  }

  @Test
  public void testGetTotalFee_10_1() {
    Calculate calculate = new Calculate();
    int expected = 1000;
    assertEquals(expected, calculate.getTotalFee(10, 1));
  }

  @Test
  public void testGetTotalFee_25_1() {
    Calculate calculate = new Calculate();
    int expected = 2000;
    assertEquals(expected, calculate.getTotalFee(25, 1));
  }

  @Test
  public void testGetTotalFee_10_15() {
    Calculate calculate = new Calculate();
    int expected = 13500;
    assertEquals(expected, calculate.getTotalFee(10, 15));
  }

}
