package akmal_dzaki.ac;

class car implements Engine, Transmission, Brakes, Radio {
    public void mesinOn() {
        System.out.println("Mesin Menyala");
    }

    public void mengubahGigi(int gear) {
        System.out.println("Mengubah gigi ke " + gear);
    }

    public void ngerem() {
        System.out.println("Ngeremm...");
    }

    public void nyalakanRadio() {
        System.out.println("Radio Dinyalakan");
    }
}