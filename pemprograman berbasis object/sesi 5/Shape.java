public abstract class Shape {

  protected Double area;
  protected Double perimeter;
  protected String name;

  public void setName(String name) {
    this.name = name;
  }

  public void getInfo() {
    System.out.println("Name: " + name);
    System.out.println("Area: " + area);
    System.out.println("Perimeter: " + perimeter);
  }
}
