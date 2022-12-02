import java.util.Scanner;

public class MainDinosaurus {
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1. Show Oviraptor");
        System.out.println("2. Show TyrannosaurusRex");
        System.out.println("3. Show Triceratops");
        System.out.println("4. Cara dinosaurus makan");
        System.out.println("5. Cara dinosaurus berjalan");
        System.out.println("6. Pemburuan anak pemburu");
        System.out.println("7. Quit program");
    }
    public static void main(String[] args) {
        Oviraptor ov = new Oviraptor();
        Triceratops tr = new Triceratops();
        TyrannosaurusRex ty = new TyrannosaurusRex();
        AnakPemburu ap = new AnakPemburu();

        int pilih = 0;
        try (Scanner input = new Scanner(System.in)) {
            do {
                System.out.println();
                menu();
                System.out.print("Pilih menu: ");
                pilih = input.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.println("======= Informasi Oviraptor =======");
                        ov.berjalan();
                        ov.bertelur();
                        ov.makan();
                        break;
                    case 2:
                        System.out.println("======= Informasi TyrannosaurusRex =======");
                        ty.berjalan();
                        ty.makan();
                        break;
                    case 3:
                        System.out.println("======= Informasi Triceratops =======");
                        tr.berjalan();
                        tr.makan();
                        break;
                    case 4:
                        System.out.println("======= Makanan Dinosaurus =======");
                        ov.makan();
                        ty.makan();
                        tr.makan();
                        break;
                    case 5:
                        System.out.println("======= Cara Berjalan Dinosaurus =======");
                        ov.berjalan();    
                        ty.berjalan();
                        tr.berjalan();
                        break;
                    case 6:
                        System.out.println("======= Berburu Dinosaurus =======");
                        ap.berburu(ty);
                        ap.mengambilTelur(ty);
                        break;
                    case 7:
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            } while (pilih==1 || pilih==2 || pilih==3 || pilih==4 || pilih==5 || pilih==6 || pilih==7);
        }   
    }
}
