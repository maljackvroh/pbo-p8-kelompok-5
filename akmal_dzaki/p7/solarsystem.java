package akmal_dzaki.p7;

abstract class sun {
    public void display(){
        System.out.println("Ini adalah pusat solarsystem");
    }
}


interface earth{
    public void showE();
}

interface mars{
    public void showM();
}


public class solarsystem extends sun implements earth,mars{
    public void display(){
        System.out.println("Ini adalah matahari");
    }

    @Override
    public void showE(){
        System.out.println("ini adalah implementasi bumi");
    }

    @Override
    public void showM() {
        System.out.println("ini adalah implemtasi mars");
    }
}