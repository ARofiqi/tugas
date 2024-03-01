class PersegiPanjang extends BangunDatar {

  public PersegiPanjang(double panjang, double lebar) {
    super.setName("Persegi Panjang");
    this.hitungLuas(panjang, lebar);
    this.hitungKeliling(panjang, lebar);
  }

  public void hitungLuas(double panjang, double lebar) {
    super.luas = panjang * lebar;
  }

  public void hitungKeliling(double panjang, double lebar) {
    super.keliling = 2 * (panjang + lebar);
  }
}
