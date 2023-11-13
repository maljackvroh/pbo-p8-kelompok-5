/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan8;
interface Macan {
    void macann();
}

interface Kucing {
    void kucingg();
}

interface Kumbang {
    void kumbangg();
}

interface Hiu {
    void hiuu();
}

interface Singa {
    void singaa();
}

interface Babi {
    void babi();
}

class Hewannn implements Macan, Kucing, Kumbang, Hiu, Singa, Babi {
    @Override
    public void macann() {
        System.out.println("Ini macan");
    }

    @Override
    public void kucingg() {
        System.out.println("Ini kucing");
    }

    @Override
    public void kumbangg() {
        System.out.println("Ini kumbang");
    }

    @Override
    public void hiuu() {
        System.out.println("Ini hiu");
    }

    @Override
    public void singaa() {
        System.out.println("Ini singa :)");
    }

    @Override
    public void babi() {
        System.out.println("Ini bukan sapi yaa XD");
    }
}

public class js8 {
    public static void main(String[] args) {
        Hewannn dat = new Hewannn();

        System.out.println("");
        dat.babi();
        dat.hiuu();
        dat.kucingg();
        dat.kumbangg();
        dat.macann();
        dat.singaa();
    }
}
