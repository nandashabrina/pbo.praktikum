// Nama : Nanda Shabrina Putri Kurnia
// Kelas: SIB-2E
// NIM  : 2141762064
// Absen: 14

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    public Gerbong(String kode, int jumlah){
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi(){
        for(int i=0 ; i<arrayKursi.length ; i++){
            this.arrayKursi[i] = new Kursi(String.valueOf(i+1));
        }
    }

    public void setKode(String kode){
        this.kode = kode;
    }

    public String getKode(){
        return kode;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
            if (arrayKursi[nomor - 1].getPenumpang() == null) {
                this.arrayKursi[nomor - 1].setPenumpang(penumpang);
                System.out.println("Data penumpang " + penumpang.getNama() + " berhasil ditambahkan");
            }else{
                System.out.println("Maaf " + penumpang.getNama() + " , kursi nomor " + nomor + " telah terisi, silakan pilih nomor kursi yang lain.");
            }
    }

    public String info(){
        String info = "";
        System.out.println();
        System.out.println("==== Informasi Gerbong ====");
        info += "Kode : " + kode + "\n";
        for(Kursi kursi : arrayKursi){
            info += kursi.info();
        }
        return info;
    }
}
