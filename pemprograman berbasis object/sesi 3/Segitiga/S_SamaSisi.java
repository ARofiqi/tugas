class S_SamaSisi extends Segitiga {

  public S_SamaSisi(double alas, double tinggi) {
    super.setNama("Segitiga Sama Sisi");
    this.hitungLuas(alas, tinggi);
    this.hitungKeliling(alas);
  }

  public void hitungLuas(double alas, double tinggi) {
    this.luas = 0.5 * alas * tinggi;
  }

  public void hitungKeliling(double alas) {
    this.keliling = 3 * alas;
  }
}
