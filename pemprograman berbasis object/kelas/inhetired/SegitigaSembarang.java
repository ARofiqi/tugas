public class SegitigaSembarang extends BangunDatar {

  public SegitigaSembarang(
    double sisi1,
    double sisi2,
    double sisi3
  ) {
    super.setName("Segitiga Sembarang");
    this.hitungLuas(sisi1, sisi2, sisi3);
    this.hitungKeliling(sisi1, sisi2, sisi3);
  }

  public void hitungLuas(double sisi1, double sisi2, double sisi3) {
    double s = (sisi1 + sisi2 + sisi3)*0.5;
    super.luas = Math.sqrt((s*(s-sisi1)*(s-sisi2)*(s-sisi3)));
  }

  public void hitungKeliling(double sisi1, double sisi2, double sisi3) {
    super.keliling = sisi1 + sisi2 + sisi3;
  }
}
