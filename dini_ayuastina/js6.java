/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan8;
interface Buahh {
    void mthod();
}

interface Hewann {
    void mtthod();
}

interface Serangga {
    void srga();
}

class MakhlukHidupp implements Hewann, Buahh, Serangga {
    @Override
    public void mthod() {
        System.out.println("\nIni adalah buah");
    }

    @Override
    public void mtthod() {
        System.out.println("Ini adalah hewan");
    }

    @Override
    public void srga() {
        System.out.println("Ini adalah serangga!!");
    }
}

public class js6 {
    public static void main(String[] args) {
        MakhlukHidupp obj = new MakhlukHidupp();

        obj.mthod();
        obj.mtthod();
        obj.srga();
    }
}

