public class Tugas5 {

  public String name = "Ahmad Rofiqi";
  protected int age = 20;
  private String nim = "0";

  public void setNim(String value) {
    this.nim = value;
  }

  public String getNim() {
    return this.nim;
  }

  public void saySalam() {
    System.out.println("Assalamualaikum");
  }

  public static void main(String[] args) {
    Tugas5 obj = new Tugas5();

    obj.saySalam();
    System.out.println("Public Variable -> name : " + obj.name);
    System.out.println("Protected Variable --> age : " + obj.age);
    obj.setNim("20220040159");
    System.out.println(
      "Private Variable (Access Modifier) --> nim : " + obj.getNim()
    );

  }
}
