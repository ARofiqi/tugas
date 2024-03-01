public class Main {

  public static void main(String[] args) {
    S_SamaSisi a = new S_SamaSisi(4, 5);
    a.getInfo();

    S_SikuSiku b = new S_SikuSiku(4, 5, 8);
    b.getInfo();

    S_Sembarang c = new S_Sembarang(20, 14, 20);
    c.getInfo();

    Lingkaran lingkaran = new Lingkaran(5);
    lingkaran.getInfo();

    Persegi persegi = new Persegi(5);
    persegi.getInfo();

    PersegiPanjang persegiPanjang = new PersegiPanjang(5, 6);
    persegiPanjang.getInfo();
  }
}
