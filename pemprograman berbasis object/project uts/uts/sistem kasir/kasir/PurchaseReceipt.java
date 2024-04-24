package kasir;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PurchaseReceipt {

  private String namaToko;
  private String alamat;
  private int nomorStruk;
  private Date tanggal;
  private ArrayList<Item> barang;
  private double totalHarga;
  private double totalDiskon;

  public PurchaseReceipt(String namaToko, String alamat) {
    this.namaToko = namaToko;
    this.alamat = alamat;
    this.nomorStruk = generateReceiptNumber();
    this.tanggal = new Date();
    this.barang = new ArrayList<>();
    this.totalHarga = 0;
    this.totalDiskon = 0;
  }

  public void addItem(String name, double price, int quantity) {
    boolean isExisting = false;
    for (Item item : barang) {
      if (item.getName().equals(name)) {
        item.setQuantity(item.getQuantity() + quantity);
        isExisting = true;
        break;
      }
    }
    if (!isExisting) {
      Item newItem = new Item(name, price, quantity);
      barang.add(newItem);
    }
    totalHarga += price * quantity;
  }

  public void removeItem(int index, int quantity) {
    if (index >= 0 && index < barang.size()) {
      Item currentItem = barang.get(index);
      if (currentItem.getQuantity() >= quantity) {
        currentItem.setQuantity(currentItem.getQuantity() - quantity);
        totalHarga -= currentItem.getPrice() * quantity;
        if (currentItem.getQuantity() == 0) {
          barang.remove(index);
        }
      } else {
        System.out.println(
          "Jumlah barang yang ingin dihapus melebihi jumlah yang tersedia."
        );
      }
    } else {
      System.out.println("Indeks tidak valid.");
    }
  }

  public void displayItems() {
    if (barang.size() > 0) {
      System.out.println("Barang yang dibeli:");
      int no = 1;
      for (Item item : barang) {
        System.out.println(
          String.format(
            "%d. %-35s Rp.%-10.2f x%d = Rp.%.2f",
            no,
            item.getName(),
            item.getPrice(),
            item.getQuantity(),
            item.getPrice() * item.getQuantity()
          )
        );
        no++;
      }
    } else {
      System.out.println("Tidak Ada barang yang dibeli");
    }
  }

  public void applyDiscount(double persentaseDiskon) {
    if (persentaseDiskon >= 0 && persentaseDiskon <= 100) {
      totalDiskon = totalHarga * persentaseDiskon / 100;
    } else {
      System.out.println("Diskon tidak valid.");
    }
  }

  public double getTotalHarga() {
    return this.totalHarga;
  }

  public void generateReceipt() {
    double totalAkhir = totalHarga - totalDiskon;
    System.out.println("=============== Struk Pembelian ===============");
    System.out.println("Nomor Struk : " + nomorStruk);
    System.out.println(
      "Tanggal     : " +
      new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(tanggal)
    );
    System.out.println("Nama Toko   : " + namaToko);
    System.out.println("Alamat      : " + alamat);
    System.out.println("-----------------------------------------");
    System.out.println("Barang yang dibeli :");
    for (Item item : barang) {
      System.out.println(
        String.format(
          "%-35s Rp.%-10.2f x%d",
          item.getName(),
          item.getPrice(),
          item.getQuantity()
        )
      );
    }
    System.out.println("-----------------------------------------");
    System.out.println("Total Pembayaran: Rp." + totalHarga);
    if (totalDiskon > 0) {
      System.out.println("Diskon: Rp." + totalDiskon);
      System.out.println("-----------------------------------------");
      System.out.println("Total Pembayaran setelah Diskon: Rp." + totalAkhir);
    }
    System.out.println("===========================================");
  }

  private int generateReceiptNumber() {
    return (int) (Math.random() * 1000000);
  }

  public int getLengthItems() {
    return barang.size();
  }

  private static class Item {

    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
      this.name = name;
      this.price = price;
      this.quantity = quantity;
    }

    public String getName() {
      return name;
    }

    public double getPrice() {
      return price;
    }

    public int getQuantity() {
      return quantity;
    }

    public void setQuantity(int quantity) {
      this.quantity = quantity;
    }
  }
}
