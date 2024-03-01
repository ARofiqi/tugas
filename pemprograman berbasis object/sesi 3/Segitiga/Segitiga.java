class Segitiga {

  protected double alas;
  protected double tinggi;
  protected double luas;
  protected double keliling;
  protected String nama;

  public void setNama(String value) {
    this.nama = value;
  }

  public double getKeliling(double value) {
    return this.keliling;
  }

  public double getLuas(double value) {
    return this.luas;
  }

  public void getInfo() {
    System.out.printf("\nNama \t\t= %s\n", this.nama);
    System.out.printf("Keliling \t= %s\n", this.keliling);
    System.out.printf("Luas \t\t= %s\n", this.luas);
  }
}
