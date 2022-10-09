// Nama : Nanda Shabrina Putri Kurnia
// Kelas: SIB - 2E
// NIM  : 2141762064
// Absen: 14

public class MainPercobaan1 {
    public static void main(String[] args) {
        //sebelum, cara 1
        // Processor p = new Processor("Intel i5", 3);
        // Laptop l = new Laptop("Thinkpad", p);

        //sesudah, cara 2
        Laptop l = new Laptop("Thinkpad", new Processor("Intel i5", 3));
        l.info();
        Processor p1 = new Processor();
        p1.setMerk("Intel i5");
        p1.setCache(4);
        Laptop l1 = new Laptop();
        l1.setMerk("Thinkpad");
        l1.setProc(p1);
        l1.info();
    }
}
