package studi_kasus;

/*Buatlah aplikasi kalkulator menggunakan konsep multiple inheritance menggunakan
interface. Kalkulator tersebut terdiri dari 5 fitur yaitu menghitung penjumlahan,
pengurangan, perkalian, pembagian, perpangkatan dan akar kuadrat. Program dibuat
secara dinamis dengan menu pilihan dapat menggunakan condition dan if statement
maupun swith case */

import java.util.Scanner;

public class stdkasus extends proces{

    public static void main(String[] args) {
        stdkasus data = new stdkasus();
        Scanner in = new Scanner(System.in);

        double a,b;

        System.out.println("\nIni adalah program kalkulator sederhana");
        System.out.println("Berikut proses yang dapat kamu lakukan:");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Bagi");
        System.out.println("4. Kali");
        System.out.println("5. Akar");
        System.out.println("6. Pangkat");
        System.out.print("Pilih: ");
        int pilih = in.nextInt();

        
        switch (pilih) {
            case 1:
                System.out.println("Masukan nilai 1: ");
                a = in.nextDouble();
                System.out.println("Masukan nilai 2: ");
                b = in.nextDouble();
                System.out.println("Hasil: "+data.tambah(a, b));
                break;
            case 2:
                System.out.println("Masukan nilai 1: ");
                a = in.nextDouble();
                System.out.println("Masukan nilai 2: ");
                b = in.nextDouble();
                System.out.println("Hasil: "+data.kurang(a, b));
                break;
            case 3:
                System.out.println("Masukan nilai 1: ");
                a = in.nextDouble();
                System.out.println("Masukan nilai 2: ");
                b = in.nextDouble();
                System.out.println("Hasil: "+data.bagi(a, b));
                break;
            case 4:
                System.out.println("Masukan nilai 1: ");
                a = in.nextDouble();
                System.out.println("Masukan nilai 2: ");
                b = in.nextDouble();
                System.out.println("Hasil: "+data.kali(a, b));
                break;
            case 5:
                System.out.println("Masukan nilai 1: ");
                a = in.nextDouble();
                System.out.println("Hasil: "+data.akar(a));
                break;
            case 6:
                System.out.println("Masukan nilai 1: ");
                a = in.nextDouble();
                System.out.println("Masukan nilai 2: ");
                b = in.nextDouble();
                System.out.println("Hasil: "+data.pangkat(a, b));
                break;

            default:
                break;
        }
    }
}
