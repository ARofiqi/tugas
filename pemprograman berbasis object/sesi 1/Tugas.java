import java.util.Scanner;

public class Tugas {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Tugas Sesi 1 - Ahmad Rofiqi - 20220040159");

    // Konversi suhu dari reamur ke (celcius, fahrenheit dan kelvin)
    System.out.println(
      "\n1. Konversi suhu dari reamur ke (celcius, fahrenheit dan kelvin)"
    );

    System.out.print("Masukkan suhu reamur : ");
    double reamur = scanner.nextDouble();
    double celcius = (5 / 4) * reamur;
    double fahrenheit = ((9 / 4) * reamur) + 32;
    double kelvin = celcius + 273.15;

    System.out.println("Suhu Reamur \t\t= " + reamur + " R");
    System.out.println("====== Diubah Menjadi ======");
    System.out.println("Suhu celcius \t\t= " + celcius + " C");
    System.out.println("Suhu fahrenheit \t= " + fahrenheit + " F");
    System.out.println("Suhu kelvin \t\t= " + kelvin + "K");

    // Hitung umur berdasarkan tahun lahir
    System.out.println("\n2. Hitung umur berdasarkan tahun lahir");

    System.out.print("Masukkan Tahun Lahir : ");
    int tahunLahir = scanner.nextInt();
    System.out.print("Masukkan Tahun Sekarang : ");
    int tahunSekarang = scanner.nextInt();

    int umur = tahunSekarang - tahunLahir;
    System.out.println("Tahun Lahir \t= " + tahunLahir);
    System.out.println("Tahun Sekarang \t= " + tahunSekarang);
    System.out.println("======= Hasil =======");
    System.out.println("Umur Kamu Sekarang " + umur + " Tahun");

    // menghitung luas dan keliling segitiga
    System.out.println("\n3. menghitung luas dan keliling segitiga");
    System.out.print("Masukkan Alas : ");
    int alas = scanner.nextInt();
    System.out.print("Masukkan Tinggi : ");
    int tinggi = scanner.nextInt();
    System.out.print("Masukkan Sisi 1 : ");
    int sisi1 = scanner.nextInt();
    System.out.print("Masukkan Sisi 2 : ");
    int sisi2 = scanner.nextInt();
    System.out.print("Masukkan Sisi 3 : ");
    int sisi3 = scanner.nextInt();

    double luas = (alas * tinggi) / 2;
    int keliling = sisi1 + sisi2 + sisi3;

    System.out.println("Alas\t\t= " + alas);
    System.out.println("Tinggi\t\t= " + tinggi);
    System.out.println("======= Hasil =======");
    System.out.println("Luas\t\t= " + luas);
    System.out.println("Keliling\t= " + keliling);

    scanner.close();
  }
}
