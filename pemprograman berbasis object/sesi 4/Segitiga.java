class Segitiga {

  protected double alas;
  protected double tinggi;
  protected double luas;
  protected double keliling;
  protected String nama;

  public Segitiga(double alas, double tinggi) {
    this.alas = alas;
    this.tinggi = tinggi;
    this.nama = "Segitiga Sembarang";
    this.hitungLuas();
    this.hitungKeliling();
  }

  public Segitiga() {
    this.nama = "Segitiga Default";
    this.hitungLuas();
    this.hitungKeliling();
  }

  public void setNama(String value) {
    this.nama = value;
  }

  public double getKeliling() {
    return this.keliling;
  }

  public double getLuas() {
    return this.luas;
  }

  public void getInfo() {
    System.out.printf("Nama \t\t= %s\n", this.nama);
    System.out.printf("Keliling \t= %s\n", this.keliling);
    System.out.printf("Luas \t\t= %s\n", this.luas);
  }

  protected void hitungLuas() {
    this.luas = 0.5 * this.alas * this.tinggi;
  }

  protected void hitungKeliling() {
    this.keliling = this.alas + 2 * (Math.sqrt(Math.pow(this.alas / 2, 2) + Math.pow(this.tinggi, 2)));
  }
}

