// Nama : Nanda Shabrina Putri Kurnia
// Kelas: SIB-2E
// NIM  : 2141762064
// Absen: 14

public class Penumpang {
    private String ktp;
    private String nama;

    public Penumpang(String ktp, String nama){
        this.ktp = ktp;
        this.nama = nama;
    }

    public void setKTP(String ktp){
        this.ktp = ktp;
    }

    public String getKTP(){
        return ktp;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public String info(){
        String info = "";
        info += "KTP : " + ktp + "\n";
        info += "Nama : " + nama + "\n";
        return info; 
    }
}
