public class Kubus extends BangunRuang{
    public Kubus(){
    }

    public void volumeKubus(Persegi p){
        volume = (p.sisi * p.sisi * p.sisi);
    }

    public void luasPermukaanKubus(Persegi p){
        luasPermukaan = (p.sisi * p.sisi * 6);
    }

    public void tampilLKubus(Persegi p){
        System.out.println("Luas persegi               : " + p.luas);
        System.out.println("Keliling persegi           : " + p.keliling);
        System.out.println("Luas permukaan kubus       : " + super.luasPermukaan);
        System.out.println("Volume limas kubus         : " + super.volume);
    }
}
