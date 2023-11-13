
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
    public void display() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

public class Mahasiswa2 {
    public static void main(String[] args) {
        KelasMahasiswa a = new KelasMahasiswa();

        a.setNama("Andi");
        a.setNIM("Z1V099088");

        System.out.println("Info Mahasiswa:");
        System.out.println("------------------------");
        mahasiswa.display();
    }
}
