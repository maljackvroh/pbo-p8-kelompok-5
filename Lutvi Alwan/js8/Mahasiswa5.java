
interface nama {
    void setNama(String nama);

}

interface nim {
    void setNIM(String nim);

    void displayInfo();
}

class KelasMahasiswa implements nama, nim {
    private String nama;
    private String nim;
    private String jurusan;

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

public class Mahasiswa5 {
    public static void main(String[] args) {
        KelasMahasiswa2 a = new KelasMahasiswa2();
        KelasMahasiswa2 b = new KelasMahasiswa2();
        a.setNama("Andi");
        a.setNIM("Z1C020034");
        a.setJurusan("Teknik Nuklir");
        b.setNama("Aldi");
        b.setNIM("Z1B020034");
        b.setJurusan("teknik pedang");
        System.out.println("Info Mahasiswa:");
        System.out.println("------------------------");
        a.displayInfo();
        a.displayJurusan();
        System.out.println("------------------------");
        b.displayInfo();
        b.displayJurusan();

    }
}
