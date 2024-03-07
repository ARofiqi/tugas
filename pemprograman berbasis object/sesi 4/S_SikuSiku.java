class S_SikuSiku extends Segitiga {

  public S_SikuSiku(double alas, double tinggi) {
    super.setNama("Segitiga Siku Siku");
    this.hitungLuas(alas, tinggi);
    this.hitungKeliling(alas, tinggi);
  }

  @Override
  public void getInfo() {
    System.out.println("\nInformasi Segitiga Siku Siku:");
    super.getInfo();
  }

  public void hitungLuas(double alas, double tinggi) {
    this.luas = 0.5 * alas * tinggi;
  }

  public void hitungKeliling(double alas, double tinggi) {
    this.keliling =
      alas + tinggi + Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
  }
}
