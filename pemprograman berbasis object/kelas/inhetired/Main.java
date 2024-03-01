public class Main {

  public static void main(String[] args) {
    Lingkaran lingkaran = new Lingkaran(5);
    lingkaran.getInfo();

    Persegi persegi = new Persegi(5);
    persegi.getInfo();

    PersegiPanjang persegiPanjang = new PersegiPanjang(5, 6);
    persegiPanjang.getInfo();

    SegitigaSembarang segitigaSembarang = new SegitigaSembarang(15, 20, 14);
    segitigaSembarang.getInfo();

    SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi(6, 13);
    segitigaSamaSisi.getInfo();

    SegitigaSamaKaki segitigaSamaKaki = new SegitigaSamaKaki(6, 13, 6);
    segitigaSamaKaki.getInfo();
  }
}
