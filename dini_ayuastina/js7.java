/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan8;

abstract class Sun {
    public void display() {
        System.out.println("Ini adalah pusat tata surya");
    }
}

interface Earth {
    void showE();
}

interface Mars {
    void showM();
}

public class js7 extends Sun implements Earth, Mars {

    @Override
    public void display() {
        System.out.println("Ini adalah matahari");
    }

    @Override
    public void showE() {
        System.out.println("Ini adalah implementasi bumi");
    }

    @Override
    public void showM() {
        System.out.println("Ini adalah implementasi mars");
    }

    public static void main(String[] args) {
        js7 solarSystem = new js7();
        solarSystem.display();
        solarSystem.showE();
        solarSystem.showM();
    }
}
