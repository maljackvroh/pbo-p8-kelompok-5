/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan8;

/**
 *
 * @author DINI AYUASTINA
 */
import java.util.Scanner;

abstract class Data {
    protected int panjang;
    protected int lebar;
    protected int hasil;

    public int luas(int p, int l) {
        this.panjang = p;
        this.lebar = l;
        return hasil;
    }
}

public class js2 extends Data {
    Scanner in = new Scanner(System.in);

    @Override
    public int luas(int panjang, int lebar) {
        System.out.println("Masukkan nilai");
        System.out.print("p: ");
        int p = in.nextInt();

        System.out.print("l: ");
        int l = in.nextInt();

        hasil = p * l;
        return hasil;
    }

    public static void main(String[] args) {
        js2 dat = new js2();

        System.out.println("Ini program mencari luas Persegi Panjang");

        dat.luas(0, 0);

        System.out.println("Hasil: " + dat.hasil);
    }
}
