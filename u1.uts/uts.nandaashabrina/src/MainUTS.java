public class MainUTS {
    public static void main(String[] args) {
        BangunRuang br = new BangunRuang();
        br.show();

        Lingkaran lr = new Lingkaran();
        lr.r = 10;
        lr.luasLingkaran();
        lr.kelilingLingkaran();
        
        Bola bl = new Bola();
        bl.luasPermukaanBola(lr);
        bl.volumeBola(lr);
        bl.tampilLBola(lr);

        System.out.println();
        Segitiga sg =  new Segitiga();
        sg.a = 10;
        sg.t = 10;
        sg.luasSegitiga();
        sg.kelilingSegitiga();

        LSegitiga ls = new LSegitiga();
        ls.luasPermukaanLS(sg);
        ls.volumeLS(sg);
        ls.show(sg);

        System.out.println();
        Persegi pr = new Persegi();
        pr.luasPersegi();
        pr.kelilingPersegi();

        Kubus kb = new Kubus();
        kb.luasPermukaanKubus(pr);
        kb.volumeKubus(pr);
        kb.tampilLKubus(pr);

        LSegiEmpat l4 = new LSegiEmpat();
        l4.luasPermukaanLP(pr, sg);
        l4.volumeLP(pr, sg);
        l4.tampilL4();
    }
}
