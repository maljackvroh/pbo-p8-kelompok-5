package akmal_dzaki.p8;

interface macan {
    public void macann();
}

interface kucing {
    public void kucingg();
}

interface kumbang {
    public void kumbangg();
}
interface hiu {
    public void hiuu();
}
interface singa {
    public void singaa();
}
interface kamu {
    public void babi();
}

class hewan implements macan,kucing,kumbang,hiu,singa,kamu{
    @Override
    public void macann() {
        System.out.println("ini macan");
    }

    @Override
    public void kucingg() {
        System.out.println("ini kucing");
    }

    @Override
    public void kumbangg() {
        System.out.println("Ini kumbang");
    }

    @Override
    public void hiuu() {
        System.out.println("Ini hiu");
    }

    @Override
    public void singaa() {
        System.out.println("Ini singa :)");
    }

    @Override
    public void babi() {
        System.out.println("Ini bukan kamu yaa XD");
    }
}