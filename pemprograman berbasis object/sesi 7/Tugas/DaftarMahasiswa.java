import java.util.ArrayList;
import java.util.List;

class DaftarMahasiswa {
    private List<Mahasiswa> daftar = new ArrayList<>();

    public void tambah(Mahasiswa mahasiswa) {
        daftar.add(mahasiswa);
    }

    public void cetakDaftar() {
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mhs : daftar) {
            System.out.println("Nama: " + mhs.getNama() + ", NIM: " + mhs.getNim());
        }
    }
}