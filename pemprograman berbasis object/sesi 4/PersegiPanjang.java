class PersegiPanjang extends BangunDatar {

  public PersegiPanjang(double panjang, double lebar) {
    super.setName("Persegi Panjang");
    this.hitungLuas(panjang, lebar);
    this.hitungKeliling(panjang, lebar);
  }

  @Override
  public void getInfo() {
    System.out.println("\nInformasi Persegi Panjang :");
    super.getInfo();
  }

  public void hitungLuas(double panjang, double lebar) {
    super.luas = panjang * lebar;
  }

  public void hitungKeliling(double panjang, double lebar) {
    super.keliling = 2 * (panjang + lebar);
  }
}
