package studi_kasus;

interface tambah{
    public double tambah(double a, double b);
}

interface kali{
    public double kali(double a, double b);
}

interface kurang{
    public double kurang(double a, double b);
}

interface bagi{
    public double bagi(double a, double b);
}

interface pangkat{
    public double pangkat(double a, double b);
}

interface akar{
    public double akar(double a);
}

class proces implements tambah,kali,kurang,akar,bagi,pangkat{
    @Override
    public double tambah(double a, double b){
        double hasil = a + b;
        return hasil;
    }

    @Override
    public double kurang(double a, double b){
        double hasil = a - b;
        return hasil;
    }

    @Override
    public double kali(double a, double b){
        double hasil = a * b;
        return hasil;
    }

    @Override
    public double bagi(double a, double b){
        double hasil = a / b;
        return hasil;
    }

    @Override
    public double pangkat(double a, double b){
        double hasil=1;

        for (int i = 0; i<b;i++){
            hasil = hasil * a;
        }

        return hasil;
    }

    @Override
    public double akar(double a){
        double hasil = Math.sqrt(a);
        return hasil;
    }

    
}
