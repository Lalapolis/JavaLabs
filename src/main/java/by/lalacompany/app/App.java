package by.lalacompany.app;

public class App {

  public static double sumPositive(double[] array) {
    double sum = 0.0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > 0) {
        sum += array[i];
      }
    }
    return sum;
  }
}
