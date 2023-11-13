package js3;

import java.util.Collections;
import java.util.Scanner;

public class JS3 extends sort{
    Scanner in = new Scanner(System.in);

    @Override
    public void input() {
        int x = 1;

        System.out.println("Masukan banyak nilai yang ingin anda masukan: ");
        int pil = in.nextInt();
        do{
            System.out.print("Masukan nilai ke "+x+" : ");
            dat.add(in.nextInt());

            x++;

        } while(x <= pil);
    }
    public static void main(String[] args) {

        System.out.println("Ini adalah program mengurutkan nilai");
        JS3 data = new JS23();

        data.input();

        System.out.println("\nSetelah diurutkan berikut nilai tsb:");
        System.out.println("Before: "+data.dat);
        Collections.sort(data.dat);
        System.out.println("After: "+data.dat);
    }
}