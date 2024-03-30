public class Main {
    public static void main(String[] args) {
        Mahasiswa rofiqi = new Mahasiswa("Ahmad Rofiqi", 123456);
        Mahasiswa chigi = new Mahasiswa("Chigi", 567890);

        DaftarMahasiswa daftarMahasiswa = new DaftarMahasiswa();
        daftarMahasiswa.tambah(rofiqi);
        daftarMahasiswa.tambah(chigi);

        daftarMahasiswa.cetakDaftar();

        // Menggunakan MahasiswaHashMap untuk menyimpan dan mengakses mahasiswa dengan HashMap
        MahasiswaHashMap mahasiswaHashMap = new MahasiswaHashMap();
        mahasiswaHashMap.tambah(1, rofiqi);
        mahasiswaHashMap.tambah(2, chigi);

        System.out.println("\nMahasiswa dengan NIM 123456:");
        Mahasiswa mhs = mahasiswaHashMap.getMahasiswa(1);
        System.out.println("Nama: " + mhs.getNama() + ", NIM: " + mhs.getNim());
    }
}
