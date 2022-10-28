public class Segitiga extends LSegitiga{
    public double t;
    public double a;

    public Segitiga(){
    }

    public Segitiga(double t, double a){
        this.t = t;
        this.a = a;
    }

    public void luasSegitiga(){
       luas = a * t / 2;
    }

    public void kelilingSegitiga(){
        keliling =  a * 3;
    }
}
