public class Lingkaran extends BangunDatar {

  public Lingkaran(double r) {
    super.setName("Lingkaran");
    this.hitungLuas(r);
    this.hitungKeliling(r);
  }

  @Override
  public void getInfo() {
    System.out.println("\nInformasi Lingkaran:");
    super.getInfo();
  }

  public void hitungLuas(double r){
    super.luas = Math.PI * r * r;
  }

  public void hitungKeliling(double r){
    super.keliling = 2 * Math.PI * r;
  }
}