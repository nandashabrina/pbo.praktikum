public class Fiksi extends Buku implements IPengarang{
    public Fiksi(String judul, int jumlahHalaman, int tahunRilis){
        super(judul, jumlahHalaman, tahunRilis);
    }

    @Override
    public void namaPengarang(){
        System.out.println("- Buku " + super.judul +" ditulis oleh Colleen Hoover");
    }
}
