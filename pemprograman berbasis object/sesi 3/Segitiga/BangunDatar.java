public class BangunDatar {

  protected String name;
  protected double keliling;
  protected double luas;

  public void getInfo() {
    System.out.printf("\nName \t\t= %s\n", this.name);
    System.out.printf("Keliling \t= %s\n", this.keliling);
    System.out.printf("Luas \t\t= %s\n", this.luas);
  }

  public String getName() {
    return this.name;
  }

  public double getKeliling() {
    return this.keliling;
  }

  public double getLuas() {
    return this.luas;
  }

  public void setName(String value) {
    this.name = value;
  }
}
