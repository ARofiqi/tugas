public class Mahasiswa<T> {
    private String nama;
    private T nim;

    public Mahasiswa (String nama, T nim) {
        this.nama = nama;
        this.nim = nim;
    }
    
    public void info() {
        System.out.println("Nama: "+ nama);
        System.out.println("NIM: "+ nim);
    }
}