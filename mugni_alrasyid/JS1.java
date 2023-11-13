package js1;

public class JS1 extends bio{

    @Override
    public void walk(){
        System.out.print("step step step!");
        System.out.println(" walk away");
    }
    public static void main(String[] args) {
        
        JS1 bd = new JS1();

        System.out.println("Hii my name is "+bd.nama);
        System.out.println("See yaa...");
        
        bd.walk();


    }
}