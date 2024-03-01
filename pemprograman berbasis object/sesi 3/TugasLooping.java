import java.util.ArrayList;

public class TugasLooping {

  public static void main(String[] args) {
    // Saya semangat belajar java (sebanyak 10 baris)
    System.out.println("\nNo 1");
    for (int i = 0; i < 10; i++) {
      System.out.println((i + 1) + " Saya semangat belajar java");
    }

    // Buatlah looping deret angka : 2 4 6 8 10
    ArrayList<Integer> deretGenap = new ArrayList<Integer>();
    System.out.println("\n\nNo 2");
    for (int i = 0; i <= 10; i += 2) {
      deretGenap.add(i);
    }
    System.out.println(deretGenap);

    // Buatlah looping deret angka : 9 6 3 0 -3 -6 9
    ArrayList<Integer> deret3 = new ArrayList<Integer>();
    System.out.println("\nNo 3");
    int x = 9;
    for (int i = x; i >= -x; i -= 3) {
      deret3.add(i);
    }
    System.out.println(deret3);

    // Buatlah looping untuk perkalian dengan output dibawah ini
    // 5 x 6 = 30
    // 5 x 7 = 35
    // 5 x 8 = 40
    // 5 x 9 = 45
    // 5 x 10 = 50
    System.out.printf("\nNo 4");
    int y = 5;
    for (int i = 1; i < 10; i++) {
      System.out.printf("\n%s + %s = %s", y, i, (y * i));
    }

    // Buatlah looping untuk deret angka : 1 3 6 10 15 21 28 36
    ArrayList<Integer> deret5 = new ArrayList<Integer>();
    System.out.println("\n\nNo5");
    int a = 0;
    for (int i = 1; i < 10; i++) {
      deret5.add(i + a);
      a += i;
    }
    System.out.println(deret5);
  }
}
