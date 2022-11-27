public class Singa extends Binatang implements IKarnivora{
    private String suara;
    private String warnaBulu;

    public Singa(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan(){
        System.out.println("Jenis   : Karnivora");
        System.out.println("Makanan : Daging");
    }

    @Override
    public void displayBinatang(){
        System.out.println("Jenis : " + super.nama);
        System.out.println("Jumlah kaki : " + super.jmlKaki);
    }

    public void displayData(){
        System.out.println("Suara       : " + suara);
        System.out.println("Warna bulu  : " + warnaBulu);
    }
}
