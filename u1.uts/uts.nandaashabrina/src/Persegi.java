public class Persegi extends Kubus{
    public double sisi;

    public Persegi(){
    }

    public Persegi(double sisi){
        this.sisi = sisi;
    }
    public void luasPersegi(){
        luas = sisi * sisi;
    }

    public void kelilingPersegi(){
        keliling = sisi * 4;
    }
}
