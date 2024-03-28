import geometri.*;
import shape.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Kalkulator Bangun Datar dan Bangun Ruang:");
        System.out.println("1. Segitiga Sama Sisi");
        System.out.println("2. Segitiga Sama Kaki");
        System.out.println("3. Segitiga Sembarang");
        System.out.println("4. Segitiga Siku-Siku");
        System.out.println("5. Persegi");
        System.out.println("6. Persegi Panjang");
        System.out.println("7. Lingkaran");
        System.out.println("8. Bola");
        System.out.println("9. Balok");
        System.out.println("10. Kubus");
        System.out.println("11. Tabung");
        System.out.println("0. Keluar");
        do {
            System.out.print("\nPilih objek (0-11): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan panjang sisi: ");
                    double sisi = scanner.nextDouble();
                    SegitigaSamaSisi a = new SegitigaSamaSisi(sisi);
                    a.getInfo();
                    break;
                case 2:
                    System.out.print("Masukkan panjang sisi yang sama: ");
                    double sisi1 = scanner.nextDouble();
                    System.out.print("Masukkan panjang sisi lain: ");
                    double sisi2 = scanner.nextDouble();
                    SegitigaSamaKaki b = new SegitigaSamaKaki(sisi1, sisi2);
                    b.getInfo();
                    break;
                case 3:
                    System.out.print("Masukkan panjang sisi pertama: ");
                    double sisiA = scanner.nextDouble();
                    System.out.print("Masukkan panjang sisi kedua: ");
                    double sisiB = scanner.nextDouble();
                    System.out.print("Masukkan panjang sisi ketiga: ");
                    double sisiC = scanner.nextDouble();
                    SegitigaSembarang c = new SegitigaSembarang(sisiA, sisiB, sisiC);
                    c.getInfo();
                    break;
                case 4:
                    System.out.print("Masukkan panjang alas: ");
                    double alas = scanner.nextDouble();
                    System.out.print("Masukkan panjang tinggi: ");
                    double tinggi = scanner.nextDouble();
                    SegitigaSikuSiku d = new SegitigaSikuSiku(alas, tinggi);
                    d.getInfo();
                    break;
                case 5:
                    System.out.print("Masukkan panjang sisi: ");
                    double sisiPersegi = scanner.nextDouble();
                    Persegi e = new Persegi(sisiPersegi);
                    e.getInfo();
                    break;
                case 6:
                    System.out.print("Masukkan panjang: ");
                    double panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double lebar = scanner.nextDouble();
                    PersegiPanjang f = new PersegiPanjang(panjang, lebar);
                    f.getInfo();
                    break;
                case 7:
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double jariJari = scanner.nextDouble();
                    Lingkaran k = new Lingkaran(jariJari);
                    k.getInfo();
                    break;
                case 8:
                    System.out.print("Masukkan jari-jari bola: ");
                    double jariJariBola = scanner.nextDouble();
                    Bola g = new Bola(jariJariBola);
                    g.getInfo();
                    break;
                case 9:
                    System.out.print("Masukkan panjang: ");
                    double panjangBalok = scanner.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double lebarBalok = scanner.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggiBalok = scanner.nextDouble();
                    Balok h = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                    h.getInfo();
                    break;
                case 10:
                    System.out.print("Masukkan panjang sisi kubus: ");
                    double sisiKubus = scanner.nextDouble();
                    Kubus i = new Kubus(sisiKubus);
                    i.getInfo();
                    break;
                case 11:
                    System.out.print("Masukkan jari-jari tabung: ");
                    double jariJariTabung = scanner.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    double tinggiTabung = scanner.nextDouble();
                    Tabung j = new Tabung(jariJariTabung, tinggiTabung);
                    j.getInfo();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        } while (choice != 0);
        scanner.close();
    }
}