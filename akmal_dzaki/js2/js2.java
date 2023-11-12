package akmal_dzaki.js2;

import java.util.Scanner;

public class js2 extends data{
    Scanner in = new Scanner(System.in);

    @Override
    public int luas(int panjang, int lebar) {

        System.out.println("Masukan nilai");
        System.out.print("p: ");
        int p = in.nextInt();

        System.out.print("l: ");
        int l = in.nextInt();

        hasil = p*l;
        return hasil;
    }

    public static void main(String[] args) {
        js2 dat = new js2();

        System.out.println("ini program mencari luas Persegi Panjang");
        
        dat.luas(0, 0);

        System.out.println("Hasil: "+dat.hasil);
    }
}
