class S_SamaKaki extends Segitiga {
  
  public S_SamaKaki(double alas, double sisiMiring) {
    super.setNama("Segitiga Sama Kaki");
    this.hitungLuas(alas, sisiMiring);
    this.hitungKeliling(alas, sisiMiring);
  }

  @Override
  public void getInfo() {
    System.out.println("\nInformasi Segitiga Sama Kaki:");
    super.getInfo();
  }

  public void hitungLuas(double alas, double sisiMiring) {
    double s = (2 * sisiMiring + alas) / 2;
    this.luas = Math.sqrt(s * (s - sisiMiring) * (s - sisiMiring) * (s - alas));
  }

  public void hitungKeliling(double alas, double sisiMiring) {
    this.keliling = 2 * sisiMiring + alas;
  }
}
