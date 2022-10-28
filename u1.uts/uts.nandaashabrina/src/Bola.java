public class Bola extends BangunRuang{
    public Bola(){
    }

    public void volumeBola(Lingkaran l){
        volume = 4/3 * l.phi * l.r * l.r * l.r;
    }

    public void luasPermukaanBola(Lingkaran l){
        luasPermukaan = l.phi * l.r * l.r * 4;
    }

    public void tampilLBola(Lingkaran l){
        System.out.println("Luas lingkaran       : " + l.luas);
        System.out.println("Keliling lingkaran   : " + l.keliling);
        System.out.println("Luas permukaan bola  : " + super.luasPermukaan);
        System.out.println("Volume bola          : " + super.volume);
    }
}
