package by.lalacompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

  @Test
  public void shouldAnswerWithTrue() {
    assertTrue(true);
  }

  //array of integers
  @Test
  public void testSumPositiveInt() {
    double result = App.sumPositive(new double[] {1, 2, 3, 4, 5,-1,-2,-3});
    assertEquals(result, 15,10^-5);
  }

  //array of double
  @Test
  public void testSumPositiveDouble() {
    double result = App.sumPositive(new double[] {-0.1, -0.25243, 2.3243242, 4.2132, 5.12321});
    assertEquals(result, 11.6607342,10^-8);
  }

  //random array
  @Test
  public void testSumPositiveAll() {
    double result = App.sumPositive(new double[] {23, -232, 0.2312, 15, -0.3213, 0.2281337, 0});
    assertEquals(result, 38.4593337,10^-7);
  }

  //empty array 
  @Test
  public void testSumPositiveEmpty() {
    double result = App.sumPositive(new double[] {});
    assertEquals(result,0,10^-7);
  }

  //array of negative
  @Test
  public void testSumPositiveNegative() {
    double result = App.sumPositive(new double[] {-1, -2, -3, -4, -5});
    assertEquals(result, 0,10^-7);
  }

}
