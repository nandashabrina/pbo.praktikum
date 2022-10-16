public class Pegawai {
    public Dosen dosen;
    public String nip;
    public String nama;
    public String alamat;

    public Pegawai(String nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNIP(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public int getGaji(){
        return 100000;
    }
}
