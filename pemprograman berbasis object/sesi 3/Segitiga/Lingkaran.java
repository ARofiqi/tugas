public class Lingkaran extends BangunDatar {

  public Lingkaran(double r) {
    super.setName("Lingkaran");
    this.hitungLuas(r);
    this.hitungKeliling(r);
  }

  public void hitungLuas(double r){
    super.luas = 3.14 * r * r;
  }

  public void hitungKeliling(double r){
    super.keliling = 2 * 3.14 * r;
  }
}
