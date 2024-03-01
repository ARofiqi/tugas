class S_SikuSiku extends Segitiga {

  public S_SikuSiku(double alas, double tinggi, double sisiMiring) {
    super.setNama("Segitiga Siku Siku / Sama Kaki");
    this.hitungLuas(alas, tinggi);
    this.hitungKeliling(alas, sisiMiring);
  }

  public void hitungLuas(double alas, double tinggi) {
    this.luas = 0.5 * alas * tinggi;
  }

  public void hitungKeliling(double alas, double sisiMiring) {
    this.keliling = 2 * sisiMiring + alas;
  }
}
