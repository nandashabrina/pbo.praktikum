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
        System.out.println("Singa merupakan hewan karnivora yang memakan daging");
    }

    @Override
    public void displayBinatang(){
        super.displayBinatang();
    }

    public void displayData(){
        System.out.println("Singa memiliki suara " + suara);
        System.out.println("Singa memiliki warna bulu " + warnaBulu);
    }
}
