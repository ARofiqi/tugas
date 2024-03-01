public class SegitigaSamaSisi extends BangunDatar {

  public SegitigaSamaSisi(double alas, double tinggi) {
    super.setName("SegitigaSamaSisi");
    this.hitungLuas(alas, tinggi);
    this.hitungKeliling(alas);
  }

  public void hitungLuas(double alas, double tinggi) {
    super.luas = 0.5 * alas * tinggi;
  }

  public void hitungKeliling(double alas) {
    super.keliling = alas * 3;
  }
}
