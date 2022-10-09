// Nama : Nanda Shabrina Putri Kurnia
// Kelas: SIB-2E
// NIM  : 2141762064
// Absen: 14

public class Kursi {
    private String nomor;
    private Penumpang penumpang;

    public Kursi(String nomor){
        this.nomor = nomor;
    }

    public void setNomor(String nomor){
        this.nomor = nomor;
    }

    public String getNomor(){
        return nomor;
    }

    public void setPenumpang(Penumpang penumpang){
        this.penumpang = penumpang;
    }

    public Penumpang getPenumpang(){
        return penumpang;
    }

    public String info(){
        String info = "";
        info += "Nomor : " + nomor + "\n";
        if(this.penumpang != null){
            info += "Penumpang : " + penumpang.info() + "\n";
        }
        return info;
    }
}
