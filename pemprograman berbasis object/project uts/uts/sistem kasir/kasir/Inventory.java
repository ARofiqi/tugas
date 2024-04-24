package kasir;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

  private List<Product> productList;

  public Inventory() {
    productList = new ArrayList<>();
  }

  public void add(Product product) {
    productList.add(product);
  }

  public void remove(Product product) {
    productList.remove(product);
  }

  public Product getById(int id) {
    for (Product product : productList) {
      if (product.getId() == id) {
        return product;
      }
    }
    return null;
  }

  public void display() {
    System.out.println("Inventory Barang :");
    for (Product product : productList) {
      System.out.println(
        String.format(
          "%d. %-35s - Rp.%,.2f",
          product.getId(),
          product.getName(),
          product.getPrice()
        )
      );
    }
  }
}
