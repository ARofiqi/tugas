public class Main {

  public static void main(String[] args) {
    double sisi_a = 5;
    S_SamaSisi a = new S_SamaSisi(sisi_a);
    a.getInfo();
    
    double alas_b = 6;
    double tinggi_b = 15;
    S_SikuSiku b = new S_SikuSiku(alas_b, tinggi_b);
    b.getInfo();

    double alas_d = 8;
    double sisiMiring_d = 15;
    S_SamaKaki d = new S_SamaKaki(alas_d, sisiMiring_d);
    d.getInfo();
    
    double sisi_1c = 5;
    double sisi_2c = 10;
    double sisi_3c = 8;
    S_Sembarang c = new S_Sembarang(sisi_1c, sisi_2c, sisi_3c);
    c.getInfo();

    double ruas = 5;
    Lingkaran lingkaran = new Lingkaran(ruas);
    lingkaran.getInfo();
    
    double sisiPersegi = 5;
    Persegi persegi = new Persegi(sisiPersegi);
    persegi.getInfo();
    
    double panjang = 5;
    double lebar = 14;
    PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
    persegiPanjang.getInfo();
  }
}
