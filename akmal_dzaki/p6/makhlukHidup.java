package akmal_dzaki.p6;

interface buah {
    public void mthod();
}


interface hewan{
    public void mtthod();
}

interface serangga{
    public void srga();
}

class makhlukHidup implements hewan,buah,serangga{
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