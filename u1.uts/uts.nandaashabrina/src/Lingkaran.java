    public class Lingkaran extends Bola{
    public double r;
    public double phi = 3.14;

    public Lingkaran(){
    }

    public Lingkaran(double r, double phi){
        this.r = r;
        this.phi = phi;
    }

    public void setLr(double r){
        this.r = r;
    }

    public double getLr(){
        return r;
    }

    public void luasLingkaran(){
        luas = phi * r * r;
        // System.out.println("Luas lingkaran       : " + luas);
    }

    public void kelilingLingkaran(){
        keliling = 2 * phi * r;
        // System.out.println("Keliling lingkaran   : " + keliling);
    }
}