import java.util.ArrayList;
import java.util.Scanner;
import kasir.*;

public class App {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    PurchaseReceipt kasirWarung = new PurchaseReceipt(
      "Warung Pak Rofiqi",
      "Jl. caringin - cikukulu No. 4"
    );

    Inventory inventory = new Inventory();
    inventory.add(
      new Product("Sabun Mandi Lifebuoy 100ml", "Perawatan", 5000, 0)
    );
    inventory.add(
      new Product("Pasta Gigi Pepsodent 75g", "Perawatan", 7000, 0)
    );
    inventory.add(new Product("Shampo Clear 170ml", "Perawatan", 12000, 0));
    inventory.add(
      new Product("Deodoran Rexona Roll-On 50ml", "Perawatan", 15000, 0)
    );
    inventory.add(
      new Product("Masker Wajah Garnier Light 32g", "Perawatan", 10000, 0)
    );
    inventory.add(
      new Product("Indomie Rasa Soto Mie 75g", "Makanan Instan", 2500, 0)
    );
    inventory.add(
      new Product("Telur Ayam Kampung 10 Butir", "Telur", 15000, 0)
    );
    inventory.add(
      new Product("Gula Pasir Gula Gulaku 1kg", "Bahan Pokok", 12000, 0)
    );
    inventory.add(new Product("Kecap Manis ABC 275ml", "Bumbu Masak", 5000, 0));
    inventory.add(new Product("Teh Celup Sariwangi 50s", "Minuman", 10000, 0));

    while (true) {
      clearTerminal();
      System.out.println("======== Sistem Aplikasi Kasir ========");
      System.out.println("1. Menambahkan Produk Ke Keranjang");
      System.out.println("2. Menghapus Produk Dari Keranjang");
      System.out.println("3. Menampilkan Keranjang");
      System.out.println("4. Checkout");
      System.out.println("5. Inventory Produk");
      System.out.println("0. Keluar");
      System.out.print("\nPilih : ");

      try {
        int option = scanner.nextInt();

        switch (option) {
          case 1:
            inventory.display();
            String loop;
            do {
              System.out.print("\nMasukan nomor produk : ");
              int id = scanner.nextInt();

              System.out.print("Masukan jumlah produk : ");
              int amount = scanner.nextInt();

              Product product = inventory.getById(id);

              try {
                kasirWarung.addItem(
                  product.getName(),
                  product.getPrice(),
                  amount
                );
                System.out.println(
                  "Berhasil Menambahkan " + product.getName() + " x" + amount
                );
              } catch (Exception e) {
                System.out.println("Gagal Menambahkan");
              }

              System.out.print("\nLagi(y/n) > ");
              loop = scanner.next();
            } while (loop.equals("y"));

            break;
          case 2:
            kasirWarung.displayItems();
            if (kasirWarung.getLengthItems() > 0) {
              System.out.println("0. kembali");
              System.out.print("\nMasukan nomor produk yang ingin dihapus : ");
              int indexToRemove = scanner.nextInt();
              System.out.print("Masukan jumlah produk yang ingin dihapus : ");
              int quantityToRemove = scanner.nextInt();
              if (indexToRemove == 0) {
                break;
              }

              try {
                kasirWarung.removeItem((indexToRemove - 1), quantityToRemove);
                System.out.println("Berhasil Menghapus ");
              } catch (Exception e) {
                System.out.println("Gagal Menghapus");
              }
            }
            break;
          case 3:
            kasirWarung.displayItems();
            break;
          case 4:
            if (kasirWarung.getLengthItems() > 0) {
              if (kasirWarung.getTotalHarga() > 100000) {
                kasirWarung.applyDiscount(10);
              }
              kasirWarung.generateReceipt();
              System.out.println("Terima Kasih Telah Berbelanja Di Toko Kami");
            } else {
              System.out.println(
                "Anda belum menambahkan produk kedalam keranjang"
              );
            }
            break;
          case 5:
            inventory.display();
            break;
          case 0:
            System.out.println("Keluar ...");
            return;
          default:
            System.out.println("Kesalahan Pemilihan!");
        }
      } catch (Exception e) {
        System.out.println("Kesalahan Pemilihan!");
      }

      System.out.print("\nEnter > ");
      scanner.nextLine();
      scanner.nextLine();
    }
  }

  public static void clearTerminal() {
    try {
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
