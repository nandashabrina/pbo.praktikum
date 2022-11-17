import java.util.Scanner;

public class MainTest {
    public static void menu(){
        System.out.println("1. Tampilkan caption");
        System.out.println("2. Print buku kategori Ensiklopedia");
        System.out.println("3. Print buku kategori Fiksi");
        System.out.println("4. Keluar program");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        Ensiklopedia es = new Ensiklopedia();
        Fiksi fs = new Fiksi();
        
        do{
            menu();
        System.out.print("Pilih menu (1/2/3) : ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("============ Caption ============");
                es.printBuku();
                System.out.println();
                break;
            case 2:
                System.out.println("===== Kategori Ensiklopedia =====");
                es.judul();
                int hargaES = es.hitungHarga();
                System.out.println("Harga buku tersebut adalah " + hargaES);
                System.out.println();
                break;
            case 3:
                System.out.println("======== Kategori Fiksi ========");
                fs.judul();
                int hargaFS = fs.hitungHarga();
                System.out.println("Harga buku tersebut adalah " + hargaFS);
                System.out.println();
                break;
            case 4:
                System.out.println("================================");
                System.out.println("Berhasil keluar dari program");
                System.exit(0);
            default:
                break;
            }
        }while(choice>=1&&choice<=4);    
    }
}
