/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan8;

abstract class Bio {
    protected String nama ="Jack";
    public void walk(){
        System.out.println("step step step!");
    }
}

public class js1 extends Bio {

    @Override
    public void walk(){
        System.out.print("step step step!");
        System.out.println(" walk away");
    }

    public static void main(String[] args) {
        js1 bd = new js1();

        System.out.println("Hii my name is "+bd.nama);
        System.out.println("See yaa...");
        
        bd.walk();
    }
}

