import java.util.HashMap;
import java.util.Map;

class MahasiswaHashMap {
    private Map<Integer, Mahasiswa> mahasiswaMap = new HashMap<>();

    public void tambah(int id, Mahasiswa mahasiswa) {
        mahasiswaMap.put(id, mahasiswa);
    }

    public Mahasiswa getMahasiswa(int id) {
        return mahasiswaMap.get(id);
    }
}