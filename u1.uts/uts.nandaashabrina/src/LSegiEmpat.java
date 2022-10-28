public class LSegiEmpat extends BangunRuang{

    public LSegiEmpat(){
    }    

    public void luasPermukaanLP(Persegi p, Segitiga sg){
        luasPermukaan = p.sisi * p.sisi * sg.a * sg.t * 4;
    }

    public void volumeLP(Persegi p, Segitiga sg){
        volume = p.sisi * p.sisi * sg.t / 3;
    }

    public void tampilL4(){
        System.out.println("Luas permukaan bola  : " + super.luasPermukaan);
        System.out.println("Volume bola          : " + super.volume);
    }
}
