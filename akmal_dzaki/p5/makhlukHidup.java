package akmal_dzaki.p5;

interface buah {
    public void mthod();
}


interface hewan{
    public void mtthod();
}

class makhlukHidup implements hewan,buah{
    @Override
    public void mthod() {
        System.out.println("Ini adalah buah");
    }

    @Override
    public void mtthod() {
        System.out.println("Ini adalah hewan");
    }
}