public class Calculation {

  public static int add(int a, int b) {
    return a + b;
  }

  public int add(Double c, int d) {
    int x = (int) c.doubleValue();
    return x + d;
  }

  public int add(int a, int b, int c) {
    return a + b + c;
  }

  public double add(double a, double b) {
    return a + b;
  }

  public double add(double a, double b, double c) {
    return a + b + c;
  }
}
