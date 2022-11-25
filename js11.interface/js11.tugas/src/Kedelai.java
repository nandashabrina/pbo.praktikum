public class Kedelai extends Binatang implements IHerbivora{
    private String suara;
    private String warnaBulu;

    public Kedelai(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan(){
        System.out.println("Kedelai merupakan hewan herbivora yang memakan tumbuh - tumbuhan");
    }

    @Override
    public void displayBinatang(){
        super.displayBinatang();
    }

    public void displayData(){
        System.out.println("Kedelai memiliki suara " + suara);
        System.out.println("Kedelai memiliki warna bulu " + warnaBulu);
    }
}
