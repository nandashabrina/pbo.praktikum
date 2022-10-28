public class LSegitiga extends BangunRuang{ 
    public LSegitiga(){
    }

    public void luasPermukaanLS(Segitiga s){
        luasPermukaan = s.a * s.t * 4 / 2;
    }

    public void volumeLS(Segitiga s){
        volume =  s.a * s.t * s.t /6;
    }

    public void show(Segitiga s){
        System.out.println("Luas segitiga       : " + s.luas);
        System.out.println("Keliling segitiga   : " + s.keliling);
        System.out.println("Luas permukaan bola : " + super.luasPermukaan);
        System.out.println("Volume bola         : " + super.volume);
    }
}
