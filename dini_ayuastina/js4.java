/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

abstract class Pil {
    Scanner in = new Scanner(System.in);

    public abstract void process();
}

public class js4 extends Pil {

    @Override
    public void process() {
        System.out.println("Berikut beberapa program yang dapat kamu lakukan: ");
        System.out.println("1. Say Hi");
        System.out.println("2. Say Bye");
        System.out.println("3. Say you love yourself");
        System.out.print("Pilih: ");

        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Hiii....");
                break;

            case 2:
                System.out.println("Bye bye!!");
                break;
            
            case 3:
                System.out.println("I love myself!!!!");
                break;

            default:
                System.out.println("Inputan salah");
                break;
        }
    }

    public static void main(String[] args) {
        js4 program = new js4();

        System.out.println("\nIni adalah program ini dh");
        program.process();
    }
}
