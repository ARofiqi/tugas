public class Main {

  public static void main(String[] args) {
    RightTriangle ABC = new RightTriangle("ABC", 3.0, 4.0);
    Triangle BCD = new RightTriangle("BCD", 3.0, 4.0);
    Triangle CDE = new Triangle("CDE", 3.0, 4.0, 5.0);

    ABC.getInfo();
    BCD.getInfo();
    CDE.getInfo();
  }
}
