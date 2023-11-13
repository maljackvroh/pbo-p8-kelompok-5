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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

abstract class Sort {
    public ArrayList<Integer> data = new ArrayList<Integer>();

    public abstract void input();
}

public class js3 extends Sort {
    Scanner in = new Scanner(System.in);

    @Override
    public void input() {
        int x = 1;

        System.out.println("Masukkan banyak nilai yang ingin Anda masukkan: ");
        int pil = in.nextInt();
        do {
            System.out.print("Masukkan nilai ke " + x + " : ");
            data.add(in.nextInt());

            x++;
        } while (x <= pil);
    }

    public static void main(String[] args) {
        System.out.println("Ini adalah program mengurutkan nilai");
        js3 data = new js3();

        data.input();

        System.out.println("\nSetelah diurutkan, berikut nilai tersebut:");
        System.out.println("Before: " + data.data);
        Collections.sort(data.data);
        System.out.println("After: " + data.data);
    }
}
