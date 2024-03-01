public class SegitigaSamaKaki extends BangunDatar {

    public SegitigaSamaKaki(
      double alas,
      double tinggi,
      double sisiMiring
    ) {
      super.setName("Segitiga Sama Kaki");
      this.hitungLuas(alas, tinggi);
      this.hitungKeliling(alas, sisiMiring);
    }
  
    public void hitungLuas(double alas, double tinggi) {
      super.luas = alas * tinggi;
    }
  
    public void hitungKeliling(double alas, double sisiMiring) {
      super.keliling = alas + sisiMiring*2;
    }
  }
  