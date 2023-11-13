
interface Mahasiswa {
    void setNama(String nama);

    void setNIM(String nim);

    void displayInfo();
}

class KelasMahasiswa implements Mahasiswa {
    private String nama;
    private String nim;

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void setNIM(String nim) {
        this.nim = nim;
    }

    @Override
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

class KelasMahasiswa2 extends KelasMahasiswa {
    private String jurusan;

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void displayJurusan() {
        System.out.println("Jurusan: " + jurusan);
    }
}

public class Mahasiswa1 {
    public static void main(String[] args) {
        KelasMahasiswa2 a = new KelasMahasiswa2();
        KelasMahasiswa ab = new KelasMahasiswa();
        ab.setNama("Andi");
        ab.setNIM("Z1C020034");

        a.setJurusan("Teknik Nuklir");

        System.out.println("Info Mahasiswa:");
        System.out.println("------------------------");
        ab.displayInfo();
        a.displayJurusan();
    }
}
