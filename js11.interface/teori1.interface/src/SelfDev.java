public class SelfDev extends Buku implements IPengarang, IPenerbit{
    public SelfDev(String judul, int jumlahHalaman, int tahunRilis){
        super(judul, jumlahHalaman, tahunRilis);
    }

    @Override
    public void namaPengarang(){
        System.out.println("- Buku " + super.judul +" ditulis oleh Rolf Dobelli");
    } 

    @Override
    public void namaPenerbit(){
        System.out.println("- Buku "+ super.judul + " dirilis pada tahun " + super.tahunRilis + " oleh New York Times");
    }

    @Override
    public void alamatPenerbit(){
        System.out.println("- New York Times, 620 Eighth Avenue");
    }
}
