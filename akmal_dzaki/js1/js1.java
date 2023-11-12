package akmal_dzaki.js1;

public class js1 extends bio{

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