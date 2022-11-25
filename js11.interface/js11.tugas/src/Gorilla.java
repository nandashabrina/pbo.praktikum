public class Gorilla extends Binatang implements IKarnivora, IHerbivora{
    private String suara;
    private String warnaBulu;

    public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan(){
        System.out.println("Gorilla merupakan hewan karnivora dan herbivora yang baik memakan daging - dagingan maupun tetumbuhan.");
    }

    @Override
    public void displayBinatang(){
        super.displayBinatang();
    }

    public void displayData(){
        System.out.println("Gorilla memiliki suara " + suara);
        System.out.println("Gorilla memiliki warna bulu " + warnaBulu);
    }
}
