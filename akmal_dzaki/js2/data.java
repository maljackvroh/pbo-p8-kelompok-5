package akmal_dzaki.js2;

abstract class data {
    protected int panjang;
    protected int lebar;
    int hasil;

    public int luas(int p, int l){
        this.panjang = p;
        this.lebar = l;

        // int hasil = p*l;
        return hasil;
    }
}
