// Nama : Nanda Shabrina Putri Kurnia
// Kelas: SIB-2E
// NIM  : 2141762064
// Absen: 14

public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    public KeretaApi(String nama, String kelas, Pegawai masinis){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    public KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    // Setter dan getter untuk nama
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    // Setter dan getter untuk kelas
    public void setKelas(String kelas){
        this.kelas = kelas;
    }

    public String getKelas(){
        return kelas;
    }

    // Setter dan getter untuk masinis
    public void setMasinis(Pegawai masinis){
        this.masinis = masinis;
    }

    public Pegawai getMasinis(){
        return masinis;
    }

    // Setter dan getter untuk asisten
    public void setAsisten(Pegawai asisten){
        this.asisten = asisten;
    }

    public Pegawai getAsisten(){
        return asisten;
    }

    public String info(){
        String info = "";
        info += "Nama : " + this.nama + "\n";
        info += "Kelas : " + this.kelas + "\n";
        if(this.masinis != null){
            info += "Masinis : " + this.masinis.info() + "\n";
        }
        if(this.asisten != null){
            info += "Asisten : " + this.asisten.info() + "\n";
        }
        return info;
    }
}
