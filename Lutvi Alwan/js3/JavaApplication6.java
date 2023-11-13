import java.util.Scanner;

abstract class Abstrack {
    public abstract void ulang(int p);
}

public class JavaApplication6 extends Abstrack {
    @Override
    public void ulang(int p) {
        for (int i = 0; i < p; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p;

        System.out.println("Masukkan tinggi segitiga: ");
        p = in.nextInt();

        JavaApplication6 a = new JavaApplication6();
        a.ulang(p);
    }
}
