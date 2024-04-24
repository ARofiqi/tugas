package kasir;

import java.util.concurrent.atomic.AtomicInteger;

public class Product {

  private static final AtomicInteger count = new AtomicInteger(0);
  private int id;
  private String name;
  private String category;
  private double price;
  private double discount;

  public Product(String name, String category, double price, double discount) {
    this.id = count.incrementAndGet();
    this.name = name;
    this.category = category;
    this.price = price;
    this.discount = discount;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
  }

  public double getDiscount() {
    return this.discount;
  }

  public void getInfo() {
    System.out.println("ID           : " + this.id);
    System.out.println("Name         : " + this.name);
    System.out.println("Category     : " + this.category);
    System.out.println("Price        : " + this.price);
    System.out.println("Discount     : " + this.discount);
  }
}
