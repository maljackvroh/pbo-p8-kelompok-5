
interface Mahasiswa {
    void setNama(String nama);

    void setNIM(String nim);

}

interface jurusan {
    void jurusan(String jurus);

    void displayInfo();
}

class KelasMahasiswa implements Mahasiswa, jurusan {
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
        System.out.println("Jurusan : " + jurusan);
    }

    @Override
    public void jurusan(String jurus) {
        this.jurusan = jurus;
    }
}

public class Mahasiswa2 {
    public static void main(String[] args) {
        KelasMahasiswa mahasiswa = new KelasMahasiswa();

        mahasiswa.setNama("Andi");
        mahasiswa.setNIM("Z1V099088");
        mahasiswa.jurusan("Teknik Pedang");
        System.out.println("Info Mahasiswa:");
        System.out.println("------------------------");
        mahasiswa.displayInfo();
    }
}
