public class MainInterface {
    public static void main(String[] args) {
        Fiksi fiksi = new Fiksi("It Ends With Us", 384, 2016);
        SelfDev sDev = new SelfDev("The Art of Thinking Clearly", 326, 2014);
        
        System.out.println("===== Informasi Buku 1 =====");
        fiksi.namaPengarang();
        System.out.println();
        System.out.println("===== Informasi Buku 1 =====");
        sDev.namaPengarang();
        sDev.namaPenerbit();
        sDev.alamatPenerbit();      
    }
}
