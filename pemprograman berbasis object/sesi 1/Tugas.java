public class Tugas {

  public static void main(String[] args) {
    System.out.println("Tugas Sesi 1 - Ahmad Rofiqi - 20220040159");

    // Konversi suhu dari reamur ke (celcius, fahrenheit dan kelvin)
    System.out.println(
      "\n1. Konversi suhu dari reamur ke (celcius, fahrenheit dan kelvin)"
    );
    double reamur = 10;
    double celcius = 0;
    double fahrenheit = 0;
    double kelvin = 0;
    System.out.println("Suhu Reamur \t\t= " + reamur + " deg");
    System.out.println("====== Diubah Menjadi ======");
    System.out.println("Suhu celcius \t\t= " + celcius + " deg");
    System.out.println("Suhu fahrenheit \t= " + fahrenheit + " deg");
    System.out.println("Suhu kelvin \t\t= " + kelvin + " deg");

    // Hitung umur berdasarkan tahun lahir
    System.out.println("\n2. Hitung umur berdasarkan tahun lahir");
    int tahunLahir = 2003;
    int tahunSekarang = 2024;
    int umur = tahunSekarang - tahunLahir;
    System.out.println("Tahun Lahir \t= " + tahunLahir);
    System.out.println("Tahun Sekarang \t= " + tahunSekarang);
    System.out.println("======= Hasil =======");
    System.out.println("Umur Sekarang \t= " + umur);

    // menghitung luas dan keliling segitiga
    int panjang = 10;
    int lebar = 5;
    int luas = panjang * lebar;
    int keliling = 4 * (panjang + lebar);
    System.out.println("\n3. menghitung luas dan keliling segitiga");
    System.out.println("Panjang\t\t= " + panjang);
    System.out.println("Lebar\t\t= " + lebar);
    System.out.println("======= Hasil =======");
    System.out.println("Luas\t\t= " + luas);
    System.out.println("Keliling\t= " + keliling);
  }
}
