// Nama : Nanda Shabrina Putri Kurnia
// Kelas: SIB-2E
// NIM  : 2141762064
// Absen: 14

public class Pegawai{
    private String nip;
    private String nama;

    public Pegawai(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }

    // setter dan getter untuk atribut nip
    public void setNIP(String nip){
        this.nip = nip;
    }

    public String getNIP(){
        return nip;
    }

    // setter dan getter untuk atribut nama
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public String info() {
        String info = "";
        info += "NIP  : " + this.nip + "\n";
        info += "Nama : " + this.nama + "\n";
        return info;
    }
}