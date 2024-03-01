import java.util.Scanner;

public class Tugas {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Triangel a = new Triangel(10, 20);

    double luas = a.getLuas();
    int alas = a.getAlas();
    int tinggi = a.getTinggi();

    System.out.println("====== MENGHITUNG LUAS SEGITIGA ======");
    System.out.println("Alas    = " + alas);
    System.out.println("Tinggi  = " + tinggi);
    System.out.println("Luas    = " + luas);

    System.out.println("");
    System.out.println("====== PROGRAM PEMBELIAN BUKU ======");
    System.out.println(
      "1. The Art Of Thinking Clearly - Rolf Dobelli - Rp.90.000"
    );
    System.out.println(
      "2. The Appeal Of Psychoanalysis - Anthony Storr - Rp.85.000"
    );
    System.out.println(
      "3. Berani Bahagia - Ichiro Kishimi & Fumitake Koga - Rp.95.000"
    );
    System.out.println(
      "4. Hidup Mininalis Ala Orang Jepang - Fumio Sasaki - Rp.78.000"
    );
    System.out.println("5. Start With Why - Simon Sinek - Rp.140.000");

    Books buku1 = new Books(
      "Rolf Dobelli",
      "The Art Of Thinking Clearly",
      90000,
      "978-602-424-406-4"
    );
    Books buku2 = new Books(
      "Anthony Storr",
      "The Appeal Of Psychoanalysis",
      85000,
      "978-602-6486-59-2"
    );
    Books buku3 = new Books(
      "Ichiro Kishimi & Fumitake Koga",
      "Berani Bahagia",
      95000,
      "978-602-06-4770-8"
    );
    Books buku4 = new Books(
      "Fumio Sasaki",
      "Hidup Mininalis Ala Orang Jepang",
      78000,
      "978-602-03-9840-2"
    );
    Books buku5 = new Books(
      "Simon Sinek",
      "Start With Why",
      140000,
      "978-1-59184-280-4 1"
    );

    int total = buku4.getPrice() + buku5.getPrice() + buku3.getPrice();

    System.out.println("\nSaya membeli 3 buku berjudul ");
    System.out.println("\t> Hidup minimalis ala orang jepang");
    System.out.println("\t> Start With Why");
    System.out.println("\t> Berani bahagia");
    System.out.println("Total harga yang harus saya bayar ialah Rp." + total);
  }
}

class Triangel {

  private int alas;
  private int tinggi;

  public Triangel(int alas, int tinggi) {
    this.alas = alas;
    this.tinggi = tinggi;
  }

  public void setAlas(int value) {
    this.alas = value;
  }

  public void setTinggi(int value) {
    this.tinggi = value;
  }

  public int getAlas() {
    return this.alas;
  }

  public int getTinggi() {
    return this.tinggi;
  }

  public double getLuas() {
    return 0.5 * this.alas * this.tinggi;
  }
}

class Books {

  private String author;
  private String title;
  private int price;
  private String publisherNumber;

  public Books(String author, String title, int price, String publisherNumber) {
    this.author = author;
    this.title = title;
    this.price = price;
    this.publisherNumber = publisherNumber;
  }

  public void setAuthor(String value) {
    this.author = value;
  }

  public void setTitle(String value) {
    this.title = value;
  }

  public void setPrice(int value) {
    this.price = value;
  }

  public void setPublisherNumber(String value) {
    this.publisherNumber = value;
  }

  public String getAuthor() {
    return this.author;
  }

  public String getTitle() {
    return this.title;
  }

  public int getPrice() {
    return this.price;
  }

  public String getPublisherNumber() {
    return this.publisherNumber;
  }
}
