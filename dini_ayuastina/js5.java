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

interface Buah {
    void mthod();
}

interface Hewan {
    void mtthod();
}

class MakhlukHidup implements Hewan, Buah {
    @Override
    public void mthod() {
        System.out.println("Ini adalah buah");
    }

    @Override
    public void mtthod() {
        System.out.println("Ini adalah hewan");
    }
}

public class js5 {
    public static void main(String[] args) {
        MakhlukHidup obj = new MakhlukHidup();

        obj.mthod();
        obj.mtthod();
    }
}
